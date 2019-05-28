package ar.edu.unlam.pb2.tragamonedas;

public class Tragamonedas {
	/*Modelas un tragamonedas de tres tambores y tres caras*/
	private Tambor primerTambor;
	private Tambor segundoTambor;
	private Tambor tercerTambor;
	//ESTO ES COMPOSICION, CUALQUIER MENSAJE Q MANDEMOS A TAMBOR SE UNA INDIRECCION
	
	public Tragamonedas(Tambor tambor1, Tambor tambor2, Tambor tambor3){
		this.primerTambor = tambor1;
		this.segundoTambor = tambor2;
		this.tercerTambor = tambor3;
	}
	//ESTO ES INYECCION, Q ME DEN EL TAMBOR CREADO, NO QUE LO INSTANCIEMOS NOSOTROS
	
	public boolean entregaPremio() {
		return (primerTambor.mostrarValor().equals(segundoTambor.mostrarValor().equals(tercerTambor.mostrarValor())));
	}
	
	//HERENCIA Y COMPOSICION PARCIAL
	//Estudiar
	//Encapsulamiento es poner comportamientos y atributos juntos y tener el beneficio de la modularidad,
	//ocultamiento es poner los atributos private y poner los comportamientos publicos, en otras palabras, me importa el que y no el como se obtiene los datos. 
	//Te da el beneficio de cambiar la funcionalidad del comportamiento en el tiempo sin que se enteren
}
