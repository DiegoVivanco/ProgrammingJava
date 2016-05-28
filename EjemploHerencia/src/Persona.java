
// SuperClase
public class Persona {
	private String nombre = null;
	private int edad = 0;
	
	// Constructor
	public Persona(){
		
	};
	
	// Constructor
	public Persona(String nombre, int edad){
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// setters and getters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// metodo sin definir, se definirá cuando de herencia a una subclase
	public void verDatos(){
		
	}

}
