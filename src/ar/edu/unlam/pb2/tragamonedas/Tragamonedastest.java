package ar.edu.unlam.pb2.tragamonedas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Tragamonedastest {

	@Test
	void testParaComprobarSiSeCreoElTragamonedas() {
		Tambor tambor1 = new Tambor(3);
		Tambor tambor2 = new Tambor(3);
		Tambor tambor3 = new Tambor(3);
		
		Tragamonedas miTragamoneda = new Tragamonedas(tambor1, tambor2, tambor3);
		
		Assert.assertNotNull(miTragamoneda);
	}

}
