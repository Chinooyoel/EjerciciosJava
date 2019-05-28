package ar.edu.unlam.pb2.persona;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class testPersonaDos {

	@Test
	void testParaComprobarSi2PersonaSonIguales() {
		Persona unaPersona = new Persona(41247283, "Yoel Carcamo", 21);
		Persona otraPersona = new Persona(412472833, "Gerson Hugo", 23);
		
		Assert.assertTrue(unaPersona.equals(otraPersona));
	}

}
