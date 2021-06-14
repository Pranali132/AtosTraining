package Collections;
import java.util.ArrayList;


public class ArraylistEg {
	public static void main(String[] args) 
	{
		ArrayList ar=new ArrayList();
		System.out.println("inital size of array list:"+ar.size());
		ar.add("a");
		ar.add("b");
		ar.add("c");
		System.out.println("size of array list after add"+ar.size());
		System.out.println("contents of array list:"+ar);
		ar.add(2,"e");
		System.out.println("contents of array list:"+ar);
		ar.remove(3);
		ar.remove("a");
		System.out.println("Final Array:"+ar);


	}



}
