package Exception;

public class NFDemo {
	public static void main(String[] args) 
	{
		try
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println(a/b);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}

	}



}
