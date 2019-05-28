
public class Rectangulo {
	//Constructor
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//Metodos
	/**
	Calcula el area del triangulo utilizando las propiedades base
	y altura
	*/
	public Double calcularArea(){
	    return base*altura;
	}
	/**
	Calcula el perímetro del rectangulo utilizando las propiedades base
	y altura
	*/
	public Double calcularPerimetro(){
	    double a = this.calcularArea()/altura;
	    
	    return 2*(altura + a);
	}
	//Atributos
	private double base;
	private double altura;
}
