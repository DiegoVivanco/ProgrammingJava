package Ejercicios;

public class Ejercicio1 {
	/*Escribe un programa que almacene en un Array de cinco elementos 
	 * las ventas anuales de cada una de las cinco tiendas de una cadena
	 * de supermercados (asígnaselos al Array al declararlo). 
	 * A continuación calcular cuál fue la tienda que menos vendió, 
	 * cuál fue la que más vendió y el importe total de ventas de las 
	 * cinco tiendas.*/

	public static void main(String[] args) {
        double[] ventas = {8000, 320.35, 930, 1020.99, 650};
        double mayor = 0;
        double menor = 0;
        double total = 0;
        int posicionMayor = 0;
        int posicionMenor = 0;
        mayor = ventas[0];
        menor = ventas[0];
        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > mayor) {
                mayor = ventas[i];
                posicionMayor = i;
            }
            if (ventas[i] < menor) {
                menor = ventas[i];
                posicionMenor = i;
            }
            total += ventas[i];
        }
        System.out.println("La tienda que menos ha vendido fue la " + (posicionMenor + 1) + ", que vendió " + menor + " €");
        System.out.println("La tienda que mas ha vendido fue la " + (posicionMayor + 1) + ", que vendió " + mayor + " €");
        System.out.println("El total de las ventas es: " + total + " €");
    }
		// TODO Auto-generated method stub

	}


