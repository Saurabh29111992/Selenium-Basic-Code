package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class KeyHandling 
{

	public static void main(String[] args) throws InterruptedException {
		
		//Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://demo.automationtesting.in/Register.html");

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("Dhiraj");
		Thread.sleep(1000);
		//select all
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(Keys.CONTROL,"a");
		Thread.sleep(1000);
		//copy
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys(Keys.CONTROL,"c");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(Keys.CONTROL,"V");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(Keys.CLEAR);

	
		

		
		
		
		
		
		
		
		
		
		
		//paste
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(Keys.CONTROL,"v");
//		Thread.sleep(1000);
//		//select all
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(Keys.CONTROL,"a");
//		Thread.sleep(1000);
//		//delet
//		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys(Keys.DELETE);
		
		
		

	}

}
