package aadd;

import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedBusDatePicker 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// 02-May-2023
		String expectedDay = "20";
		String expectedMonth = "May";
		String expectedYear = "2023";

		// Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Open Url
		driver.get("https://www.sastasafar.com/airline/air-india?utm_source=google_ss_airindia&gclid=EAIaIQobChMIqtWFi_CW_AIVDdGWCh1sDQEHEAAYASAAEgLnsfD_BwE");
		Thread.sleep(2000);

		// Maximize the window
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Find Date picker WebElement to perform click action
		WebElement datepicker = driver.findElement(By.name("trip_start_date"));
		datepicker.click();
		Thread.sleep(2000);

		while (true) 
		{
			String Month = driver.findElement(By.xpath("//*[@id=\"dateNew_root\"]/div/div/div/div/div[1]/div[1]")).getText(); // May
			String Year = driver.findElement(By.xpath("//*[@id=\"dateNew_root\"]/div/div/div/div/div[1]/div[2]")).getText(); // 2023
			Thread.sleep(2000);

			if (Month.equals(expectedMonth) && Year.equals(expectedYear)) 
			{
				List<WebElement> daysList = driver.findElements(By.id("dateNew_1684521000000"));

				for (WebElement e : daysList) 
				{
					String Days = e.getText();

					if (Days.equals(expectedDay)) 
					{
						e.click();
						break;
					}

				}
				  break;
			} 
			else 
			{
				driver.findElement(By.xpath("//*[@id=\"dateNew_root\"]/div/div/div/div/div[1]/div[4]")).click(); // Click on next button
																												
			}
			   
	    }
            
	}
}