package Exception;

public class PrintDemo {
	public static void main(String[] args) 
	{
		try
		{
			int x=1/0;
		}
	catch(ArithmeticException e)
	{
		e.printStackTrace();
		System.out.println(e.getMessage());
	}

	}


}
