/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Coches;

/**
 *
 * @author pau
 */
public class RegistroDatos {

    private String matricula;
    private double hentrada;//hora entrada
    private double hsalida;//hora salida
    private double kilometrosi;// velocidad inicial
    private double kilometroso;// velocidad final
    private double zonai;// zona inicial
    private double zonao;// zona final
    

    public RegistroDatos() {
    }//costructor vacio

 
/*costructor de entrada*/
    public RegistroDatos(String matricula, double hentrada, double kilometrosi, double zonai) {
        this.matricula = matricula;
        this.hentrada = hentrada;
        this.kilometrosi = kilometrosi;
        this.zonai=zonai;
    }
/*gets and sets*/
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getHentrada() {
        return hentrada;
    }

    public double getKilometrosi() {
        return kilometrosi;
    }

    public void setKilometrosi(double kilometrosi) {
        this.kilometrosi = kilometrosi;
    }

    public double getKilometroso() {
        return kilometroso;
    }

    public void setKilometroso(double kilometroso) {
        this.kilometroso = kilometroso;
    }

    public void setHentrada(double hentrada) {
        this.hentrada = hentrada;
    }

    public double getHsalida() {
        return hsalida;
    }

    public void setHsalida(double hsalida) {
        this.hsalida = hsalida;
    }
 public void setZonai(double zonai) {
        this.zonai = zonai;
    }

    public void setZonao(double zonao) {
        this.zonao = zonao;
    }

    public double getZonai() {
        return zonai;
    }

    public double getZonao() {
        return zonao;
    }
    
    
    
    /*to string de multas si son necesarias*/
    public String toString(double media) {
        return  "multa:" + matricula +  " velocidad:" + media + "  entre las horas:" + hentrada + " y " + hsalida +" entre los km:" + zonai + " y " + zonao;
    }

    @Override
    /*mostrar los datos  de entrada con este to string*/
    public String toString() {
        return "RegistroDatos:" + "matricula=" + matricula + ", hentrada=" + hentrada + ", kilometrosi=" + kilometrosi + ", zonai=" + zonai ;
    }
  
  

 
}
