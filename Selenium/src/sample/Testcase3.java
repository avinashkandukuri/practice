package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testcase3 {
@Test
	public  void valid() {
		// TODO Auto-generated method stub

	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("avinashkandukuri8@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("K_avinash123");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();

	}

}