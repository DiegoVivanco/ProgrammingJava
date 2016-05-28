package Ejercicio;

import java.util.LinkedList;

public class ListaAlumnos {
	LinkedList lista;
	
	public ListaAlumnos(){
		this.lista = new LinkedList();
	}
	
	
	public void addAlumnos(Alumno alumno){
		lista.add(alumno);
	}
	
	public Integer posicionCola(Alumno alumno){
		return lista.indexOf(alumno) + 1;
	}
	
	public void mostrarCola(){
		int total = lista.size();
		for (int i = 0; i < total; i++){
			System.out.println(lista.get(i));
			
		}
	}
	
	public int sizeCola(){
		return lista.size();
	}
	public void salirCola(Alumno alumno){
		int posicion = this.posicionCola(alumno);
		lista.remove(posicion);
	}
	
	public void moverCola(Alumno alumno, int posicion){
		lista.add(posicion, alumno);
	}

}
