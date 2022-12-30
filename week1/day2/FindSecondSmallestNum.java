package week1.day2;

import java.util.Arrays;

public class FindSecondSmallestNum {

		public static void main(String[] args) {
			int [] inputArray = {23,45,67,32,89,22};
			Arrays.sort(inputArray);
			System.out.println("The second smallest number in the array is: "+ inputArray[inputArray.length-5]);
		}
		
}
