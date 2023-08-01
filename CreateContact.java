package week2day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		
        driver.get("http://leaftaps.com/opentaps/control/login");
		
        driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Contacts")).click();
	
		driver.findElement(By.linkText("Create Contact")).click();
		
//		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Altimetrix");

		driver.findElement(By.id("firstNameField")).sendKeys("Sridharan");
		
		driver.findElement(By.id("lastNameField")).sendKeys("Radhakrishnan");
	
    	driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sri");
    	
    	driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("R");

		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("QE");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Working as a Test Engineer");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("sridharan311@gmail.com");
    	
		WebElement source = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		
		Select dropdown = new Select(source);
		
		dropdown.selectByVisibleText("New York");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateContactForm_description")).clear();
		
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Nothing much");
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
			
		driver.getTitle();
		
		String title = driver.getTitle();
		
		System.out.println("The title of the page is " +title);
		
	}

}
