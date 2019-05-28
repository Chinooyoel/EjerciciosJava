package ar.edu.unlam.pb2.bicicleta;

public class MountainBike extends Bicicleta{
	public MountainBike(Integer plato, Integer pinion, Integer velocidad, Integer alturaAsiento) {
		super();  //El super invoca un comportamiento del padre
		this.alturaAsiento = alturaAsiento;
		// TODO Auto-generated constructor stub
	}

	public Integer alturaAsiento;
	
	public void setAlturaAsiento(Integer altura) {
		this.alturaAsiento = altura;
	}
	
}

//composicion mensaje en herencia
