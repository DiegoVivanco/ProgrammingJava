package polimorfismo;

public class Analista extends Informatico {
	double sueldo = 0.0d;
	String nombre = null;
	String labor = null;
	
	public void sueldo(double sueldo) {
		System.out.println("hola tu sueldo es: " + sueldo);
	}
	public void datos(String nombre){
		System.out.println("hola soy: " + nombre );	
	}
	public void labores(String labor){
		System.out.println("hola yo trabajo de: " + labor);
	}

}
