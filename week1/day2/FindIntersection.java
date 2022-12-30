package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		int [] array1 = {3,2,11,4,6,7};
		int [] array2 = {1,2,8,4,9,7};
				
		System.out.println("The Intersection of two arrays is:");
		
		for(int m = 0; m<array1.length; m++)
		{
			for (int n = 0; n<array2.length; n++)
			{
				if (array1[m]==array2[n])
				{
					System.out.println(array2[n]);  
				}
			}
		}
		
	}
	
}
