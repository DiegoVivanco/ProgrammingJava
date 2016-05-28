/*
 * que pasaria si pinocho dice : me va a crecer la nariz....

 */
package gestionmultas;

import Coches.RegistroDatos;
import java.util.ArrayList;

/**
 *
 * @author pau
 */
public class GestorDeMultas {

    Lecturas i = new Lecturas();// clase de br
    public final double maxVel = 120;//maxima velocidad
    public final int maxArray = 100;// maximo tamaño del array
    ArrayList<RegistroDatos> listaCoches;// creacion de la lista de Registros
    public int pos;// posicion buscada por ultima vez
    public int opcion;//opcion del menu
    public boolean salir = false;
/*  costructor principal */
    public GestorDeMultas() {
        listaCoches = new ArrayList<RegistroDatos>();// inicializacion del array
        menut();// menu principal
    }

    public void menu() {// texto del menu
        System.out.println("1: Introducir registro de entrada");
        System.out.println("2: Introducir registro de salida y comprobar si tiene multa");
        System.out.println("3: Buscar en el registro de vehiculos");
        System.out.println("4: salir");
        opcion = i.reai();//capturar respuesta del usuario

    }
/* menu principal*/
    public void menut() {
        menu();
        do {

            switch (opcion) {
                case 1:
                    entrada();
                    break;
                case 2:
                    salida();
                    break;
                case 3:
                    mostrar();
                    break;
                case 4:
                    salir = true;
                    break;

                default:// si saliera de rango se iria aqui
                    System.out.println("no ha introducido uno de los valores validos introduza uno por favor");
            }
        } while (!salir);// hasta que no cambie la variable salir

    }
/* introduccion de datos  de entrada (los iniciales)  */
    public void entrada() {
        String matricula;
        double hentrada;
        double kilometrosi;
        double zonao;

        String letra;
        System.out.println("introduzca la matricula");
        matricula = i.readS();

        if (buscar(matricula) == false) {

            System.out.println("introduzca la hora de entrada");
            hentrada = i.readd();
            System.out.println(" introduzca la velocidad");
            kilometrosi = i.readd();
            System.out.println(" introduzca zona de entrada en km");
            zonao = i.readd();
            RegistroDatos coche = new RegistroDatos(matricula, hentrada, kilometrosi, zonao);
            if (listaCoches.size() <= maxArray) {
                listaCoches.add(coche);
            } else {
                listaCoches.remove(0);// limpia la primera posicion
                listaCoches.add(coche);
            }
            System.out.println("quieres seguir itroduciendo S/N");
            letra = i.readS();
            if (letra == "s") {
                entrada();
            } else {
                menut();
            }
        } else {
            System.out.println("la matricula introducida esta registrada, por favor introduzca otra matricula");

        }

    }//listo
/* introduccion de datos  de salida y comprueba si tiene multa
    si tiene se muestra  y si no se avisa de que no tiene problema
    aparte de borrar los registros*/
    public void salida() {

        String matricula;
        double hsaldia;
        double kilometroso;
        double zonao;
        System.out.println("introduzca matricula de salida");
        matricula = i.readS();
        if (buscar(matricula) == true) {
            System.out.println("introduzca la hora de salida");
            hsaldia = i.readd();
            listaCoches.get(pos).setHsalida(hsaldia);
            System.out.println(" introduzca velocidad de salida");
            kilometroso = i.readd();
            listaCoches.get(pos).setKilometroso(kilometroso);
            System.out.println(" introduzca zona de salida en km");
            zonao = i.readd();
            listaCoches.get(pos).setZonao(zonao);
            multa(matricula);
            listaCoches.remove(pos);
            System.out.println("se ha eliminado del registro el coche: " + matricula);
        } else {
            System.out.println("no se ha encontrado la matricula");
        }

    }
/*metodo para comprobar si el usuario tiene multa*/
    public void multa(String matricula) {

        double media;

        media = (listaCoches.get(pos).getKilometrosi() + listaCoches.get(pos).getKilometroso()) / 2;
        if (media > maxVel) {
            System.out.println(listaCoches.get(pos).toString(media));
        } else {
            System.out.println(" no tiene multa");
        }
        menut();

    }
/*metodo para comprobar si una matricula esta registrada, se devuelve un boolean*/
    public boolean buscar(String matricula) {
        boolean esta = false;
        for (int j = 0; j < listaCoches.size(); j++) {
            if (listaCoches.get(j).getMatricula().contentEquals(matricula)) {
                pos = j;

                esta = true;
            }

        }
        return esta;
    }//buscar por matricula devolviendo boolean
/*metodo para mostrar el vehiculo en cuestion solo datos de entrada */
    public void mostrar() {
        String matricula;
        System.out.println("introduzca matricula de salida");
        matricula = i.readS();
        if (buscar(matricula) == true) {
            listaCoches.get(pos).toString();

        } else {
            System.out.println("no se ha encontrado la matricula");

        }
        menut();
    }

}

