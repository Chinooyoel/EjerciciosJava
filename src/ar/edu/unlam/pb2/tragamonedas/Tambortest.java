package ar.edu.unlam.pb2.tragamonedas;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tambortest {

	@Test
	void testQueCompruebaQueTamborDevuelveUnValorEntreLasCarasDefinidas() {
		Integer caras = 3;
		Tambor miTambor = new Tambor(caras);
		Integer minimo = 1;
		Integer maximo = 3;
		
		
		miTambor.girar();
		Integer valorObtenido = miTambor.mostrarValor();
		
		assertTrue("El valor esta entre 1 y 3", valorObtenido>= minimo && valorObtenido<= maximo);
	}

}
