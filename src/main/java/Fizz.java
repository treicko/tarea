
public class Fizz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		imprimir();
	}
	
	public static boolean multiplos5(int num)
	{
		if(num % 5 == 0)
			return true;
		else 
			return false;
	}
	public static boolean multiplos3(int num)
	{
		if(num % 3 == 0)
			return true;
		else 
			return false;
	}
	
	public static String palabras(int num)
	{
		String str;
		if(multiplos3(num) && multiplos5(num))
		{
			str = "fizzbuzz";
			return str;
		}
		if(multiplos3(num))
		{
			str = "fizz";
			return str;
		}
		if(multiplos5(num))
		{
			str = "buzz";
			return str;
		}
		str = Integer.toString(num);
		return str;
	}
	
	public static void imprimir()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(palabras(i));
		}
	}

}
