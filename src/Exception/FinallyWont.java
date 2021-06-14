package Exception;

public class FinallyWont {
	public static void main(String[] args) {
		try
		{
			System.out.println("hello");
			System.exit(2);
		}

		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block wont be executed");
		}
	}


}
