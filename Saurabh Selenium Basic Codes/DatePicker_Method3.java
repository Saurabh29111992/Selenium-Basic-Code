package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker_Method3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
	    
	    //Open the link
	    driver.get("https://www.htmlelements.com/demos/datetimepicker/overview/");
	    Thread.sleep(2000);
	    
	    //Maximize the window
	    driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Find Date picker WebElement to perform click action
		WebElement datepicker = driver.findElement(By.id("dateTimePickerba83CalendarButton"));
		datepicker.click();
		Thread.sleep(2000);
		
        //Click on Year & Month
		driver.findElement(By.xpath("//*[@id=\"calendarc14e\"]/div/div[2]/div[1]/div/div[1]"));
		Thread.sleep(2000);
		
		
		//Click on date
		
	
	
	
	
	}

}
