package Triangulo;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)

public class TrianguloParametrizadasTest {
	@Parameters
	public static Iterable<Object[]> data(){
		return Arrays.asList(new Object[][]{
			{2,2,2},{4,4,8},{10,10,50},{7,7,24.5},{5,5,12.5}});
	}
	
	private double ladoAB, ladoBC, esperado;
	
	public TrianguloParametrizadasTest(double ladoAB, double ladoBC, double esperado) {
		this.ladoAB = ladoAB;
		this.ladoBC = ladoBC;
		this.esperado = esperado;
	}

	@Test
	public void testCalcularelArea() {
		Triangulo t = new Triangulo(new int[] {(int) ladoAB}, new int[] {(int) ladoBC});
		assertEquals((ladoAB*ladoBC/2), esperado ,0.9);
	}
	
}