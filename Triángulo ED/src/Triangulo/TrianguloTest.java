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
		Triangulo t = new Triangulo(new int[] {0,0,400}, new int[] {0,400,400});
		t.Perimetro();
		assertEquals(1365.69, (400.00+400.00+565.69), 0);
		
	}

	public void testCalcularelArea() {
		Triangulo t = new Triangulo(new int[] {0,0,400}, new int[] {0,400,400});
		t.CalculaArea();
		assertEquals(80000, (400*400)/2);
	}
}