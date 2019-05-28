import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Objetos1test {

	  @Test
	    public void usandoString() {

	          //1.A 
	        //Usando el metodo reverse de proba que el string palindromo se lee igual al derecho que al reves
		  /*
	        String palindromo1 = "anita lava la tina";
	        String palindromo = palindromo1.trim();
	        assertEquals("anitalavalatina", palindromo);
	        StringBuilder palabra1 = new StringBuilder(palindromo);
	        String palindromoAlReves = palabra1.reverse().toString(); //

	        assertEquals(palindromo, palindromoAlReves);
			*/
	         //1.B  
	        String frase = "Do, or do not. There is no try";
	        String contiene = "There";
	        String noContiene = "Yoda";
	        
	        assertTrue(0<=frase.indexOf(contiene));
	        assertTrue(0>frase.indexOf(noContiene));

	        //Existe un metodo que sirve para que lo siguiente de verde. ¿Cuál es?
	        assertTrue(true);
	        assertFalse(false);

	          //1.C 
	        //E String indiana tiene 18 posiciones, con que metodo podes comprobarlo?
	        String indiana = "Henry Jones Junior";
	        assertEquals(18, indiana.length());

	        //Comproba que 6 es la posicion de la primer i
	        String palabra = "Otorrinolaringólogo";
	        assertEquals(6-1, palabra.indexOf('i'));

	        // Y que 12 es de la segunda
	        assertEquals(12-1, palabra.indexOf('i', 6));
	    }

}
