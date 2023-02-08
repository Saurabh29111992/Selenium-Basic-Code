package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MonsterIndia_File_Upload 
{

	public static void main(String[] args) throws InterruptedException 
	{

        // Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://www.foundit.in/");
		Thread.sleep(2000);

		// To maximize the Window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Click on Upload Resume
		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]")).click();
		Thread.sleep(2000);

		// Upload Resume
		driver.findElement(By.xpath("//*[@id=\"file-upload\"]")).sendKeys("D:\\SAURABH\\Resume.pdf");
	             
	             
	 }

}
