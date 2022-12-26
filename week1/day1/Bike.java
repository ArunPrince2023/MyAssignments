package week1.day1;

public class Bike {

	public static void main(String[] args) {
		// Creating object for Car class
		Car c2 = new Car();
		// Using object c2, calling the methods of Car class - applyBrake and soundHorn
		c2.applyBrake();
		c2.soundHorn();
		//Note: As per assignment created object for bike as b3 but we can't invoke the method of Car class 
		//      using object b3. Hence commented 3 lines of code below
		//Bike b3 = new Bike();
	}
	
}
