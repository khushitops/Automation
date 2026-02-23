package Module6;
import java.util.*;


public class reversearray 
{
	public static void main(String[] args) 
	{
		Integer[] arr = {1, 2, 3, 4, 5};

        List<Integer> list = Arrays.asList(arr);
        Collections.reverse(list);

        System.out.println(list);
    
	}
}
