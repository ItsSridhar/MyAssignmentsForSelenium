package week2day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("SridharDemo");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr[1]//td[1]//div/a)[1]")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Updated Company Name");
		
		WebElement element1 = driver.findElement(By.id("updateLeadForm_companyName"));
		String Company = element1.getText();
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		WebElement element2 = driver.findElement(By.xpath("//span[@id='viewLead_companyName_sp']"));
		String updatedcompany = element2.getText();

		if (updatedcompany.contains(Company)) {
			System.out.println("Company name is updated");
		} else {
			System.out.println("There is some error in updating company name");
		}

		Thread.sleep(2000);
		driver.close();

		
		
		
		

	}

}
