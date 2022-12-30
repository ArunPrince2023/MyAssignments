package week1.day2;

public class Palindrome {

	public static void main(String[] args) {

		int num = 34343;
		int element;
		int reverse = 0;
		int remainder;
		element = num;
		
		for ( ;num != 0;num /= 10)
		{
			
			remainder = num % 10; 
			reverse = (reverse * 10) + remainder;
			
		}
		
		if (element == reverse)
		{
			System.out.println("This is a Palindrome number!");
		}
		else
		{
			System.out.println("This is not a Palindrome number!");
		}
		
	}
}
