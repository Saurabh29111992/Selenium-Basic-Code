package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Key_Handling {

	public static void main(String[] args) throws InterruptedException 
	{
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		//Enter First Name
/*		driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys("Saurabh");
		Thread.sleep(2000);
		
		//Select all text
		driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys(Keys.CONTROL,"a");
		Thread.sleep(2000);
		
		//Copy all text
		driver.findElement(By.xpath("//input[@id='vfb-5']")).sendKeys(Keys.CONTROL,"c");
		Thread.sleep(2000);
		
		//Paste the text
		driver.findElement(By.xpath("//input[@id='vfb-7']")).sendKeys(Keys.CONTROL,"v");
		Thread.sleep(2000);
		
		//Click on Radio button(Male/Female)
		driver.findElement(By.xpath("//input[@id='vfb-8-1']")).click();//male
		Thread.sleep(2000);
		
		//Enter the Address in Address textbox 
		driver.findElement(By.xpath("//input[@id='vfb-13-address']")).sendKeys("Pune, Maharashtra");
		Thread.sleep(2000);
		
		
		//Performing Action Method for Page-down
		Actions down = new Actions(driver);
	    down.sendKeys(Keys.PAGE_DOWN).build().perform();
         Thread.sleep(2000);
         
	    //Performing Action Method for Page-down
	    Actions up = new Actions(driver);
	    up.sendKeys(Keys.PAGE_UP).build().perform(); 
		
		//Select the Country drop down list
		
		WebElement ele=driver.findElement(By.xpath("//select[@id='vfb-13-country']"));
		Select sel=new Select(ele);
	//	sel.selectByIndex(77);
	//	sel.selectByVisibleText("India");
		sel.selectByValue("India");
		*/
		
		//DatePicker (Date of Demo)
		driver.findElement(By.xpath("//input[@id='vfb-18']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[contains(text(),'February')]")).click();
		
		
		
	}

}
