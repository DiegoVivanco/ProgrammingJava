package GRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;

/**
 *
 * @author pau
 */
public class Grandom {

    //clase random
    Random r = new Random();
    //nombres al azar
    String[] name = {"Pau", "Manu", "Bocata", "Mistetas", "Angel", "Barbas", "Salchichon", "Ralph",
        "Eustaquio", "Comemesta", "sr.pene", "Sr.banana", "Sr.pompas", "Namine", "Sora", "Riku", "Kairi", "Amsem", "Mikey", "Hipogucido", "Zero", "Asin"};
    //apellidos

    String[] surname = {"Perez", "Valls", "Bella", "Colon", "Bigdaddy", "Sempai", "(~^.^)~", "Soyunnomo",
        "Norris", "Zapatero", "Koro", "Atun", "ruiz", "Pokemon", "Sinapellido", "Sasa", "pakkieressaveresojajasalu2", "Guay", "Gordocabron", "Kata", "Bearis", "Makra"};
    // paises 
    String[] country = {"Spain", "United Kingdom", "United Stades", "Japan", "Chupilandia", "Rusia", "Alaska", "macedonia", "china", "France", "ireland"};

    // direcciones
     String[] direcciones = {"c/ de la piruleta 76", " c/ no me llamo eustaquio 43", "c/ antonieta de las nieves 5", "c/ mariano ladron 9", "c/ gordocabron 89"};
     // entrenamientos randoms desde aqui
     
    
    String[] car = {"basico", "intensivo", "medio"};
    String[] tec = {"mejorar reflejos", "mejorar movimiento", "mejorar resistencia"};
    String[] alimentacion = {"equilibrada", "carbohidratos", "ligera"};
    String[] fiso_desc = {"1h", "2h", "3h"};
    
    
    //se usa una variable para ir devolviendo el valor random introducido
    public String  entrenamiento1(){
         String name = "";
     name= car[r.nextInt(3)];
     return name;}
       public String  entrenamiento2(){
         String name = "";
     name= tec[r.nextInt(3)];;
     return name;}
         public String  entrenamiento3(){
         String name = "";
     name=alimentacion[r.nextInt(3)];
     return name;}
          public String  entrenamiento4(){
         String name = "";
     name=fiso_desc[r.nextInt(3)];;
     return name;}
     
      
       
    
//costructor

    public Grandom() {
        System.out.println();

    }

    public int gNumR(int n) {

        return r.nextInt(n );
    } // generador de numeros

    public String gNamer() {
        String name = "";
        name = this.name[r.nextInt(this.name.length - 1)] + " " + this.surname[r.nextInt(surname.length - 1)];

        return name;
    }// nombres al azar
    public String gcountry(){
     String name = "";
     name = this.country[r.nextInt(this.country.length - 1)] ;
     
      return name;
    }// nacionalidad al azar
    public int gdate (){//crea la fecha 
    int num;
    //esto hace un rango manual de random de 18 a 34
    int n = 34 - 18 + 1;
int i = r.nextInt(34) % n;
num =  18 + i;
    return num;
    
    }
    public String gdni(){//crea un dni de n fechas
    String dni="";
    int num;
    String letra="";
        for (int i = 0; i < 8; i++) {
            num=gNumR(9);
            dni = dni += num;
        }
        
    return dni;
    
    }// dni al azar
        public String gdirecc(){
     String name = "";
     name = this.direcciones[r.nextInt(this.direcciones.length - 1)] ;
     
      return name;}// direccion al azar
}
