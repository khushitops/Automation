package Module6;

import java.util.ArrayList;
import java.util.Iterator;


public class iterate 
{
	public static void main(String[] args) 
	{
		ArrayList<String> arrayList = new ArrayList();
		
		
		arrayList.add("Java");
		arrayList.add("Php");
		arrayList.add("Python");
		arrayList.add("Spring");
		arrayList.add("Java");
		
	
		Iterator<String> i = arrayList.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}
}
