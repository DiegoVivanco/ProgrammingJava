/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

/**
 *
 * @author pau
 */
public class Garray {

    private Object[] element; //se crea un array vacio de object[] sin  inicializar llamado element

    public Garray(int size) {
        element = new Object[size];// se inicializa un object[] llamado element que tiene size espacios;
    } //costructor

    public int size() {
        return element.length;
    }// muestra la longitud del array

    public void print() {
        for (int i = 0; i < element.length; i++) {
            if (element[i] != null) {
                System.out.println("Vector[" + i + "]=" + element[i]);
            }
        }
    }// muestra los datos de el array

    public boolean put(Object element2, int position) {// se crea un objeto llamado element2 que se guarda dentro de element
        boolean in = (position >= 0) && (position < this.element.length);// comprobacion de rango 
        if (in) {
            element[position] = element2;// guardar datos en el objeto element 2
            System.out.println("el elemento se ha introducido completamente");
        } else {
            System.out.println("el elemento no se ha introducido correctamente, vuelve a comprobar el rango");
        }
        return in;
    }//este metodo guarda dentro del array los datos introducidos directamente

    public Object obtain(int position) {
        Object element = null;// se inicializa vacio
        boolean in = (position >= 0) && (position < this.element.length);// comprobacion de rango 
        if (in) {
            element = this.element[position];// guarda lo que se quiere mostrar en element (local) que posteriormente se usara en el return
        }
        return element;
    }// muestro el contenido de la posicion seleccionada del array de objetos 
}
