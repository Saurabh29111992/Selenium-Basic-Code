package aadd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoTicketBooking 
{
	
	public static void main(String ar[]) throws InterruptedException 
	{

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open browser
		driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
		Thread.sleep(2000);
		
		//Maximizing window
        driver.manage().window().maximize();
		
		//Scroll
	    JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,1700)");  //Horizontal , Vertical
		
//	    //Passenger Details (1) Enter First Name
//	    driver.findElement(By.id("travname")).sendKeys("Saurabh");
//	     
//	    //(2) Enter Last Name
//	    driver.findElement(By.id("travlastname")).sendKeys("Bankar"); 
		
	
	    //Select Country
	    WebElement ele = driver.findElement(By.id("select2-billing_country-container"));
	    Select country = new Select(ele);
	    country.selectByIndex(4);
	     
	    //Select State
//	    WebElement ele1 = driver.findElement(By.id("select2-billing_state-container"));
//	    Select state = new Select(ele1);
//	    state.selectByIndex(15);
	     
        Select sel = new Select(driver.findElement(By.id("select2-billing_state-container")));
	    
	    List<WebElement> alloptions = sel.getOptions();
	    
	    for(WebElement options: alloptions)
	    
            System.out.println(options.getText());
        
	     sel.selectByIndex(15);
	
	}
	
	

}
