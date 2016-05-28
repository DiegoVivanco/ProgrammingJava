package strings;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainCodigoBase {

	public static void main(String[] args) {
		// Expresi�n regular para validar DNI OR NIE
		
		String regex = "(^\\d{8}[A-Z&&[^IÑOU]])|(^[XYZ]\\d{7}[A-Z&&[^IÑOU]])";
		
		/* Caso test b�sico: debe mostrar el mensaje en consola:
		 * "No se ha encotrado el patr�n en " 
		 * o PASS
		 * */

		// caso test: NIE incorrecto
		
		String dni = "X12345678L";
		
		// Compilamos la expresi�n regular (creamos el patr�n)
		
		Pattern patron = Pattern.compile(regex);
		
		// Creamos el objeto matcher donde buscar la expresi�n regular (el patr�n) 
		
		Matcher matcher = patron.matcher(dni);
		
		System.out.println( matcher );
		
		// find() devuelve true si encuentra el patr�n en el matcher.
		
		if(matcher.find()){
				 System.out.println( dni + " PASS");
		}
		else System.out.println( "No se ha encotrado el patr�n en " + dni); 
		
		
		
		/* Casos test PASS */
		
		System.out.println("\n **** Casos test DNI PASS **** \n"); 
		
		String[] casosTest = { // casos DNI PASS
		 		"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		 		"26861694V","21616083Q","26868974Y","40135330P","89044648X",
		 		"80117501Z","34168723S","76857238R","66714505S","66499420A",
		 		// casos NIE PASS
		 		"X1234567T", "Y1234567T", "Z1234567T",
		 		// casos NIE FAIL
		 		"J1234567T", "H1234567T", "R1234567T",
		 		"X12345678X", "X1234T", "X1234567I"
		 		};
		
		for(String caso : casosTest){
			
			// Genero un objeto matcher para cada caso test
			
			Matcher match = patron.matcher(caso);
			
			if(match.find()){
				
				 // group() extrae el string que satisface la expresi�n regular del patr�n  
				
				 String cadenaMatchingRegex = match.group();
				 
				 // Si el string que ha hecho matching con la expresi�n regular es igual al caso test =>
				 // => hemos pasado el caso test
				 
				 if(cadenaMatchingRegex == caso){
					 System.out.println(cadenaMatchingRegex + " PASS");
				 }
				 else System.out.println(cadenaMatchingRegex + " FAIL");
			}
			else System.out.println( "No se ha encotrado el patr�n en " + caso ); 
			
		}
		
		/* test casos FAIL - utilizando ArrayList de Strings */
		
		// casos test DNI FAIL
		
		System.out.println("\n **** Casos test DNI FAIL **** \n"); 

		char[] letrasNoPermitidas = {'I', '�', 'O', 'U'};
		int numeroCasos = 15;
		String caso;

		ArrayList<String> casosTestFail = new ArrayList<>();

		// generamos los casos test y los a�adimos al ArrayList
		for(int i = 1; i <= numeroCasos; i++){
			caso = "";
			for(int j = 1; j < 9; j++){
				Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 58); // 58 excluido
				caso = caso + String.valueOf( Character.toChars(caracterAscii) );
			}
			caso = caso + letrasNoPermitidas[ ThreadLocalRandom.current().nextInt(0, 4) ];
			casosTestFail.add(caso);
		}

		for(String casoFail : casosTestFail){

			Matcher match = patron.matcher(casoFail);

			if(match.find()){
				String cadenaMatchingRegex = match.group();
				if(cadenaMatchingRegex == casoFail){
					System.out.println(cadenaMatchingRegex + " PASS");
				}
				else System.out.println(cadenaMatchingRegex + " FAIL");
			}
			else System.out.println( casoFail + " FAIL"); 

		}

		
		// casos test NIE FAIL
		
		System.out.println("\n **** Casos test NIE FAIL **** \n"); 

		char[] letrasNIEPermitidas = {'X', 'Y', 'Z'};

		ArrayList<String> casosTestFailNIE = new ArrayList<>();

		// generamos los casos test y los a�adimos al ArrayList
		for(int i = 1; i <= numeroCasos; i++){
			caso = "" + letrasNIEPermitidas[ ThreadLocalRandom.current().nextInt(0, 3) ];
			for(int j = 1; j < 8; j++){
				Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 58); // 58 excluido
				caso = caso + String.valueOf( Character.toChars(caracterAscii) );
			}
			caso = caso + letrasNoPermitidas[ ThreadLocalRandom.current().nextInt(0, 4) ];
			casosTestFailNIE.add(caso);
		}

		for(String casoFail : casosTestFailNIE){

			Matcher match = patron.matcher(casoFail);

			if(match.find()){
				String cadenaMatchingRegex = match.group();
				if(cadenaMatchingRegex == casoFail){
					System.out.println(cadenaMatchingRegex + " PASS");
				}
				else System.out.println(cadenaMatchingRegex + " FAIL");
			}
			else System.out.println( casoFail + " FAIL"); 
		}	

	}


}
