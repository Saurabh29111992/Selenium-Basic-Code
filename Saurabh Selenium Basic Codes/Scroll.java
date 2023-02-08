package aadd;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroll 
{

	public static void main(String[] args) 
	{
		// Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://www.javatpoint.com/");
		
		//Scroll
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scrollBy(0,3500)");  //Horizontal , Vertical
			
		

	}

}
