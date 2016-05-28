/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equipos;

import Jugadores.Persona;
import GRandom.Grandom;

/**
 *
 * @author pau
 */
public class Equipos {

    //random
    Grandom r = new Grandom();
    // nombres equipos
    String[] name2 = {"alzaromero", "barça", "madrid", "los isotopos nucleares", "dinosaurios anglocanticos", "alejandrinos voleanos", "telecoco", "asdf",//8
        "syka bylat", "la cucaracha mariachi", "los narzis(os)", "hamburguesas veganas", "shashas greys", "norigami", "Bizcochos de oro", "american pie", "deadpool", "kingdom hearts", "x-men", "Zopencos"};
    //nombre estadio
    String[] name = {"plaza alzaromero", " estadio barça", " castillo madrid", " bocata los isotopos nucleares", "narzisos dinosaurios anglocanticos", " lateral alejandrinos voleanos", "telemierda telecoco", "asdf",//8
        "estadio nacional syka bylat", "estadio representativo la cucaracha mariachi", " palazio los narzis(os)", "castillo hamburguesas veganas", "avanzada shashas greys", " georgianosnorigami",
        "horno Bizcochos de oro", " horno american pie", "piscina deadpool", " reino kingdom hearts", "mutant stadium x-men", "zapatero Zopencos"};
//varables
    String nom, procedencia, nomEstadio;
    int colocacion;
    Persona[] j = new Persona[20];
    Persona p;
    int puntos = 0;

    public Equipos(int n) {
        nom = name2[n];
        procedencia = r.gcountry();
        nomEstadio = name[n];
        for (int i = 0; i < j.length; i++) {

            j[i] = p = new Persona(i);

        }
    }//crea un grupo para inicializar

    //equipos
    public void printeq() {// to string a mano para saber como se hace
        System.out.println("equipo: " + nom);
        System.out.println("procedencia: " + procedencia);
        System.out.println("nombre de estadio: " + nomEstadio);
        System.out.println("puntos totales: " + puntos);
        System.out.println("\n");
// for para mostrar los jugadores
        for (int i = 0; i < j.length; i++) {
            System.out.print("jugador" + (i + 1) + ":" + "\n");
            j[i].print();

        }
    }
    

    public void meterpuntos(int n) {
        puntos += n;// puntos del equipo 
    }

    public String getNom() {
        return nom;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }
}
