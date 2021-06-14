package Collections;
import java.util.*;

public class HashmapEg {
	public static void main(String[] args) 
	{
	HashMap hm=new HashMap();
	hm.put("name","aaa");
	hm.put("age","34");
	hm.put("name","Pranali");
	hm.put("age","23");
	hm.put("name","aaa");
	System.out.println(hm);

	System.out.println(hm.get("name"));
	System.out.println(hm.get("age"));

}


}
