package aadd;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Compare 
{
	public static void main(String args[]) throws InterruptedException 
	  {
		  
		  System.setProperty("Webdriver.Chrome.driver", "C:\\Users\\maana\\OneDrive\\Desktop\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			// Open browser
			driver.get("https://www.w3schools.com/");
	        Thread.sleep(2000);
	  
	       //Extract the Title
	       String actualtitle = driver.getTitle();
	       System.out.println(actualtitle);
	       String expectedTitle = "W3Schools Online Web Tutorials";
	     
	      //Validating Title
	      if(actualtitle.equals(expectedTitle)) //condition
	    	  System.out.println("Title is matched");
	      else
	    	  System.out.println("Title is not matched"); 
	      
	      
	      //Equal Ignore Case
	      
	/*      if(actualtitle.equalsIgnoreCase(expectedTitle)) //condition
	    	  System.out.println("Title is matched");
	      else
	    	  System.out.println("Title is not matched");*/
	  
	  }
}
