/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionmultas;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author pau
 */
public class Lecturas {

    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);

    public Lecturas() {
    }
/*buffer de string*/
    public String readS() {
       

        String s = "";

        try {
            s = br.readLine();

        } catch (Exception e) {
            System.out.println("error vuelva a introducirlo");

        }
        return s;
    }
    /*buffer de double*/
    public double readd() {
       
        double d=0;
        

        try {
            d = Double.parseDouble(br.readLine());

        } catch (Exception e) {
            System.out.println("error vuelva a introducirlo");

        }
        return d;
    }
     /*buffer de int*/
    public int reai() {
       
        int d=0;
        

        try {
            d = Integer.parseInt(br.readLine());

        } catch (Exception e) {
            System.out.println("error vuelva a introducirlo");

        }
        return d;
    }
    
    
}
