package polimorfismo;

public class Programador extends Informatico{
	//utilizando polimorfismo overload
	public void sueldo(int horas, double sueldo) {
		System.out.println("hola tu sueldo es: " + sueldo + "por: " + horas + "trabajadas");
	}
	public void datos(String nombre, String apellidos){
		System.out.println("hola soy: " + nombre + apellidos);	
	}
	public void labores(String labor){
		System.out.println("hola yo trabajo de: " + labor);
	}


}
