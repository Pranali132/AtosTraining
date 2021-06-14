package Collections;
import java.util.*;
public class HashtableEg {
	public static void main(String[] args) 
	{
		Hashtable ht = new Hashtable();
ht.put(100,"Arun");
ht.put(100, "Ajay");
ht.put(101, "Rithik");
System.out.println(ht);
ht.remove(101);
System.out.println(ht);


	}


}
