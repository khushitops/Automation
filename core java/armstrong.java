package Module6;
import java.util.Scanner;

public class armstrong {
	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int on=num;
		int remainder;
		int result=0;
		
		while (num != 0)
		{
			remainder = num % 10;
			result = result + (remainder * remainder * remainder);
			num = num / 10;
		}	
		
		if(result == on)
		{
			System.out.println(on + " is an armstrong number");
		}
		else
		{
			System.out.println(on + " is not an armstrong number");
		}

	}
}