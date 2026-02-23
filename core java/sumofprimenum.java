package Module6;

public class sumofprimenum 
{
    public static void main(String[] args) 
    {
        int count = 0;
        int number = 2;
        long sum = 0;

        while (count < 100) 
        {
            if (isPrime(number)) 
            {
                sum += number;
                count++;
            }
            number++;
        }

        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

    private static boolean isPrime(int n) 
    {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) 
        {
            if (n % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}

