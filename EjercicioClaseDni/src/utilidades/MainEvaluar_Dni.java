package utilidades;

import Dni.Evaluar_Dni;

public class MainEvaluar_Dni {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Evaluar_Dni testDNI = new Evaluar_Dni();
		
		String[] listaDNICorrecto = {
				"78484464T","72376173A","01817200Q","95882054E","63587725Q",
				"26861694V","21616083Q","26868974Y","40135330P","89044648X"
				};
		
		String[] listaDNIIncorrecto = {
				"78484464O","72376173Ñ","01817200f","958820"   ,"sa3587725",
				"26861694I","21616083a","268689747","4013533sg","X89044648"
				};
		int contadorDNI = 1;
		for (int i=0; i < listaDNICorrecto.length; i++){
			if (testDNI.CheckDNI(listaDNICorrecto[i]) == true){
				System.out.println("El DNI numero " + contadorDNI + ": " + listaDNICorrecto[i] + " es correcto");
				contadorDNI++;
			}
			else {
				System.out.println("El DNI numero " + contadorDNI + ": " + listaDNICorrecto[i] + " NO es correcto");
				contadorDNI++;
			}
		}
		for (int j=0; j < listaDNIIncorrecto.length; j++){
			if (testDNI.CheckDNI(listaDNIIncorrecto[j]) == true){
				System.out.println("El DNI numero " + contadorDNI + ": " + listaDNIIncorrecto[j] + " es correcto");
				contadorDNI++;
			}
			else {
				System.out.println("El DNI numero " + contadorDNI + ": " + listaDNIIncorrecto[j] + " NO es correcto");
				contadorDNI++;
			}
		}

	}

}
