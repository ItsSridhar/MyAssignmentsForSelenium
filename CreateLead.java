package week2day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Altimetrix");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sridharan");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Radhakrishnan");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sri");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QE");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Working as a Test Engineer");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sridharan311@gmail.com");
		
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.getTitle();
		
		String title = driver.getTitle();
		
		System.out.println("The title of the page is " +title);
		
				
	}

}
