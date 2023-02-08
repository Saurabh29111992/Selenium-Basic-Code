package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLoginButton_Font_Color 
{

  public static void main(String args[]) throws InterruptedException 
  {
	  
	  
	    //Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://www.facebook.com/login/");
        Thread.sleep(2000);
	  
	    //Select Continue button 
        WebElement ele = driver.findElement(By.xpath("//*[@id=\"loginbutton\"]")); 
        Thread.sleep(2000);
	  
	    //Background Color
        String backcolor = ele.getCssValue("background-color");
        System.out.println("Background color : "+backcolor);
       
        //Font Color Code
        String color = Color.fromString(backcolor).asHex();
        System.out.println("Background color code : "+color); 
       
        //Font Size
        String size = ele.getCssValue("font-size");
        System.out.println("Font size : "+size);
       
        //Font Family
        String fontfamily = ele.getCssValue("font-family");
        System.out.println("Font Family : "+fontfamily);
  
   }

}
