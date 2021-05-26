package Triangulo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TrianguloTest {

	@Test
	public void test() {
		testCalcularelArea();
		testPerimetro();
	}

	public void testPerimetro() {
		double esperado = 1366.00;
		Triangulo t = new Triangulo(new int[] {0,0,400}, new int[] {0,400,400});
		assertEquals(esperado,t.Perimetro(), 0.0);
		
	}

	public void testCalcularelArea() {
		double esperado = 80000.00;
		Triangulo t = new Triangulo(new int[] {0,0,400}, new int[] {0,400,400});
		assertEquals(esperado,t.CalcularArea(), 0.0);
	}
}