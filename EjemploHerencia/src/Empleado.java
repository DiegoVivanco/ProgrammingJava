
public class Empleado extends Persona{
	double sueldo = 0.0d;
	String telefono = null;
	String dirección = null;

	public Empleado(){
		
	}
	
	public Empleado(String nombre, int edad, double sueldo, String telefono, String dirección) {
		super(nombre, edad);
		this.sueldo = sueldo;
		this.telefono = telefono;
		this.dirección = dirección;
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


	public String getDirección() {
		return dirección;
	}


	public void setDirección(String dirección) {
		this.dirección = dirección;
	}


	@Override
	public void verDatos(){
		System.out.println("Nombre: " + this.getNombre() + this.getDirección() + this.getSueldo()); 

		
	}

}
