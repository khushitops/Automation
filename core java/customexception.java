package Module6;
import java.util.Scanner;



	class InsufficientBalanceException extends Exception 
	{
		public InsufficientBalanceException(String message) 
		{
	        super(message);
	    }
	}

	
	class Account 
	{
	    private double balance;

	    public Account(double balance) 
	    {
	        this.balance = balance;
	    }

	    public void withdraw(double amount) throws InsufficientBalanceException 
	    {
	        if (amount > balance) 
	        {
	            double shortage = amount - balance;
	            throw new InsufficientBalanceException(
	                "Sorry, insufficient balance, you need more " + shortage + " Rs. To perform this transaction."
	            );
	        }
	        else
	        {
	            balance -= amount;
	            System.out.println("Withdrawal successful.");
	            System.out.println("Remaining Balance: " + balance);
	        }
	    }

	    public double getBalance()
	    {
	        return balance;
	    }
	}

	
	public class customexception
	{

	    public static void main(String[] args) 
	    {

	        Scanner sc = new Scanner(System.in);

	        Account account = new Account(2000);  

	        System.out.println("Account balance is: " + account.getBalance());
	        System.out.print("Enter withdraw amount: ");
	        double amount = sc.nextDouble();

	        try 
	        {
	            account.withdraw(amount);
	        } 
	        catch (InsufficientBalanceException e) 
	        {
	            System.out.println(e.getMessage());
	        }

	        sc.close();
	    }
	}
	

