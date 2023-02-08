package aadd;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ScreenShot 
{
	public static void main(String[] args) throws IOException 
	{
		// Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open browser
		driver.get("https://www.flipkart.com/");
		
		// Take screenshot
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Create folder & saved
        Files.copy(f,new File ("C:\\Users\\maana\\OneDrive\\Desktop\\Facebook\\flipkart.jpg"));
        
        driver.close();
	
        
     }
}

