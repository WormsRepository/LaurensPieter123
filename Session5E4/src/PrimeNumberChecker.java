import java.util.Scanner;


public class PrimeNumberChecker 
{
	public static void main(String[] args)
	{
		Scanner invoer = new Scanner(System.in);
		System.out.println("Give a positive integer");
		int posInt = invoer.nextInt();
		int x = posInt - 1;
		

		if(posInt==2)
		{
			System.out.println("This is a real prime number!");
		}
		
		while(x>1)
		{
			
			if(posInt % x==0)
			{
				System.out.println("This is not a real prime number!");
				x=1;
			}
			
			else
			{
				if(x==2)
				{
					System.out.println("This is a prime number!");
				}
				x = x -1;
			}
		
		}
		
		String primeNumbers = "These are the prime numbers: ";
		int i;
		
		for(i = posInt; i>1; i=i-1)
		{
			x = i - 1;
			while(x>1)
			{
			
				if(i % x==0)
				{
					x=1;
				}
			
				else
				{
					if(x==2)
					{
						primeNumbers = primeNumbers + i + ", ";
					}
					x = x -1;
					
				}
		
			}
		}
		if(posInt>2)
		{
			primeNumbers = primeNumbers + 2;
		}
		System.out.println(primeNumbers);
		System.out.println("TEST 1");
		System.out.println("TEST 2");
		
	}
}
