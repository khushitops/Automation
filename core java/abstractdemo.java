package Module6;

		abstract class Parent 
		{
		    abstract void message();
		}

		
		class FirstSubclass extends Parent 
		{
		    @Override
		    void message() 
		    {
		        System.out.println("This is first subclass");
		    }
		}

		
		class SecondSubclass extends Parent 
		{
		    @Override
		    void message() 
		    {
		        System.out.println("This is second subclass");
		    }
		}

	
		public class abstractdemo 
		{
		    public static void main(String[] args) 
		    {

		        Parent obj1 = new FirstSubclass();
		        Parent obj2 = new SecondSubclass();

		        obj1.message();
		        obj2.message();
		    }
		}
	

