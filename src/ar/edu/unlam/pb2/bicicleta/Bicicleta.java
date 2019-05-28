package ar.edu.unlam.pb2.bicicleta;

public class Bicicleta {
	//ATRIBUTOS
	protected Integer plato;
	protected Integer pinion;
	protected Integer velocidad = 0;
	
	
	//METODOS
	public void setPlato(Integer plato) {
		this.plato = plato;
	}
	public void setPinion(Integer pinion) {
		this.pinion = pinion;
	}
	public void acelerar(Integer velocidad) {
		this.velocidad += velocidad;
	}
	public void frenar(Integer decrementar) {
		this.velocidad -= decrementar;
	}
	
	/**
	public Bicicleta(Integer plato, Integer pinion, Integer velocidad) {
		this.pinion=pinion;
		this.plato=plato;
		this.velocidad=velocidad;
	}
	
	Siempre que escriban un constructor y no sea el por defecto,
	creen un constructor en la clase padre por defecto
	*/
}
