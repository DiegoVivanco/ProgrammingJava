package Ejercicio;

public class Alumno {
	String nombre;
	String apellido;
	
	public Alumno(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void getAlumno() {
		System.out.println(this.getNombre() + " " + this.getApellido());
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombre(){
		return this.nombre;
	}

}
