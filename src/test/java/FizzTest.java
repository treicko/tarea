import static org.junit.Assert.*;

import org.junit.Test;


public class FizzTest {

	Fizz f = new Fizz(); 
	@Test
	public void verificarMultiplo5()
	{
		assertEquals(true,f.multiplos5(10));
	}
	
	@Test
	public void verificarMutliplo3()
	{
		for(int c = 3; c < 100; c+=3 )
		{
			assertEquals(true,f.multiplos3(c));
		}
	}
	
	@Test
	public void testPalabra()
	{
		assertEquals("fizzbuzz",f.palabras(15));
		assertEquals("fizz",f.palabras(3));
		assertEquals("buzz",f.palabras(5));
		assertEquals("13",f.palabras(13));
	}

}
