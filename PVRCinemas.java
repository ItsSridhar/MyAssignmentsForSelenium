package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRCinemas {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
		// Launch the Url  https://www.pvrcinemas.com/
		
		driver.get("https://www.pvrcinemas.com/");
				
		// Click  on Movie Library under hamburger button	
		
		driver.findElement(By.xpath("//span[@class='icon-glow cursor_pointer']/div")).click();
		driver.findElement(By.xpath("//a[text()='Movie Library']")).click();
		Thread.sleep(1000);

		// Select the City -->chennai
		
		WebElement source1 = driver.findElement(By.name("city"));
		Select dropdown1 = new Select(source1);
		dropdown1.selectByVisibleText("Chennai");
		// Select the Genre-->Animation
		
		WebElement source2 = driver.findElement(By.name("genre"));
		Select dropdown2 = new Select(source2);
		dropdown2.selectByVisibleText("ANIMATION");

		// Select the Language-->english
		
		WebElement source3 = driver.findElement(By.name("lang"));
		Select dropdown3 = new Select(source3);
		dropdown3.selectByVisibleText("ENGLISH");

		// Click on Apply
		
		driver.findElement(By.xpath("//button[contains(@class,'btn-submit')]")).click();
		Thread.sleep(4000);
		// Click on first resulting animation movie
		
		driver.findElement(By.xpath("(//div[@class='movie-wrapper ng-star-inserted']/div[1])[1]")).click();		
		Thread.sleep(2000);
		// Click proceed to book
		
		driver.findElement(By.xpath("//div[@class='header-info-fixed']/button")).click();
		Thread.sleep(2000);
		
		// Enter the all fields  cinema , Name, date, Prefered show time, no of seats, food and beverages,Email and Mobile
		WebElement source4 = driver.findElement(By.xpath("//select[@id='cinemaName']"));
		Select dropdown4 = new Select(source4);
		dropdown4.selectByIndex(2);
		
		driver.findElement(By.xpath("//div[@class='pvr-datepicker']")).click();
		driver.findElement(By.xpath("//span[contains(@class,'is-selected')]")).click();
		
		WebElement source5 = driver.findElement(By.xpath("//select[@name='timings']"));
		Select dropdown5 = new Select(source5);
		dropdown5.selectByIndex(2);
		
		driver.findElement(By.name("noOfTickets")).sendKeys("5");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sridharan");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sridharan311@yahoo.com");
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("1234567890");
		
		WebElement source6= driver.findElement(By.xpath("//select[@name='food']"));
		Select dropdown6 = new Select(source6);
		dropdown6.selectByIndex(1);
				
		driver.findElement(By.xpath("//input[@name='comment']")).sendKeys("No other requierements");
		
		driver.findElement(By.xpath("//label[contains(@class,'custom-radio')]")).click();
		
		// Click on  Send Request
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		driver.findElement(By.xpath("(//button[text()='CANCEL'])[2]")).click();

		//Close OTP Dialog 

		driver.findElement(By.xpath("//button[text()='×']")).click();
	
		// Verify the title of the page
		
		String PageTitle = driver.getTitle();
		
		if(PageTitle.equals("Movie Library")) {
 
			System.out.println("The " +PageTitle+ " is Matching" );
		}
		else {
			System.out.println("The " +PageTitle+ " is not Matching" );
		}
		
		driver.close();		

	}

}
