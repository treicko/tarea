
public class Fizz {

	private static final String BUZZ = "buzz";
	private static final String FIZZ = "fizz";
	private static final String FIZZBUZZ = "fizzbuzz";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		imprimir();
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
	
	public static void imprimir()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(palabras(i));
		}
	}

}
