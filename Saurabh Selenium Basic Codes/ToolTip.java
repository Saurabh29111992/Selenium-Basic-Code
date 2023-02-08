package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ToolTip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		//Open the link
		driver.get("https://www.w3schools.com/mysql/default.asp");
		
		//Maximize the Window
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        //Action Method
        WebElement ele = driver.findElement(By.id("navbtn_references"));
        ele.click();
   //   Actions action = new Actions(driver);
   //   action.moveToElement(ele).perform();
        
        //Handling ToolTip
        String expectedtooltip = "References";
	    String actualtooltip = driver.findElement(By.xpath("//*[@id=\"navbtn_references\"]")).getAttribute("title");
		System.out.println(actualtooltip);
      		
		 
		//Verify ToolTip
		if(actualtooltip.equals(expectedtooltip))
		{
			System.out.println("Test case Passed");
		}
		else
		{
			System.out.println("Test case Failed");
		}
		
		
	}

}
