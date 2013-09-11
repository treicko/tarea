
public class Fizz {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public boolean multiplos5(int num)
	{
		if(num % 5 == 0)
			return true;
		else 
			return false;
	}
	public boolean multiplos3(int num)
	{
		if(num % 3 == 0)
			return true;
		else 
			return false;
	}
	
	public String palabras(int num)
	{
		String str;
		if(this.multiplos3(num) && this.multiplos5(num))
		{
			str = "fizzbuzz";
			return str;
		}
		if(this.multiplos3(num))
		{
			str = "fizz";
			return str;
		}
		if(this.multiplos5(num))
		{
			str = "buzz";
			return str;
		}
		str = Integer.toString(num);
		return str;
	}

}
