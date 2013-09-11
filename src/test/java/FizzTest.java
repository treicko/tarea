import static org.junit.Assert.*;

import org.junit.Test;


public class FizzTest {

	Fizz f = new Fizz(); 
	@Test
	public void verificarMultiplo5()
	{
		assertEquals(true,f.multiplos(10));
	}

}
