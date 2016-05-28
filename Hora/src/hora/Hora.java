package hora;

public class Hora {
	private int hora = 0;
	private int minutos = 0;
	private int segundos = 0;
	
	public Hora(){
		
	}

	public Hora(int hora, int minutos, int segundos) {
		super();
		this.hora     =  hora;
		this.minutos  =  minutos;
		this.segundos =  segundos;
		if (minutos > 60 || segundos > 60 || hora > 24 || minutos < 0 || 
			segundos < 0 || hora < 0) {
			hora = 0;
			minutos = 0;
			segundos = 0;
			}

	}

	public int getHora() {
		return this.hora;
	}

	public boolean setHora (int hora) {
		this.hora = hora;
		if (hora > 24 || hora < 0) {
			return false;
		}else return true;	
	
	}

	public int getMinutos() {
		return this.minutos;
	}

	public boolean setMinutos(int minutos) {
		this.minutos = minutos;
		if (minutos > 60 || minutos < 0) {
			return false;
		}else return true;
	}

	public int getSegundos() {
		return this.segundos;
	}

	public boolean setSegundos(int segundos) {
		this.segundos = segundos;
		if (segundos > 24 || segundos < 0) {
			return false;
		}else return true;	
	}
	
	
	public boolean checkHora(int hora){
		if (hora > 24 || hora < 0) {
			return false;
		}else return true;				
	}
	public boolean checkMinutos(int minutos){
		if (minutos > 60 || minutos < 0) {
			return false;
		}else return true;				
	}
	public boolean checkSegundos(int segundos){
		if (segundos > 24 || segundos < 0) {
			return false;
		}else return true;				
	}
	
	public void horaCorrecta(){
		if (this.setHora(hora) == true && this.setMinutos(minutos) == true && this.setHora(hora) == true){
			String horaCompleta = "[%s, %s, %s]";
			String horaFormateada = String.format(horaCompleta, this.getHora(), this.getMinutos(), this.getSegundos());
			System.out.println( horaFormateada);
		}else System.out.println("la hora no es correcta");
	}
	
	public void setHoras(int hora, int minutos, int segundos) {
		this.hora     =  hora;
		this.minutos  =  minutos;
		this.segundos =  segundos;
		if (minutos > 60 || segundos > 60 || hora > 24 || minutos < 0 || 
				segundos < 0 || hora < 0) {
				hora = 0;
				minutos = 0;
				segundos = 0;
				}

	}
	
	public String getHoras() {
		String horaCompleta = "[%s, %s, %s]";
		String horaFormateada = String.format(horaCompleta, this.getHora(), this.getMinutos(), this.getSegundos());
		return horaFormateada;
	}
	
	public void imprimirHora(){
		System.out.println(this.getHoras());
	}
	
	public boolean checkHoras(int hora, int minutos, int segundos){
		if ((this.getHora() >=0 && this.getHora() < 24) && (this.getMinutos() >=0 && this.getMinutos() < 60) && (this.getSegundos() >=0 && this.getSegundos() < 60)){
			return true;
		}
		else{
			return false;
		}		
	}
	
	
	
	
	

}
