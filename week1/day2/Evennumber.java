package week1.day2;

public class Evennumber {

	public static void main(String[] args) {

		//using normal FOR loop
		System.out.println("Even numbers using Incremental FOR loop");
		for (int i = 1; i <=30; i++) {
	        if(i%2 == 0)
	        {
			System.out.println(i);
			
	        }
		}
		
		//using Reverse FOR loop
		System.out.println("Even numbers using Reverse FOR loop");
		for (int i = 30; i >= 1; i--) {
			if (i%2 == 0) {
				System.out.println(i);
			}
		}
		
	}
	
}
