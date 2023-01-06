package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg1CreateLead {

	public static void main(String[] args) {
		
		//Setup Object for Chrome driver
		ChromeDriver driver = new ChromeDriver();
		//Load the URL to open the webpage - Leaftaps
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the browser window
		driver.manage().window().maximize();
		//Get the title of the current page - verification step 1
		String title = driver.getTitle();
		System.out.println("The tile of the webpage is: "+title);
		//Find login web element and pass input as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Find password web element and pass input as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Find the Login web element and click on the button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Get the title of the current page - verification step 2
		String title1 = driver.getTitle();
		System.out.println("The tile of the webpage is: "+title1);
		//Click the CSM/SFA link using Linktext locator
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Get the title of the home page - verification step 3
		String title2 = driver.getTitle();
        System.out.println("The tile of the webpage is: "+title2);
        //Click the Leads Tab
        driver.findElement(By.linkText("Leads")).click();
        //Click the Create Lead shortcut button
        driver.findElement(By.linkText("Create Lead")).click();
		//Get the title of the lead page - verification step 4
		String title3 = driver.getTitle();
		System.out.println("The tile of the webpage is: "+title3);
        //Get the input for Company Name mandatory field
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Tata group");
        //Get the input for First Name mandatory field
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ratan");
        //Get the input for Last Name mandatory field
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Tata");
        //Locate the Web element - Source and choose the value 'Employee' using SelectbyVisibletext
        WebElement wElement1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
        //Create object for Select class
        Select drop1 = new Select(wElement1);
        //Select the value 'Employee' from Dropdown of Source field
        drop1.selectByVisibleText("Employee");
        wElement1.click();
        //Locate the Web element - MarketingCampaignId and choose the value 'Pay Per Click Advertising' using SelectbyValue        
        WebElement wElement2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
        //Create object for Select class
        Select drop2 = new Select(wElement2);
        //Select the value 'Pay Per Click Advertising' from Dropdown of MarketingCampaignId field
        drop2.selectByValue("9001");
        wElement2.click();        
        //Locate the Web element - OwnerShip and choose the value 'Corporation' using SelectbyIndex        
        WebElement wElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
        //Create object for Select class
        Select drop3 = new Select(wElement3);
        //Select the value 'Corporation' from Dropdown of Ownership field
        drop3.selectByIndex(5);        
        wElement3.click();
        //Locate the Web element - Country and choose the value 'India' using SelectbyVisibletext      
        WebElement wElement4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
        //Create object for Select class
        Select drop4 = new Select(wElement4);
        wElement4.click();
        //Select the value 'India' from Dropdown of Country field
        drop4.selectByVisibleText("India");
        //Click - Create Lead button using Name Locator
        driver.findElement(By.name("submitButton")).click();
        //Get the title of the resulting page
        String title4 = driver.getTitle();
        System.out.println("The tile of the webpage is: "+title4);
        //Close the browser finally
        //driver.close();
        
	}
	
}
