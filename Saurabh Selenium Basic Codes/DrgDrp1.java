package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrgDrp1 
{
	public static void main(String ar[]) throws InterruptedException 
	   {
		   
		    //Launch chrome browser
		    WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

			// Open Url
			driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
			Thread.sleep(2000);
	   
	        WebElement oslobox = driver.findElement(By.id("box1"));
	        WebElement norway = driver.findElement(By.id("box101"));
			
			Actions action = new Actions(driver);
	        
	        action.dragAndDrop(oslobox, norway).build().perform();
	   
	   
	   }
}
