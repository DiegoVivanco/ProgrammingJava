package Ejercicios;

import java.util.Random;

public class Ejercicio5 {
	 /*Escribe un programa que asigne números a una matriz de orden 4x5, 
	 comprendidos entre 1 y 10. El programa ha de almacenar la suma de los
	 elementos de cada fila en un Array de 4 posiciones y la suma de los 
	 elementos pares de cada columna en un Array de 5 posiciones.*/
	
	
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int[][] matriz = new int[4][5];
        int numero;
        int[] sumaFilas = { 0, 0, 0, 0 };
        int[] sumaPares = { 0, 0, 0, 0, 0 };

        // doy valores a la tabla y la escribo en pantalla
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                numero = aleatorio.nextInt(10) + 1;
                matriz[i][j] = numero;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(" ");
        // recorremos la tabla y calculamos la suma de cada fila
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                sumaFilas[i] += matriz[i][j];
            }
        }
        System.out.println(" ");
        for (int i = 0; i < sumaFilas.length; i++) {
            System.out.println("La Suma de los elementos de la fila  "
                    + (i + 1) + " : " + sumaFilas[i]);
        }
        // recorremos la tabla por columnas
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 4; i++) {
                if (matriz[i][j] % 2 == 0) {
                    sumaPares[j] += matriz[i][j];
                }
            }
        }
        for (int i = 0; i < sumaPares.length; i++) {
            System.out.println("La Suma de los elementos pares de la columna  "
                    + (i + 1) + " : " + sumaPares[i]);
        }
    }

}
