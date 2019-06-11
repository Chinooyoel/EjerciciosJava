package ar.edu.unlam.pb2.ascensor;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class testAscensor {

	@Test
	void testQueSubeUnaPersona() {
		Ascensor miAscensor = new Ascensor(300, 5);
		Persona miPersona = new Persona("yoel",68, 41247283);

		miAscensor.subirPersona(miPersona);
		
		Integer valorObtenido = miAscensor.obtenerCantidadDePersonas();
		Integer valorEsperado = 1;
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}

	@Test
	void testQueCompruebaElOrdenDeLaLista() {
		Ascensor miAscensor = new Ascensor(300, 5);
		Persona miPersona1 = new Persona("yoel", 68, 41247283);
		Persona miPersona2 = new Persona("Gerson", 75, 12342212);
		
		miAscensor.subirPersona(miPersona1);
		miAscensor.subirPersona(miPersona2);
		
		ArrayList<Persona> listaObtenida = miAscensor.getListaPersona();
		
		Assert.assertEquals(listaObtenida.get(0).getApellido(), miPersona1.getApellido());
		Assert.assertEquals(listaObtenida.get(1).getApellido(), miPersona2.getApellido());
		
	}
	
	@Test
	void testQueCompruebeLaCargaDelAscensor() {
		Ascensor miAscensor = new Ascensor(300, 5);
		Persona miPersona1 = new Persona("yoel", 68, 41247283);
		Persona miPersona2 = new Persona("Gerson", 75, 12342212);
		
		miAscensor.subirPersona(miPersona1);
		miAscensor.subirPersona(miPersona2);
		
		ArrayList<Persona> listaObtenida = miAscensor.getListaPersona();
		
		double pesoEsperado = miPersona1.getPeso() + miPersona2.getPeso();
		double pesoObtenido = miAscensor.ObtenerCargaDelAscensor();
		
		Assert.assertEquals(pesoEsperado, pesoObtenido, 0.1);
	}
	
	@Test
	void testQueVerifiQueNoSupereLaCantidadMaximaDelPeso() {
		Ascensor miAscensor = new Ascensor(160, 4);
		Persona miPersona1 = new Persona("yoel", 70, 41247283);
		Persona miPersona2 = new Persona("Gerson", 80, 12342212);
		Persona miPersona3 = new Persona("Silvia", 80, 12342212);
		
		miAscensor.subirPersona(miPersona1);
		miAscensor.subirPersona(miPersona2);
		miAscensor.subirPersona(miPersona3);
		
		double pesoEsperado = miPersona1.getPeso() + miPersona2.getPeso();
		double pesoObtenido = miAscensor.ObtenerCargaDelAscensor();
		
		Assert.assertEquals(pesoEsperado, pesoObtenido, 0.1);
	}
	
	@Test
	void testQueVerificaQueNoSuperaLaCantidadDePersonas() {
		Ascensor miAscensor = new Ascensor(300, 2);
		Persona miPersona1 = new Persona("yoel", 70, 41247283);
		Persona miPersona2 = new Persona("Gerson", 80, 12342212);
		Persona miPersona3 = new Persona("Silvia", 80, 12342212);
		
		miAscensor.subirPersona(miPersona1);
		miAscensor.subirPersona(miPersona2);
		miAscensor.subirPersona(miPersona3);
		
		Integer valorEsperado = 2;
		Integer valorObtenido = miAscensor.getListaPersona().size();
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
	}
}
	