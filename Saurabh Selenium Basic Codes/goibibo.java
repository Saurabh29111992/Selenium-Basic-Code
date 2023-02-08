package aadd;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class goibibo 
{
	public static void main(String[] args) throws InterruptedException 
	
	{
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only+Goibibo&utm_term=%21SEM%21DF%21G%21Brand%21RSA%21108599293%216504095653%21602838584772%21e%21goibibo%21m%21&gclid=EAIaIQobChMIqrjEidT4-wIVyFVgCh0WygAfEAAYASAAEgJXi_D_BwE");
		Thread.sleep(2000);
	
	   //Click on Date Picker
	   driver.findElement(By.xpath("//p[contains(text(),'Wednesday')]")).click();
	   Thread.sleep(2000);   
	   
	   //Click on Year & Month
	   String month1= "February 2023";
	   while(true) 
	   {
	      String text = driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[1]/div")).getText(); //Feb 2023
	      if(text.equals(month1))
	      {
	    	  break;
	      }
	      else
	      {
	    	  driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[1]/span[2]")).click();
	    	  Thread.sleep(2000);
	    	  
	      }
	   }
	  
	   
	
	   //Click on Search button
	//   driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[8]/div/button")).click();
	   
	   
	
//	   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/div/div[2]/div[5]/div/div/div/div/div/input")).click();
//	   Thread.sleep(2000);
//	   
//	  //Click on Month & Year
//	   driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]")).click();//Feb 2023
//	   Thread.sleep(2000);
//	   
	   //Select Date
//	   String date = "7";
//	   List<WebElement>AllDate = driver.findElements(By.xpath("//body/div[@id='root']/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[2]/div[3]/p[1]"));
//	   
//	   for(WebElement ele:AllDate)
//	   {
//	      if(date.equals(date))//compare between if to string
//	    	  Thread.sleep(2000);
//	      ele.click();
//	      break;
//	   }
//	     
	   
	   
	   //Method 2. Click on Date
	   driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div[3]/div[2]/div[2]/div/div/div[2]/div[2]/div[3]/div[2]/div[3]")).click();
        Thread.sleep(2000);
	   
       //click on done      
       driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/div/div[1]/div[3]/div[2]/div[3]/span[2]")).click();
	      
	   driver.close();
	   
}
}