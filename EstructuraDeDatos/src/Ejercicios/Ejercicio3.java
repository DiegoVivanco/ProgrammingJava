package Ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
	/*Asigna a un Array 30 números enteros comprendidos entre 1 y 20. 
	Muestra en consola el contenido del Arrayordenado de menor a mayor. 
	Utilizar el método sort de la clase Arrays.*/
	
    public static void main(String[] args) {
        int[] vector = new int[30];
        Random aleatorio = new Random();

        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(20) + 1;
        }

        Arrays.sort(vector);
        for (int numero : vector) {
            System.out.println(numero);
        }
    }

}
