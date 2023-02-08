package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick 
{

	public static void main(String args[]) throws InterruptedException 
    {
		  
			// Launch chrome browser
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			// Open Url
			driver.get("https://blazedemo.com/");
			Thread.sleep(2000);

			// WebElement rightclick =
			// driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));

			Actions action = new Actions(driver);
			action.contextClick(driver.findElement(By.xpath("/html/body/div[3]/form/div/input"))).build().perform();

			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ARROW_DOWN).build().perform();
			action.sendKeys(Keys.ENTER).build().perform();

			// WebElement
			// inspect=driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));
           
	  }
}