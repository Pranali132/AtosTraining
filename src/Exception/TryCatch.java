package Exception;

public class TryCatch {

	public static void main(String[] args) 
	{
		int a=10;
		int b=5;
		int c=5;
		int x;
		try
		{
			x=a/(b-c);
			
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);			
			System.out.println("division by zero");
		}
		
		}


}
