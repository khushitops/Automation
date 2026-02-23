package Module6;
import java.util.Scanner;

public class updatearray 
{
	public static void main(String[] args) 
	{
		int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter index to update: ");
        int index = sc.nextInt();

        System.out.print("Enter new value: ");
        int newValue = sc.nextInt();

        if (index >= 0 && index < arr.length) 
        {
            arr[index] = newValue;
            System.out.println("Array updated successfully.");
        } 
        else 
        {
            System.out.println("Invalid index.");
        }

        System.out.println("Updated Array:");
        for (int i = 0; i < arr.length; i++) 
        {
            System.out.print(arr[i] + " ");
        }
	}
}
