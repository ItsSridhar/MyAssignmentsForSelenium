package week2day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

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

		driver.findElement(By.linkText("Phone")).click();

		driver.findElement(By.name("phoneNumber")).sendKeys("111222333444555");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(6000);

		WebElement ele = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]/td[1]/div/a"));
		String leadID = ele.getText();

		Thread.sleep(5000);
		System.out.println(leadID);

		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//tr[1]/td[1]/div/a")).click();

		driver.findElement(By.className("subMenuButtonDangerous")).click();

		driver.findElement(By.linkText("Find Leads")).click();

		driver.findElement(By.xpath("//input[@name=\"id\"]")).sendKeys(leadID);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(6000);

		boolean verification = driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed();

		if (verification == true) {
			System.out.println("The lead deletion has been successful and there are no records to display");
		} else {
			System.out.println("There is some error");
		}

		driver.close();

	}

}
