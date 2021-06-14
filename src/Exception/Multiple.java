package Exception;

public class Multiple {
	public static void main(String[] args) 
	{
		int a[]={10,20};
		int b=30;
		try
		{
		int x=a[2]/b-a[1];
		}
		catch(ArithmeticException e)
		{
		System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
		System.out.println(e1);
		}


	}


}
