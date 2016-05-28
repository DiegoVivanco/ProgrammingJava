/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.util.ArrayList;

/**
 *
 * @author pau
 */
public class Garraylist {

    In i = new In();
    Out o = new Out();
    Object[] element;//datos que se introduciran dentro del array
    ArrayList<Object> garraylist;

    public Garraylist() {
        garraylist = new ArrayList<Object>();
    }//costructor

    public void add(int size) {
        String message;
        element = new Object[size];// se inicializa un object[] llamado element que tiene size espacios;
 
        for (int j = 0; j < element.length; j++) {
            message="introduce un valor";
            o.printS(message);
        }
       garraylist.add(element);// se guarda el elemento en el arraylist
    } // si se introducen datos ( que estos tendran los de guardar eel valor se guardan aqui;

    public void del(int i) {
        garraylist.remove(i);
    }

    public void pArraylist() {
        try {
            for (int j = 0; j < garraylist.size(); j++) {
                System.out.println();
            }

        } catch (Exception e) {
        }

    }
}
