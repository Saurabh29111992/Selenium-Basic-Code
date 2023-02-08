package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Font_Color_Size 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://blazedemo.com/");
        Thread.sleep(2000);
        
        //Maximize the Window
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //Background Color from Find Flights button
        WebElement ele = driver.findElement(By.xpath("/html/body/div[3]/form/div/input"));
        Thread.sleep(2000);
        
        //Background Font Color
        String backcolor = ele.getCssValue("background-color");
        System.out.println("Background Color : "+backcolor);
        
        //Background Font Color Code
        String hexBackcolor = Color.fromString(backcolor).asHex();
        System.out.println("Background Font Color Code : "+hexBackcolor);
         	
        
        //Font Size
        String fontsize = ele.getCssValue("font-size");
        System.out.println("Font Size : "+fontsize);
        
        
        //Font Family
        String fontfamily = ele.getCssValue("font-family");
        System.out.println("Font family : "+fontfamily);
        
        
        if(hexBackcolor.equals(hexBackcolor))
        	System.out.println("Test for Find Flight is Passed");
        else
        	System.out.println("Test for Find Flight is not Passed");
        Thread.sleep(2000);
      
        
        //To Choose departure city
 /*      WebElement ele = driver.findElement(By.name("fromPort"));
       Select sel = new Select(ele);
       sel.selectByIndex(5);
       Thread.sleep(2000);
       
       Boolean flight1 = driver.findElement(By.xpath("//option[contains(text(),'Mexico City')]")).isSelected();
       
       if(flight1==true)
       {
    	   System.out.println("Test for Find Flight is Passed");
       }
    	   else
    	   {
       	       System.out.println("Test for Find Flight is not Passed");
    	   }
       System.out.println(flight1);
       
       
       //To Choose destination city
  //     WebElement ele1 = driver.findElement(By.name("toPort"));
  //     Select sel1 = new Select(ele1);
  //     sel1.selectByIndex(4);
  //     Thread.sleep(2000);
       
       Boolean flight2 = driver.findElement(By.xpath("//option[contains(text(),'New York')]")).isSelected();
       
       if(flight2==true)
       {
    	   System.out.println("Test for Find Flight is Passed");
       }
    	   else
    	   {
       	       System.out.println("Test for Find Flight is not Passed");
    	   }
       System.out.println(flight2);
       
       //Click on Find Flights button
    //   driver.findElement(By.xpath("//body/div[3]/form[1]/div[1]/input[1]")).click();
    //   Thread.sleep(2000); 
       */
      
       driver.close();
   }
}