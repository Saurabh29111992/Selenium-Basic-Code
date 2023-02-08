package aadd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String dt = "29";
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		
		//Click on date picker
		driver.findElement(By.id("datepicker2")).click();
		
		//Select Month from drop down list
		WebElement ele = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[1]/select[1]"));
		Select sel = new Select(ele);
        sel.selectByIndex(10);    // November
        Thread.sleep(2000);
        
        //Select Year from drop down list
        WebElement ele1 = driver.findElement(By.xpath("//body/div[2]/div[1]/div[2]/div[1]/div[1]/select[2]"));
		Select sel1 = new Select(ele1);
        sel1.selectByIndex(13);   // 2024
        Thread.sleep(2000);
        
        //Click on Date
       
 	    driver.findElement(By.xpath("//a[contains(text(),'29')]")).click();
    
        
        /*   List<WebElement>AllDate = driver.findElements(By.xpath("/html/body/div[2]/div/div[2]/div/table"));
 	   
 	   for(WebElement ele2:AllDate)
 	   {
 		  String date = ele2.getText(); //29
 		   
 		  if(date.equals(date))//compare between if to string
 	      ele2.click();
 	      break;
 	   */
 	   }
        
        		
	}


