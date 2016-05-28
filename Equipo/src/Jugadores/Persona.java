/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;

import utilities.*;
import GRandom.Grandom;

/**
 *
 * @author pau
 */
public class Persona {

    //genericos
    Grandom r = new Grandom();
    In i = new In();
    Out o = new Out();
    //---------------variables
    private String message;
    protected String nombre;
    protected String dni;
    protected String direccion;
    private String soy;// hombre o mujer
    protected int edad;
    protected String nacionalidad;
    String[] a = {"Delantero", "Defensa", "Portero", "Central", "suplente"};
    String rol;
    int pos;
    private Entrenamiento e;

    private Entrenamiento[] e2 = new Entrenamiento[20];// crea entrenamientos para cada jugador

    public Persona() {// mostrar

        print();

    }//mostrar

    public Persona(int i) {
        this.nombre = r.gNamer();
        hom();
        dni = r.gdni();
        this.edad = r.gdate();
        rol = a[r.gNumR(5)];
        this.nacionalidad = r.gcountry();
        this.direccion = r.gdirecc();
        e2[i] = e = new Entrenamiento();
        pos = i;
    }// inicializar

    private void hom() {

        if (r.gNumR(2) == 1) {
            soy = "hombre";
        } else {
            soy = "mujer";
        }

    }// hombre o mujer

    public void print() {//to string a mano
        String message;
        message = "nombre: " + nombre;
        o.printS(message);
        message = "nacionalidad: " + nacionalidad;
        o.printS(message);
        message = "sexo: " + soy;
        o.printS(message);
        message = "dni: " + dni;
        o.printS(message);
        message = "edad: " + edad;
        o.printS(message);
        message = "rol: " + rol;
        o.printS(message);
        message = "direccion: " + direccion;
        o.printS(message);
        message = "Entrenamiento cardio: " + e2[pos].getCar2();
        o.printS(message);
        message = "Dieta: " + e2[pos].getAlimentacion2();
        o.printS(message);
        message = "horas de descanso: " + e2[pos].getFiso_desc2();
        o.printS(message);
        message = "horas de fisio: " + e2[pos].getFs2();
        o.printS(message);
        message = "ejercicio tecnico: " + e2[pos].getTec2();
        o.printS(message);
        message = "\n";
        o.printS(message);

    }// imprimir todos los datos de los valores de los  jugadores

}
