package Dni;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Evaluar_Dni {
	private String dni;
	
	public String getDNI() {
		return dni;
	}

	public void setDNI(String dni) {
		this.dni = dni;
	}
	
	public boolean CheckDNI(String dni){
		String numerosDniValidos = "[0-9]{8}";  // del 0 a 9. Y solo 8 numeros.
		String letrasDniValidas = "[^a-zIÑOU]{1}";		//Letras no permitidas: I, Ñ, O, U y de la "a" a la "z" (minusculas). Y que haya solo una letra.
		Pattern patronDni = Pattern.compile(numerosDniValidos + letrasDniValidas);
		Matcher coincidencia  = patronDni.matcher(dni);
		
		if (coincidencia.find()){
			return true;
		}
		else{
			return false;
		}
}
	
}