
public class Fizz {

	private static final String BUZZ = "buzz";
	private static final String FIZZ = "fizz";
	private static final String FIZZBUZZ = "fizzbuzz";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(fizzbuzzN(100));
	}
	
	public static boolean multiplosde(int num, int num2)
	{
		return num%num2 == 0;
	}
	
	public static String palabras(int num)
	{
		if(multiplosde(num,3) && multiplosde(num,5))
		{
			return FIZZBUZZ;
		}
		if(multiplosde(num,3))
		{
			return FIZZ;
		}
		if(multiplosde(num,5))
		{
			return BUZZ;
		}
		return Integer.toString(num);
	}
	
	public static String fizzbuzzN(int n)
	{
		String resultado="";
		for(int i=1;i<=n;i++)
		{
			resultado=resultado+palabras(i)+"\n";
		}
		return resultado;
	}

}
