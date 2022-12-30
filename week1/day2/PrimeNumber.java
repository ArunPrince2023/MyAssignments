package week1.day2;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		int key = 13;
		int remainder = 0;
				
		for(int i=1;i<=key;i++)
		{
			
			if (key%i == 0)	
			{
				remainder++;
			}
		}
		
		if (remainder == 2)		{
			System.out.println(key+ " is a Prime Number!");
		}
		else
		{
			System.out.println(key+ " is a NOT a Prime Number!");
		}	

	}
	
}
