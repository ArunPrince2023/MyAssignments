package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Asg4LeafGroundDropDwns {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		
		//Dropdown for Favourite UI Automation Tool
		WebElement wElement1 = driver.findElement(By.className("ui-selectonemenu"));
		Select drop1 = new Select(wElement1);
		drop1.selectByVisibleText("Selenium");

		//Choose preferred Country
		
		driver.findElement(By.id("j_idt87:country_label")).click();		
		driver.findElement(By.id("j_idt87:country_3")).click();
		
	}
	
}
