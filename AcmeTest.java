package week2day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AcmeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();

//		 Load url "https://acme-test.uipath.com/login"
		
		driver.get("https://acme-test.uipath.com/login");
		
		driver.manage().window().maximize();
		
//		 Enter email as "kumar.testleaf@gmail.com"
		
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		
//		 Enter Password as "leaf@12"
		
		driver.findElement(By.id("password")).sendKeys("leaf@12");
		
//		 Click login button
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
//		 Get the title of the page and print
		
		String PageTitle = driver.getTitle();
		
		System.out.println("The title of the page is " +PageTitle);
		
//		 Click on Log Out
		
		driver.findElement(By.linkText("Log Out")).click();
		
//		 Close the browser (use -driver.close())
		
		driver.close();

	}

}
