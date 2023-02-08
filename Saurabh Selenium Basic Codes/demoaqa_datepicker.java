package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoaqa_datepicker 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//14 February 2023 
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open browser
		driver.get("https://demoqa.com/automation-practice-form");
		
		//Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Click on date picker
		driver.findElement(By.xpath("//*[@id=\"dateOfBirthInput\"]")).click();
		
	    //Select Month from drop down list
		WebElement ele=driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]"));
		Select sel=new Select(ele);
        sel.selectByIndex(1);//February
		Thread.sleep(2000);
       
		//Select Month from drop down list
		WebElement ele1 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]"));
        Select sel1 = new Select(ele1);
        sel1.selectByValue("2023");//2023
		Thread.sleep(2000);
		
		//Click on date
		driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[5]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[3]/div[3]")).click();	//14th	
	    
	  
	}

}
