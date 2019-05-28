import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	public void comprobarSiEstaEnSuPesoIdeal() {
		Persona persona1 = new Persona("Yoel", 21, 'H', 41247283, 70, 1.85, 6, 1, 1998);
		int valorEsperado = -1;
		
		assertEquals(valorEsperado, persona1.calcularIMC());
		
		
	}
	
	@Test
	public void ComprobarSiTieneSobrepeso() {
		Persona persona1 = new Persona("Yoel", 21, 'H', 41247283, 140, 1.85, 6, 1, 1998);
		int valorEsperado = 1;
		
		assertEquals(valorEsperado, persona1.calcularIMC());
	}
	@Test
	public void ComprobarSiEstaPorDebajoDeSuPeso() {
		Persona persona1 = new Persona("Yoel", 21, 'H', 41247283, 45, 1.85, 6, 1, 1998);
		int valorEsperado = 0;
		
		assertEquals(valorEsperado, persona1.calcularIMC());
	}
	@Test
	public void ComprobarSiEsMayorDeEdad() {
		Persona persona1 = new Persona("Yoel", 21, 'H', 41247283, 45, 1.85, 6, 1, 1998);
		Persona persona2 = new Persona("Yoel", 21, 'H', 41247283, 45, 1.85, 20, 4, 2001);
		
		assertTrue(persona1.esMayorDeEdad());
		assertFalse(persona2.esMayorDeEdad());
	}

}
