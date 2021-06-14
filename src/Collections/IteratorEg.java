package Collections;
import java.util.*;

public class IteratorEg {
	public static void main(String[] args)
	{
		List l = new ArrayList();
		l.add("Mumbai");
		l.add("Pune");
		l.add("Chennai");
		l.add("NewDelhi");
		
	Iterator it=l.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
		
		for(Object d:l)
		{
			System.out.println(d);
		}
	}


}
