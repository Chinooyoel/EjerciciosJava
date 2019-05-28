import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectanguloTest {

	@Test
	public void sePuedenCrearRectangulos() {
		Rectangulo unRectangulo = new Rectangulo(1.0, 2.0);
		assertNotNull(unRectangulo);
		
		Rectangulo otroRectangulo = new Rectangulo(4.0, 5.0);
		assertNotNull(otroRectangulo);
	}
	
	@Test
	public void elPermitroDeUnRectanguloDebeSerLaSumaDeSusLado() {
		Rectangulo unRectangulo = new Rectangulo(4.0, 2.0);
		
		double esperado = 12.0;
		double actual = unRectangulo.calcularPerimetro();
		
		  /*
        El tercer parametro es un delta. Quiere decir que solamente
        nos van a importar los primeros dos decimales para la           comparacion
      */
		assertEquals(esperado, actual, 0.01);
	}
	
	 @Test
	    public void elAreaDeUnRectanguloDebeSerLaBasePorSuAltura(){
	        
		 Rectangulo unRectangulo = new Rectangulo(4.0,2.0);
		 double esperado = 8.0;
		 double actual = unRectangulo.calcularArea();
		 
		 assertEquals(esperado, actual, 0.01);
	        
	    }   
}
