package ar.edu.unlam.pb2.materia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class Materiatest {

	@Test
	void testParaComprobarLaNotaDelExamen1DeUnaMateria() {
		
		//PREPARACION
		/**
		Materia matematica = new Materia(notaDelExamen1, notaDelExamen2);
		*/
		Materia matematica = new Materia();
		Integer notaDelExamen = 9;
		matematica.evaluar(1, notaDelExamen);
		
		
		
		
		
		Integer notaDelExamen1Obtenido = matematica.getExamen1().getNota();
		
		
		Assert.assertEquals(notaDelExamen, notaDelExamen1Obtenido);

	}
	
	@Test
	void testParaComprobarLaNotaDelExamen2DeUnaMateria() {
		Materia matematica = new Materia();
		Integer notaDelExamen = 7;
		matematica.evaluar(2, notaDelExamen);
		
		Integer notaDelExamen2Obtenido = matematica.getExamen2().getNota();
		
		Assert.assertEquals(notaDelExamen, notaDelExamen2Obtenido);
	}

}
