package week2day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Step 2: Launch the chromebrowser
       
		ChromeDriver driver = new ChromeDriver();
		
		// Step 3: Load the URL https://en-gb.facebook.com/
		
        driver.get("https://en-gb.facebook.com/");
        
        // Step 4: Maximise the window
        
		driver.manage().window().maximize();
		
		// Step 5: Add implicit wait
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		// Step 6: Click on Create New Account button
		
		driver.findElement(By.linkText("Create new account")).click();
		
		// Step 7: Enter the first name
		
		driver.findElement(By.name("firstname")).sendKeys("Lavanya");
		
		// Step 8: Enter the last name
		
		driver.findElement(By.name("lastname")).sendKeys("K");
		
		// Step 9: Enter the mobile number
		
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		
		// Step 10: Enterthe password
		
		driver.findElement(By.name("reg_passwd__")).sendKeys("Password@123");
		
		// Step 11: Handle all the three drop downs
		
		WebElement source = driver.findElement(By.name("birthday_day"));
		
		Select dropdown = new Select(source);
		
		dropdown.selectByVisibleText("31");
		
		WebElement source1 = driver.findElement(By.name("birthday_month"));
		
		Select dropdown1 = new Select(source1);
		
		dropdown1.selectByVisibleText("Jan");
		
		WebElement source2 = driver.findElement(By.name("birthday_year"));
		
		Select dropdown2 = new Select(source2);
		
		dropdown2.selectByVisibleText("1990");
		
		// Step 12: Select the radio button "Female" 
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	}

}
