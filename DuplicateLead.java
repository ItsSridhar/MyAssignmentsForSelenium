package week2day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("username")).sendKeys("demoSalesManager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();

		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("sridharan311@yahoo.com");

		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(6000);

		WebElement ele = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a)[1]"));

		String leadsname = ele.getText();

		Thread.sleep(5000);

		System.out.println("The firstname of the first lead is " + leadsname);

		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//tr[1]/td[1]/div/a)[1]")).click();

		driver.findElement(By.linkText("Duplicate Lead")).click();

		driver.getTitle();

		String title = driver.getTitle();

		if (title.contains("Duplicate Lead")) {
			System.out.println("The name of the title is " + title);
		} else {
			System.out.println("There is an error in printing the title");
		}
		
		Thread.sleep(5000);

		driver.findElement(By.className("smallSubmit")).click();

		Thread.sleep(5000);

		WebElement ele1 = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr/td[3]/div/a)[2]"));

		String leadsname1 = ele1.getText();

		System.out.println("The name of the duplicate lead is " + leadsname1);

		if (leadsname == leadsname1) {
			System.out.println("The name of the duplicate lead is same as that of the original lead");
		}

		else {
			System.out.println("There is an error in name");
		}

		Thread.sleep(3000);

		driver.close();

	}
	

}
