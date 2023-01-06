package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg3CrtAccnt {

	public static void main(String[] args) {
		
		//Create an object for Chrome driver
		
		ChromeDriver driver = new ChromeDriver();
		
		//Open the Leaftaps application using URL and maximize the browser
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		//Enter Username
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		
		//Enter Password
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Login Button
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click CRM/SFA link
		
		driver.findElement(By.partialLinkText("CRM/SFA")).click();		
		
		//Click Accounts Tab
		
		driver.findElement(By.linkText("Accounts")).click();
		
		//Click Create Account
		
		driver.findElement(By.linkText("Create Account")).click();
		
		//Fill Accountname field to be Debit Limited Account
		
		driver.findElement(By.id("accountName")).sendKeys("Debit Limited Account");
		
		//Fill Description to be Selenium Automation Tester
		
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		//Fill Local name field
		
		driver.findElement(By.name("groupNameLocal")).sendKeys("DLA");
		
		//Fill SiteName
		
		driver.findElement(By.name("officeSiteName")).sendKeys("Indira Nagar");
		
		//Fill Annual Review
		
		driver.findElement(By.name("annualRevenue")).sendKeys("50 Lakhs");
		
		//Select ComputerSoftware under Industry dropdown
		
		WebElement wElement1 = driver.findElement(By.name("industryEnumId"));
		Select drop1 = new Select(wElement1);
		drop1.selectByValue("IND_SOFTWARE");
		
		//Select S-Corporation under OwnerShip dropdown using SelectByVisibletext
		
		WebElement wElement2 = driver.findElement(By.name("ownershipEnumId"));
		Select drop2 = new Select(wElement2);
		drop2.selectByVisibleText("S-Corporation");
		
		//Select Employee under Source drop down using SelectByValue
		
		WebElement wElement3 = driver.findElement(By.id("dataSourceId"));
		Select drop3 = new Select(wElement3);
		drop3.selectByValue("LEAD_EMPLOYEE");
		
		//Select eCommerce Site Internal Campaign under Marketing Campaign drop down using SelectbyIndex
		
		WebElement wElement4 = driver.findElement(By.id("marketingCampaignId"));
		Select drop4 = new Select(wElement4);
		drop4.selectByIndex(6);
		
		//Select Texas under State/Province dropdown using SelectByValue
		
		WebElement wElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select drop5 = new Select(wElement5);
		drop5.selectByValue("TX");
		
		//Click Create Account
		
		driver.findElement(By.className("smallSubmit")).click();
		
		//Get the title of the resultant page
		String title1 = driver.getTitle();
		System.out.println("The title of the current page is: "+title1);
		
	}
	
	
}
