/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugadores;
import GRandom.Grandom;
/**
 *
 * @author pau
 * random (3)
 */
public class Entrenamiento {
Grandom r=new Grandom();

    String car2,tec2,alimentacion2,fiso_desc2,fs2;
    public Entrenamiento() {
        // se usan los metodos echos dando un valor al azar para todos ellos
     
        car2= r.entrenamiento1();
       tec2=r.entrenamiento2();
       alimentacion2=r.entrenamiento3();
       fiso_desc2=r.entrenamiento4();
        fs2= r.entrenamiento4();
    }

    public String getCar2() {
        return car2;
    }

    public String getFs2() {
        return fs2;
    }

    public String getTec2() {
        return tec2;
    }

    public String getAlimentacion2() {
        return alimentacion2;
    }

    public String getFiso_desc2() {
        return fiso_desc2;
    }

}
