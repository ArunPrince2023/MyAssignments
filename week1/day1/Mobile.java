package week1.day1;

public class Mobile {


	public void makeCall() {
		//Method to make call
		String mobileModel = "Samsung Galaxy Note 11";
		Float mobileWeight = 135.67f;
		System.out.println("Making Call...");
		System.out.println(mobileModel);
		System.out.println(mobileWeight);
	}
	
	public void sendMsg() {
		//Method to send message
		boolean isFullCharged = true;
		int mobileCost = 25000;
		System.out.println("Sending message...");
		System.out.println(isFullCharged);
		System.out.println(mobileCost);
	}

	public static void main(String[] args) {
		//Main method
		Mobile mb = new Mobile();
		System.out.println("This is my Mobile");
		mb.makeCall();
		mb.sendMsg();
	}
	
}
