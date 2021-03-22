import static org.junit.Assert.*;

import org.junit.Test;

public class TesteMultiplica {

	
	@Test
	public void multiplica() {
		int n1 = 2;
		int n2 = 5;
		Calculadora estancia = new Calculadora();
		int resultadoClass = estancia.multiplicar(n1, n2);;
		int resultadoEsperado = 10;
		
		assertEquals(resultadoClass, resultadoEsperado);
	}

}
