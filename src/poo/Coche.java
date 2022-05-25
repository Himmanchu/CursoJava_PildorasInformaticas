package poo;

public class Coche {

	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso_plataforma;

	private String color;

	private int peso_total;
	
	private boolean asientos_cuero, climatizador;
	
	
	
	
	
	public Coche() { //Método constructor
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso_plataforma=500;
	
		
		
	}
	
	public String dime_datos_generales(){  //MÉTODO GETTER
		
		return "La plataforma del vehículo tiene " + ruedas + " ruedas " +
		". Mide " + largo/1000 + " metros con un ancho de " + ancho + 
		" cm y un peso de plataforma de " + peso_plataforma + " kg"; 
	}
	
	public void establece_color(String color_coche) {  //MÉTODO SETTER
		
		color=color_coche;
		//color="azul";
	}
	
	public String dime_color() {
		
		return "El color del coche es " + color;
	}
	
	public void configura_asientos(String asientos_cuero) {    //SETTER
		
		if(asientos_cuero=="si") {
			
			this.asientos_cuero=true;
			
		}else {
			this.asientos_cuero=false;
			
		}
		
	}
	
	public String dime_asientos() {  //GETTER
		
		if(asientos_cuero==true) {
			
			return "El coche tiene asientos de cuero";
			
		}else {
			
			return "El coche tiene asientos de serie";
		}
	}
}
