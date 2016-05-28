/*
 * Contiene anotaciones del capÃ­tulo 4 del libro Beginning Java Programming: The Object-Oriented Approach
 * John Wiley & Sons, Inc. 
 * ISBN: 978-1-118-73949-5
 */

package banca;

public class CuentaCorriente {

	// FINAL CLASS VARIABLE DEFINITIONS: final static
	// CLASS VARIABLE DEFINITIONS:		 static
	// FINAL INSTANCE VARIABLE DEFINITIONS
	
	// INSTANCE VARIABLE DEFINITIONS
	
	private String nombre 	 = null;
	// Since String is a nonâ€�primitive class, its default value is thus null
	// ProgramaciÃ³n defensiva
	
	private String apellidos;
	// Java asigna los valores por defecto a las variables que no hayan sido inicialidadas
	
	private String direccion = null;
	private String telefono  = null;
	private Double saldo 	 = 0.0d;
	// mechanism of autoboxing
	// double data = new Double(3.3); equivale a Double data = 5.4;
	private Boolean numerosRojos = false;
	
	
	// DEFINICIONES DE METODOS
	
	// CONSTRUCTORES
	/* 
	 	* A special method that governs how a class is instantiated.
		* Java will automatically assume a â€œblankâ€� constructor when you do not
		define one.
		* Pueden existir varios constructores:
		Using methods with the same name â€”but taking different argumentsâ€”
		is provided by a feature called method OVERRIDING. As the name suggests, this
		feature is not only available for constructors, but in fact for every method.
	*/
		
	public CuentaCorriente(){
		// Constructors bear the same name as the class in which they are defined.
		// Constructors have no return type, not even void.
		};

	public CuentaCorriente(String nombre, String apellidos, String direccion,
			String telefono, double saldo){
		/* 
		 	If you do define a constructor with	arguments
		 	the constructor taking no arguments will not be available any longer, 
		 	unless you also explicitly define it.
		*/
		this.nombre 	= nombre;
		this.apellidos  = apellidos;
		this.direccion  = direccion;
		this.telefono 	= telefono;
		this.saldo 		= saldo;
	}
	
	// GETTERS Y SETTERS
	/*
	 When no modifier is supplied, Java will make the class, method, or variable 
	 accessible to the class itself (luckily, this should always be the case, otherwise 
	 the method or variable would not be of much use), and also to classes living in
	 the same package.
	 */
	
	void setNombre(String nombre) {
		this.nombre = nombre;
	}
	// methods always return a type or void if they donâ€™t return anything
	
	String getNombre(){
		return this.nombre;
		/* 
		   return nombre es vÃ¡lido tambiÃ©n => Ã¡mbito de la variable de instancia
		   busca nombre en el mÃ©todo, luego en el Ã¡mbito superior (la clase)
		 */
	}
	
	void setApellidos(String apellidos){
		this.apellidos = apellidos;
	}
	
	String getApellidos(){
		return this.apellidos;
	}
	
	void setDireccion(String direccion){
		this.direccion = direccion;
	}
	
	String getDireccion(){
		return this.direccion;
	}
	
	void setTelefono(String telefono){
		this.telefono = telefono;
	}
	
	String getTelefono(){
		return this.telefono;
	}
	
	double getSaldo(){
		return this.saldo;
	}
	
	// LOGICA
	
	void retirarDinero(double importe ){
		this.saldo -= importe;
		this.setNumerosRojos();
	}
	
	void ingresarDinero(double importe){
		this.saldo += importe;
		this.setNumerosRojos();
	}
	
	boolean saldoNegativo(){
		return this.numerosRojos;
	}
	
	void setNumerosRojos(){
		if (this.saldo < 0){
			this.numerosRojos = true;
		}
		else this.numerosRojos = false;
	}
	
	void consultarCuenta(){
		System.out.println("Nombre: " + this.nombre);
		// System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + this.apellidos);
		System.out.println("Direccion: " + this.direccion);
		System.out.println("Telefono: " + this.telefono);
		System.out.println("Saldo: " + this.saldo);
	}

	// Metodo Main
	
	/* 
	 * Loose scripts cannot exist in Java, meaning that you have to create the objects inside
	a method definition of a class.
	
	 * As Java has no way of knowing which particular method you want to use as the entry point of the
	program, a special method existsâ€”the soâ€�called main methodâ€”that serves exactly this purpose.
	
	 * Some developers like to supply main methods in their class definitions in larger programs as a quick
	way to test if the class is working correctly, without having to run the complete program and go
	through a series of steps. This is fine, so long as you keep these â€œtestâ€� main s small and short, for
	testing purposes only, and remember that there exist better ways to perform thorough code tests.
	*/
}

