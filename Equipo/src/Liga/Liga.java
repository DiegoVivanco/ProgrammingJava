/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Liga;

import utilities.In;
import utilities.Out;
import Equipos.Equipos;
import GRandom.Grandom;
import java.util.Arrays;

/**
 *
 * @author pau
 */
public class Liga {
//variables

    In i = new In();
    Out o = new Out();
    Equipos[] e1 = new Equipos[20];
    Grandom r = new Grandom();
    String message = "";
    Equipos ee;
    boolean salir = false;
    int opcion;

    public Liga() {
        listaeq();
        menut();
    }//menu

    private void listaeq() {

        for (int i = 0; i < e1.length; i++) {
            e1[i] = ee = new Equipos(i);
        }

    }// todos los datos de todos los equipos inicializados

    private void mostrareq() {
        int n;
        message = "que equipo quieres ver introduce un numero del 1 al 20";
        o.printS(message);
        System.out.println("\n");
        n = i.readI();
        e1[n - 1].printeq();
    }// mostrar equipos

    private void jornada() {

        int a = 0;// goles de a
        int b = 0;//goles de b
        int cont = 19;
        for (int j = 0; j < 10; j++) {
            a = r.gNumR(5);
            b = r.gNumR(5);
            System.out.println(e1[j].getNom() + " vs " + e1[cont].getNom());
            System.out.println("----------------goles------------------");
            System.out.println(a + "-" + b);
            System.out.println("\n");
            // comprobar quien gana y dar los puntos correspondientes
            if (a > b) {
                e1[j].meterpuntos(3);
                e1[cont].meterpuntos(0);

            }
            if (a == b) {
                e1[a].meterpuntos(1);
                e1[cont].meterpuntos(1);

            }
            if (a < b) {
                e1[a].meterpuntos(0);
                e1[cont].meterpuntos(3);

            }
            cont--;
        }

    }// partidos jugados al azar

    private void menu() {
        message = "1: mostrar un equipo en concreto con sus jugadores y puntuaciones.";
        o.printS(message);
        message = "2: hacer la jornada de football.";
        o.printS(message);
        message = "3: ranking equipos.";
        o.printS(message);
        message = "4: salir.";
        o.printS(message);
        //capturo la respuesta de  la opcion que quiere el usuario
        opcion = i.readI();
    }

    private void menut() {
        do {
            menu();
            switch (opcion) {
                case 1:
                    mostrareq();
                    break;
                case 2:
                    jornada();
                    break;
                case 3:
                    ranking();
                    ranking1();
                    break;
                case 4:
                    salir = true;
                    break;

                default: {
                    message = "la opcion introducida es erronea";
                    o.printS(message);

                }

            }
        } while (!salir);
    }// trata el menu mostrado

    private void ranking() {
         Equipos temp;
        
       
        for (int i = 1; i < e1.length; i++) {
            for (int j = 0; j < e1.length - 1; j++) {
                if (e1[j].getPuntos() < e1[j + 1].getPuntos()) {
                    temp = e1[j];
                    e1[j] = e1[j + 1];
                    e1[j + 1]= temp;
                   
                }
            }
        }
}
    
    private void ranking1(){
        message = "-------------------ranking----------";
        o.printS(message);
        for (int j = 0; j < e1.length; j++) {
            message = j + 1 + "- " + e1[j].getNom() + " -p:" + e1[j].getPuntos();
            o.printS(message);
        }

    }
}
