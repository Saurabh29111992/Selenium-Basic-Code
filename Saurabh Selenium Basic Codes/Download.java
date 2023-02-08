package aadd;

import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Download 
{
	public static void main(String[] args) throws InterruptedException 
	{
        String location = System.getProperty("user.dir")+"\\Downloads";
	    
		HashMap preference = new HashMap(); //hashmap contains key and value place
	    preference.put("downloads.default_directory", location);
	    preference.put("plugins.always_open_pdf_externally", true);
		
		ChromeOptions options = new ChromeOptions(); //Predefine class which have to import
		options.setExperimentalOption("prefs", preference);
		
		// Launch chrome browser
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		
		//Open browser
		driver.get("https://www.tutorialspoint.com/selenium/selenium_pdf_version.htm");
		Thread.sleep(2000);
		
		//To maximize the Window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Scroll
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,500)");  //Horizonatal , Vertical
		Thread.sleep(2000);			
		
		//Alert Method
	    Alert alrt = driver.switchTo().alert();
//	    System.out.println(alrt.getText());
//	    Thread.sleep(2000);
	    alrt.accept();
	    Thread.sleep(2000); 
		
	    //Click on Download Selenium Tutorial (PDF Version)
		driver.findElement(By.xpath("//*[@id=\"mainContent\"]/h1[2]/a/img")).click();
		Thread.sleep(2000);
		
	    //Click on download pdf
		driver.findElement(By.xpath("//*[@id=\"icon\"]/iron-icon")).click();
		
	}
}
