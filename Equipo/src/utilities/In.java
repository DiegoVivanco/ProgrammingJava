/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.*;

/**
 *
 * @author pau
 */
public class In {

    Out o = new Out();
    String message;
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public In() {
    }

    public String readS() {
        String valor = "";

        try {
            valor = br.readLine();

        } catch (Exception e) {//  la e es el nombre del error 
            message = "error de string";
            o.printS(message);

        }
        return valor;

    }

    public int readI() {
        int num = 0;
        try {
            num = Integer.parseInt(br.readLine());// casteo a int

        } catch (Exception e) {
            message = "error  de int";
            o.printS(message);
        }
        return num;
    }

    public double readD() {
        double num = 0;
        try {
            num = Double.parseDouble(br.readLine());//casteo a double
        } catch (Exception e) {
            message = "error de double";
            o.printS(message);
        }
        return num;

    }

    public boolean readB() {
        boolean trueOrFalse = false;
        try {
            trueOrFalse = Boolean.parseBoolean(br.readLine());//casteo a boolean
        } catch (Exception e) {
            message = "error de boolean";
            o.printS(message);
        }
        return trueOrFalse;

    }

    public char readC() {
        char n = ' ';// se deja un hueco en blanco para posteriormente modificarlo
        try {
            n = (char) br.readLine().charAt(0); //casteo a double
        } catch (Exception e) {
            message = "error de char";
            o.printS(message);
        }
        return n;
    }
}
