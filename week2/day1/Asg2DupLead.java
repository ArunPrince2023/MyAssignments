package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asg2DupLead {

	public static void main(String[] args) {
		
		//Page load
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Username
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Login Button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA link
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		//Click Leads tab
		
		driver.findElement(By.linkText("Leads")).click();
		
		//Click Create Lead
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Enter Company Name
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Voltas");
		
		//Enter First Name
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ramesh");

		//Enter Last Name
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");		
		
		//Enter FirstName(Local)
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ram");				
		
		//Enter Department Name
		
		driver.findElement(By.name("departmentName")).sendKeys("Cooling Equipments");
		
		//Enter Description
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("AC Manufacturing");
		
		//Enter E-Mail Address
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("Ramesh.kumar23@gmail.com");
		
		//Click Create Lead Button
		
		driver.findElement(By.name("submitButton")).click();
		
		//Title of the Resulting page after clicking Create Lead Button
		
		String Title1 = driver.getTitle();
		System.out.println("The title of this page is: "+Title1);
		
		//Click Duplicate Lead button
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		//Clear the Company Name field and enter a new Company Name - Samsung
		
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Samsung");
		
		//Clear the First Name field and enter a new First Name - Rakesh
		
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rakesh");
		
		//Click Create Lead Button
		
		driver.findElement(By.name("submitButton")).click();
		
		//Get the title of the resulting page
		
		String title2 = driver.getTitle();
		System.out.println("The title of this page is: "+title2);
	}
	
}
