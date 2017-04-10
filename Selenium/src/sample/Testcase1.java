package sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import practice1.UtilityScreen;

public class Testcase1 {
@Test
	public void screenshot () throws Throwable {
		// TODO Auto-generated method stub
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title = driver.getTitle();
		UtilityScreen.Screenshot(driver, "facebook");
		System.out.println("tile of facebook" + title);
		String Expected = "Facebook";
		Assert.assertEquals(title, Expected);
	}

}
