package ar.edu.unlam.pb2.ascensor;

import java.util.ArrayList;

public class Ascensor {
	private ArrayList<Persona> listaPersona;
	private double capacidadMaxima;
	private Integer cantidadPersonaMaxima;
	
	public Ascensor(double capacidadMaxima, Integer cantidadPersonaMaxima) {
		this.listaPersona = new ArrayList<Persona>();
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadPersonaMaxima = cantidadPersonaMaxima;
	}
	
	public void subirPersona(Persona miPersona) {
		if( this.ObtenerCargaDelAscensor() + miPersona.getPeso() <= this.capacidadMaxima
			&& this.listaPersona.size() < this.cantidadPersonaMaxima)
			listaPersona.add(miPersona);
	}
	
	public Integer obtenerCantidadDePersonas() {
		return this.listaPersona.size();
	}
	
	public ArrayList<Persona> getListaPersona(){
		return this.listaPersona;
	}
	
	public double getCapacidadMaxima() {
		return this.capacidadMaxima;
	}
	
	public Integer getCantidadPersonaMaxima() {
		return this.cantidadPersonaMaxima;
	}
	public double ObtenerCargaDelAscensor() {
		double suma = 0;
		for(Persona persona : this.listaPersona) {
			suma += persona.getPeso();
		}
		return suma;
	
	}
}
//tipos de colecciones: hald set, y tripset
//hash set: los ordena atravez de su codigo hash, busca el elemento a travez de su codigo hash en vez del index
//trip set: se diferencia del hash set es que amedida que voy agregando las personas, vos tenes que indicar el orden, como se van a ordenar por nombre o apellido
//set: no permite repetidos

//1 -- collection framework
//2 -- list hereda de collection // set
//3 -- list-arraysList // list-linkedlist // set-hashset // set-sortedset
//4 -- sortedset- triset

//1 colecciones map
//2 hash map // treemap


//Los hashmap(clave, valor)

//Investigar ventajas y desventajas de los arrays list con los linked list
//Cuando usar hasgset y un sorted
//Como funciona un iterator
//como recorro los maps, con un ejemplo
//Cuando usar un collection y un map