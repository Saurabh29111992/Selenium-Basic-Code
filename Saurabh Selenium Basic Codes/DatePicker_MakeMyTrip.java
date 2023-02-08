package aadd;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_MakeMyTrip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//05-Feb-2023
		String expectedDay = "5";
		String expectedMonth = "Feb";
		String expectedYear = "2023";
		
		
        WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open browser
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);
	
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Switch to iframe 
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		
	   //Find Date picker WebElement to perform click action
	   WebElement datepicker = driver.findElement(By.id("datepicker"));
	   datepicker.click();
	   Thread.sleep(2000);
	  
	   while(true)
	   {
	   String Month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText(); //February
	   String Year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();   //2023
	   Thread.sleep(2000);
	   
	   if(Month.equals(expectedMonth) && Year.equals(expectedYear))
	   {
	     List <WebElement> daysList = driver.findElements(By.xpath("//table/tbody/tr/td"));
	     
	     for (WebElement e:daysList)
	     {
	         String Days = e.getText();
	         
	         if (Days.equals(expectedDay))
	         {
	        	 e.click();
	        	 break;
	         }
	     
	     } 
	      break; 
	   }
	     else 
	     {
  	        driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //Click on next button
	     } 
	   
	   
	   }	   
	   
	}
}
	


