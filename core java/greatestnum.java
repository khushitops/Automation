package Module6;
import java.util.Scanner;
public class greatestnum 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		int a= sc.nextInt();
		
		System.out.println("Enter Second number:");
		int b=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		int c= sc.nextInt();
		
		if(a>=b && a>=c)
		{
			System.out.println("Greatest Number is:"+a);
		}
		else if(b>=a && b>=c)
		{
			System.out.println("Greatest Number is:"+b);
		}
		else
		{
			System.out.println("Greatest Number is:"+c);
		}
		
	}

}
