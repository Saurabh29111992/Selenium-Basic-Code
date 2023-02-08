package aadd;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpencCart 
{

    public static void main(String[] args) throws InterruptedException 
    {
		
		// Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Time duration in Seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open the Link
		driver.get("https://demo.opencart.com/admin/index.php?route=common/login");
		Thread.sleep(2000);

		// Window Maximize
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Enter user name
		WebElement username = driver.findElement(By.xpath("//*[@id=\"input-username\"]"));
		username.clear();
		username.sendKeys("demo");
		Thread.sleep(2000);

		// Enter password
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
		pass.clear();
		pass.sendKeys("demo");
		Thread.sleep(2000);

		// Click on Login button
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button")).click();
		Thread.sleep(2000);

		// Click on Cross button
		driver.findElement(By.xpath("//*[@id=\"modal-security\"]/div/div/div[1]/button")).click();

		// Click on Customers
		driver.findElement(By.xpath("//*[@id=\"menu-customer\"]/a")).click();
		Thread.sleep(2000);

		// Click on SubMenu Customer
		driver.findElement(By.xpath("//*[@id=\"collapse-5\"]/li[1]/a")).click();
		Thread.sleep(2000);

		// To print Web Navigation Table pages
		String text = driver.findElement(By.xpath("//*[@id=\"form-customer\"]/div[2]/div[2]")).getText();
		// System.out.println(text);
		// int pages = Integer.parseInt(text.substring(text.indexOf(26, -2)));

		// Showing 1 to 10 of 9199(920 Pages)
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(") + 1, text.indexOf("Pages") - 1));
		System.out.println("Total No of Pages : " + total_pages);
		Thread.sleep(2000);

		driver.close();
	     
	  }


}
