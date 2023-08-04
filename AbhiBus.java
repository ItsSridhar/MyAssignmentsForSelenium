package FirstMarathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
//		Launch Firefox / Chrome and add  implicitlyWait
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
//      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 	
//		Load https://www.abhibus.com/
		
		driver.get("https://www.abhibus.com/");				
		
//	 	 Click on Bus
		
		driver.findElement(By.xpath("(//a[text()='Bus'])[2]")).click();
		
//	     Type "Chennai" in the FROM text box
		
		driver.findElement(By.id("source")).sendKeys("Chennai");	
		
//		 Click the first option from the pop up box
		
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		
//		 Type "Bangalore" in the TO text box
		
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		
//		 Click the first option from the pop up box
		
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
//		 Select tomorrow's date in the Date field
		
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']/following-sibling::td[1]/a")).click();
		
		
//		 Click Search Buses
		
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		
//		 Print the name of the first resulting bus (use .getText())
		
		Thread.sleep(3000);
		String FirstBusName = driver.findElement(By.xpath("(//h2[@class='TravelAgntNm ng-binding'])[1]")).getText();
		System.out.println("The name of the first bus in the search page is " +FirstBusName);
		
//		 Choose SLEEPER in the left menu from Bus Type
		
        driver.findElement(By.xpath("//input[@title='SLEEPER']")).click();
        
//		 Print the first resulting bus seat count(Example:35 Seats Available)(use .getText())
        
         String ResultingBusSeatCount = driver.findElement(By.xpath("(//p[@class='noseats AvailSts ng-binding'])[1]")).getText();
         System.out.println("The total seat availability of the bus is " +ResultingBusSeatCount);
         
//		 Click SelectSeat
         
         driver.findElement(By.xpath("(//span[@class='book'])[1]")).click();
         
//		 Choose any one Available seat
         Thread.sleep(3000);
         driver.findElement(By.xpath("(//a[@class='tooltip tooltipstered'])[9]")).click();
         
//		 Print Seats Selected ,Total Fare
         
         String SeatsSelected = driver.findElement(By.xpath("//span[@id='seatnos']")).getText();
         System.out.println("The Selected Seat is " +SeatsSelected);
         
         String TotalFare = driver.findElement(By.xpath("//span[@id='ticketfare']")).getText();
         System.out.println("The Total Fare is " +TotalFare);
         
//		 Select Boarding Point  and Dropping Point
         
        WebElement source1 = driver.findElement(By.xpath("//select[@name='boardingpoint_id']"));
 		
 		Select dropdown1 = new Select(source1);
 		
 		dropdown1.selectByVisibleText("Vadapalani-23:23");
 		
 		WebElement source2 = driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
 		
 		Select dropdown2 = new Select(source2);
 		
 		dropdown2.selectByVisibleText("Indira Nagar-06:24");
 		
 		
//		 Get the Title of the page(use .getTitle())
 		
 		driver.getTitle();
 		String  PageTitle = driver.getTitle();
 		System.out.println("The title of the page is " +PageTitle);
 		
//		 Close the browser

	    driver.close();
	}

}
