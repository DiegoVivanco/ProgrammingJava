package hora;

import hora.Hora;
public class MainHora {
	public static void main(String[] args) {
		Hora hora = new Hora(10,20,30);
		if ( hora.getHoras().equals("[10, 20, 30]")){
			System.out.print("Ok");
		}
		else {
			System.out.print("Fail");
		}
	
		
		
		// Caso test sobre las Horas
		int[] Correctos = {10,20,11,22,14,15,16,17};
		int[] Incorrectos = {60,55,66,56,-2,-2,-6,-5};
		
		int contador = 1;
		for (int i=0; i < Correctos.length; i++){
			if (hora.setHora(Correctos[i]) == true){
				System.out.println("Horas " + contador + ": " + Correctos[i] + " es correcto");
				contador++;
			}
			else {
				System.out.println("Horas " + contador + ": " + Correctos[i] + " NO es correcto");
				contador++;
			}
		}
		for (int j=0; j < Incorrectos.length; j++){
			if (hora.setHora(Incorrectos[j]) == true){
				System.out.println("Horas " + contador + ": " + Incorrectos[j] + " es correcto");
				contador++;
			}
			else {
				System.out.println("Horas " + contador + ": " + Incorrectos[j] + " NO es correcto");
				contador++;
			}
		}
		

	
	System.out.println();
	
	

		// Caso test sobre las Minutos
		int[] Correctos1 = {10,20,11,22,14,15,16,17};
		int[] Incorrectos1 = {66,85,66,96,-2,-2,-6,-5};
		
		int contador1 = 1;
		for (int i=0; i < Correctos1.length; i++){
			if (hora.setMinutos(Correctos1[i]) == true){
				System.out.println("Minutos " + contador1 + ": " + Correctos1[i] + " es correcto");
				contador1++;
			}
			else {
				System.out.println("Minutos " + contador1 + ": " + Correctos1[i] + " NO es correcto");
				contador1++;
			}
		}
		for (int j=0; j < Incorrectos1.length; j++){
			if (hora.setMinutos(Incorrectos1[j]) == true){
				System.out.println("Minutos " + contador1 + ": " + Incorrectos1[j] + " es correcto");
				contador1++;
			}
			else {
				System.out.println("Minutos " + contador1 + ": " + Incorrectos1[j] + " NO es correcto");
				contador1++;
			}
		}
	
	
	System.out.println();
	
			// Caso test sobre los segundos
			int[] Correctos2 = {10,20,11,22,14,15,16,17};
			int[] Incorrectos2 = {66,85,66,96,-2,-2,-6,-5};
			
			int contador2 = 1;
			for (int i=0; i < Correctos1.length; i++){
				if (hora.setSegundos(Correctos2[i]) == true){
					System.out.println("Segundos " + contador2 + ": " + Correctos2[i] + " es correcto");
					contador2++;
				}
				else {
					System.out.println("Segundos " + contador2 + ": " + Correctos2[i] + " NO es correcto");
					contador2++;
				}
			}
			for (int j=0; j < Incorrectos1.length; j++){
				if (hora.setSegundos(Incorrectos2[j]) == true){
					System.out.println("Segundos " + contador2 + ": " + Incorrectos2[j] + " es correcto");
					contador2++;
				}
				else {
					System.out.println("Segundos " + contador2 + ": " + Incorrectos2[j] + " NO es correcto");
					contador2++;
				}
			}
		
		hora.horaCorrecta();

		}
	}
