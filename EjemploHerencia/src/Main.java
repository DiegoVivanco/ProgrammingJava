
public class Main {

	public static void main(String[] args) {
		Empleado empleado = new Empleado(null, 0, 0, null, null);
		empleado.setNombre("Diego");
		System.out.println(empleado.getNombre());
		empleado.setEdad(22);
		System.out.println(empleado.getEdad());
		empleado.setSueldo(1200);
		System.out.println(empleado.getSueldo());
		empleado.setTelefono("98291892");
		System.out.println(empleado.getTelefono());
		empleado.setDirecci�n("y yo que se joder");
		System.out.println(empleado.getDirecci�n());
		
		empleado.verDatos();
		// TODO Auto-generated method stub

	}

}
