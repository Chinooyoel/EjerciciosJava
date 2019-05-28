package ar.edu.unlam.pb2.tragamonedas;

public class Tambor {
	
	public Tambor(Integer caras) {
		this.caras = caras;
		this.girar();
	}
	
	private Integer caras;
	private Integer valor;
	
	
	public void girar() {
		this.valor = (int)Math.floor(Math.random()*caras) + 1;
	}
	
	public Integer mostrarValor() {
		return this.valor;
	}
	
}
