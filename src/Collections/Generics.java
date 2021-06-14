package Collections;
import java.util.*;

public class Generics {
	public static void main(String[] args) 
	{
		ArrayList<String>ai=new ArrayList<String>();
		ArrayList<Integer> ai1 = new ArrayList<Integer>();
		ai1.add(10);
		ai1.add(20);
		ai.add("bb");
		ai.add("aa");
		System.out.println("the contents of array list:"+ai);
		System.out.println(ai1);
	}



}
