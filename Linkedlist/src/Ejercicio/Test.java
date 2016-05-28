package Ejercicio;
import java.util.LinkedList;

public class Test {
	
	    public static void main(String[] args) {
			// TODO Auto-generated method stub
			//testAlumno();
			testListaAlumno();
		}
		
		public static void testAlumno(){
			Alumno alumno = new Alumno("nombre ", " apellido");
			alumno.getAlumno();
		}
		
		public static void testListaAlumno(){
			ListaAlumnos listaAlumnos = new ListaAlumnos();
			Alumno alumno1 = new Alumno("Jose", " Perez");
			Alumno alumno2 = new Alumno("Alvaro", " Murcia");
			listaAlumnos.addAlumnos(alumno1);
			listaAlumnos.addAlumnos(alumno2);
			//System.out.println(listaAlumnos.posicionCola(alumno1));
			listaAlumnos.mostrarCola();
			//System.out.println(listaAlumnos.sizeCola());
			//System.out.println(listaAlumnos.posicionCola(alumno2));
			//listaAlumnos.salirCola(alumno1);
			//System.out.println(listaAlumnos.posicionCola(alumno2));
			listaAlumnos.moverCola(alumno2, 0);
			System.out.println("-----------------------------------");
			listaAlumnos.mostrarCola();
		}
	

}
