package polimorfismo;

public class Main {

	public static void main(String[] args) {
		Programador programadorDiego = new Programador();
		Analista analistaDiego = new Analista();
		AdministradorBD administradorDiego = new AdministradorBD();
		
		programadorDiego.datos("Diego", "Vivanco");
		programadorDiego.labores("Programador");

		analistaDiego.datos("Dani Carril");
		analistaDiego.labores("Analista");
		
		administradorDiego.datos("Ram�n", "Ram�n");
		administradorDiego.labores("Administrador");
	}

}
