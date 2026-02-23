package Module6;
import java.util.ArrayList;



public class removearraylist 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");

        System.out.println("Before removing: " + list);

       
        list.remove(2);

        System.out.println("After removing: " + list);
    
	}
}
