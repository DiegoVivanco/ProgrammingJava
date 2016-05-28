package banca;

public class ProgramaPrincipal {

	public static void main(String[] args) {
	
	CuentaCorriente cuenta = new CuentaCorriente();
	cuenta.setNombre("Diego");
	System.out.println(cuenta.getNombre());
	cuenta.ingresarDinero(200);
	System.out.println(cuenta.getSaldo());
	cuenta.retirarDinero(700);
	System.out.println(cuenta.getSaldo());
	System.out.println(cuenta.saldoNegativo());
	cuenta.consultarCuenta();
	
	CuentaCorriente otra = new CuentaCorriente("Diego", "Vivanco", 
			"plaza paris", "655100833", 500);
	otra.consultarCuenta();
	
	CuentaCorriente nueva = new CuentaCorriente();
	nueva.setNombre("nueva");
	System.out.println(nueva.getNombre());
	System.out.println("apellidos: " + nueva.getApellidos());
}

}