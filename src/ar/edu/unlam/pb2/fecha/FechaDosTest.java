package ar.edu.unlam.pb2.fecha;
import org.junit.Test;


import org.junit.Assert;


public class FechaDosTest {
	@Test
	public void testQueSePuedaCrearUnaFecha() {
		// 1. Preparacioon
		Integer dia = 23;
		Integer mes = 4;
		Integer anio = 2019;
		Fecha miFecha = new Fecha(dia,mes,anio);
		// 2. Ejecución
		Integer diaObtenido = miFecha.getDia();
		// 3. Contrastación
		Assert.assertEquals(dia, diaObtenido);
	}
	
	@Test
	public void testQueCompruebeSiEsLaMismaFecha() {
		Fecha unaFecha = new Fecha(2017, 5, 8);
		Fecha otraFecha = new Fecha(2017, 5, 8);
		Boolean valorEsperado = true;
		Boolean valorObtenido = unaFecha.equals(otraFecha);
		
		Assert.assertEquals(unaFecha.hashCode(), otraFecha.hashCode());
		
		Assert.assertEquals(valorEsperado, valorObtenido);
		
		Assert.assertTrue(unaFecha.equals(otraFecha));
		
		/*
		Fecha miFecha1 = new Fecha(23, 4, 2019);
		Fecha miFecha2 = new Fecha(26, 4, 2019);
		*/
		/**
		Assert.assertEquals(miFecha1.getDia(), miFecha2.getDia());
		Assert.assertEquals(miFecha1.getMes(), miFecha2.getMes());
		Assert.assertEquals(miFecha1.getAnio(), miFecha2.getAnio());
		*/
		
		//PARA SABER SI 2 OBJETOS APUNTAN A LA MISMA AREA DE MEMORIA
		//miFecha1.equals(miFecha2); 
		// 		O
		//miFecha1 == miFecha2;
		
	}
	

}
