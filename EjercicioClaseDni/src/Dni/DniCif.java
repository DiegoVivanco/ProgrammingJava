package Dni;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DniCif {
	private String dni  = null;
	private Boolean numeroSano = false;
	private Boolean letraSana 	= false;
	// Composición (agregación) "Has - a" / "Tiene - un"
	private TablaAsignacion tabla = new TablaAsignacion();

	/* Constructores */
	
	public DniCif(String dni) {
		this.dni = dni;
	}
	
	/* Encapsulacion */
	
	public void setDni(String cadena){
		this.dni = cadena;
	}

	public String getDni(){
		return this.dni;
	}

	private void setNumeroSano(Boolean valor){
		this.numeroSano = valor;
	}
	
	public Boolean getNumeroSano(){
		return this.numeroSano;
	}
	
	private void setLetraSana(Boolean valor){
		this.letraSana = valor;
	}

	public Boolean getLetraSana(){
		return this.letraSana;
	}
	
	/*
	 * Lógica 
	 */

	/* Interfaz Pública */
	
	public Boolean checkCIF(){
		return checkDni() && checkLetra();
	}
	
	public Boolean checkDni(){
		setNumeroSano( checkLongitud() && stringEsNumero( getParteNumericaDni() ) );
		return getNumeroSano();
	}
	
	public Boolean checkLetra(){
		if (getNumeroSano() ) {
			setLetraSana ( Character.isUpperCase(getParteAlfabeticaDni()) && checkLetraValida() );
			return getLetraSana();
		}
		else {
			return false;
		}
	}
					
	public Character obtenerLetra(){
		// calcularLetra no puede ejecutarse si antes no se cumplen las condiciones previas en checkDni
		// y checkletra
		if ( getNumeroSano() ){
			return this.tabla.calcularLetra( getParteNumericaDni() );
		}
		else // EXCEPCION: aun no sabemos implementarlas - este código no es admisible
			return getParteAlfabeticaDni();
	}


	public Boolean checkLongitud() {
		return getDni().length() == 9;
	}
	
	// uso de expresion regular
	public Boolean stringEsNumero(String cadena){
		return this.getDni().matches("\\{8}.");
		/*for( int i=0; i < cadena.length(); i++ ){
			if ( ! Character.isDigit(cadena.charAt(i)) ){
				return false;
			}
			else;
		}
		return true;*/
	}		
		
	public String getParteNumericaDni() {
		return (String) dni.substring(0, dni.length() - 1);
	}
	
	public Character getParteAlfabeticaDni() {
		return dni.charAt(dni.length() - 1);
	}
	
	public Boolean checkLetraValida() {
		if ( getNumeroSano() ) {
			return getParteAlfabeticaDni() == obtenerLetra();
		}
		else
			return false;
	}
	
	// Definimos método de Expresión Regular 
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
