package Module6;

public class multiplecatch 
{
	public static void main(String[] args) 
	{
		try 
		{
            int a = 10;
            int b = 0;
            int result = a / b;          

            int[] arr = new int[3];
            arr[5] = 100;     
            
        }
        catch (ArithmeticException e) 
		{
            System.out.println("Arithmetic Exception: Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) 
		{
            System.out.println("Array Index Out Of Bounds Exception");
        }
        catch (Exception e) 
		{
            System.out.println("General Exception");
        }

        System.out.println("Sucess");
    
	}
}
