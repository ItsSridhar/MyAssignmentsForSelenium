package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonShoes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		// Launch Chrome  
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		// Load https://www.amazon.in/
		
		driver.get("https://www.amazon.in/");
		
		// add  implicitlyWait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		     
		// Type "Bags" in the Search box
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags");
		Thread.sleep(4000);
		     
		// Choose the 	 item in the result (bags for boys)
		
		driver.findElement(By.xpath("//div[@aria-label='bags for boys']")).click();
		Thread.sleep(2000);
		
		// Print the total number of results (like 50000)
		// 1-48 of over 50,000 results for "bags for boys"
		String PageResult = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(PageResult);
		
		
		// Select the first 2 brands in the left menu
		
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']/ul/span/li/span/a/div/label/i)[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@id='brandsRefinements']/ul/span/li/span/a/div/label/i)[2]")).click();
		Thread.sleep(5000);
		// (like American Tourister, Generic)	
		// Choose New Arrivals (Sort)
		
		driver.findElement(By.xpath("//span[text()='Last 90 days']")).click();
		Thread.sleep(5000);
		
		// Print the first resulting bag info (name, discounted price)
		
		String BagName = driver.findElement(By.xpath("//h2[@class='a-size-mini s-line-clamp-1']/span")).getText();
		System.out.println("The name of the bag is " + BagName);
		
		String Price = driver.findElement(By.xpath("//span[@class='a-price-whole'][1]")).getText();
		System.out.println("The price of the bag is " + Price);
		
		// Get the page title and close the browser(driver.close())	
        
	    String PageTitle = driver.getTitle();
	    System.out.println("The title of the page is " + PageTitle);
	    Thread.sleep(3000);
	    driver.close();
	}

}
