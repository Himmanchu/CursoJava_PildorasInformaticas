package poo;

public class Coche {

	private int ruedas;
	
	private int largo;
	
	private int ancho;
	
	private int motor;
	
	private int peso;

	
	public Coche() { //Método constructor
		
		ruedas=4;
		
		largo=2000;
		
		ancho=300;
		
		motor=1600;
		
		peso=500;
		
	}
	
	public String dime_largo(){
		
		return "El largo del coche es " + largo;
	}
}
