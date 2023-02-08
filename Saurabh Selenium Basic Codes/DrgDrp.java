package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DrgDrp 
{

   public static void main(String ar[]) throws InterruptedException 
   {
	   
	    //Launch chrome browser
	    WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);

		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		Thread.sleep(2000);

	    action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().perform();
	    Thread.sleep(2000);
	   
	   
	   
	   }
	
}
