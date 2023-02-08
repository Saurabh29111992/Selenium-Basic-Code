package aadd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload 
{

	public static void main(String[] args) throws InterruptedException 
	{

        // Launch chrome browser
		WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		Thread.sleep(2000);

		// To maximize the Window
		// driver.manage().window().maximize();
		// Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/form/input[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("input-4")).sendKeys("C:\\Users\\maana\\OneDrive\\Desktop\\Scenery.jpg");
		Thread.sleep(2000);

	}

}
