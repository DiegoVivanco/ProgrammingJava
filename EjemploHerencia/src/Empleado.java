
public class Empleado extends Persona{
	double sueldo = 0.0d;
	String telefono = null;
	String direcci�n = null;

	public Empleado(){
		
	}
	
	public Empleado(String nombre, int edad, double sueldo, String telefono, String direcci�n) {
		super(nombre, edad);
		this.sueldo = sueldo;
		this.telefono = telefono;
		this.direcci�n = direcci�n;
	}
	
	
	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getDirecci�n() {
		return direcci�n;
	}


	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
	}


	@Override
	public void verDatos(){
		System.out.println("Nombre: " + this.getNombre() + this.getDirecci�n() + this.getSueldo()); 

		
	}

}
