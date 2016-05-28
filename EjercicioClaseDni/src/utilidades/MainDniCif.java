package utilidades;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
import Dni.DniCif;

public class MainDniCif {

	public static void main(String[] args) {
		//Casos test de la parte Expresión Regular
		DniCif objetoDniCif = new DniCif(null);

		
		String[] dniCifCorrecto = {
				"78484464T","72376173A","01817200Q","95882054E","63587725Q",
				"26861694V","21616083Q","26868974Y","40135330P","89044648X",
				"Y9467661R","Y7617719H","Z1249293F","X2369958S","X8687291F",
				"X3554131X","Z3570200F","Y0701345C","Y8407854B","Z0248924T"
				};
		
		String[] dniCifIncorrecto = {
				"01191235I","367292815","98945232","90035056O","2983580EE",
				"62574546a","82274466Ñ","531841E","93311184U","23710741Ñ",
				"H5145755Q","J4877825E","X8796634","Y9030132Ñ","Y8782A",
				"X8561534Ñ","p7900916F","X0318637I","X09476940","X5133230Ñ"
				};{
		
		
		for (int i=0; i < dniCifCorrecto.length; i++){
			if (objetoDniCif.CheckDNI(dniCifCorrecto[i]) == true) {
				System.out.println("El Dni: " + dniCifCorrecto[i] + " es correcto.");
			}
		}
		
		for (int j=0; j < dniCifIncorrecto.length; j++){
			if (objetoDniCif.CheckDNI(dniCifIncorrecto[j]) == false) {
				System.out.println("El Dni: " + dniCifIncorrecto[j] + " es incorrecto.");
			}
		}

	}
		int numeroCasos = 25;
		String caso;
		
		ArrayList<String> casosTest = new ArrayList<String>();
		
		for(int i = 1; i <= numeroCasos; i++){
			caso = "";
			for(int j = 1; j < 9; j++){
				Integer caracterAscii = ThreadLocalRandom.current().nextInt(48, 59); // 58 excluido
				caso = caso + String.valueOf( Character.toChars(caracterAscii) );
			}
			Integer caracterAscii = ThreadLocalRandom.current().nextInt(65, 91);
			caso = caso + String.valueOf( Character.toChars(caracterAscii) );
			casosTest.add(caso);
		}
		
		System.out.println("\n ***** Casos Test FAIL generados random ***** \n");
		
		for ( String casoTest : casosTest ){
			System.out.println(casoTest);
		}
		
		System.out.println("\n ***** Casos Test FAIL ***** \n");
		
		for(String dni : casosTest){
			DniCif objetoDniCif1 = new DniCif(dni);
			System.out.println(objetoDniCif1.getDni());
			
			objetoDniCif1.checkCIF();
			
			System.out.println("dni --> " + objetoDniCif1.getNumeroSano());
			System.out.println("letra --> " + objetoDniCif1.getLetraSana());
			System.out.println("La letra es --> " + objetoDniCif1.obtenerLetra());
		}
		
		String[] casosTestPass = { //casos OK
		 		"78484464T","72376173A","01817200Q","95882054E","63587725Q",
		 		"26861694V","21616083Q","26868974Y","40135330P","89044648X",
		 		"80117501Z","34168723S","76857238R","66714505S","66499420A"};
		
		System.out.println("\n ***** Casos Test PASS ***** \n");
		
		for(String dni : casosTestPass){
			DniCif objetoDniCif1 = new DniCif(dni);
			System.out.println(objetoDniCif1.getDni());
			
			objetoDniCif1.checkCIF();
			
			System.out.println("dni --> " + objetoDniCif1.getNumeroSano());
			System.out.println("letra --> " + objetoDniCif1.getLetraSana());
			System.out.println("La letra es --> " + objetoDniCif1.obtenerLetra());
		}
		

	}
	


}