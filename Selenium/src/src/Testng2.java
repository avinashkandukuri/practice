package src;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test(priority = 2)
public class Testng2 {
	@Test
	public void google(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		String Actual = driver.getTitle();
				Assert.assertEquals(Actual, "Google");
		System.out.println("google home page");
	}
	@Test
	public void gmail(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com/");
		String Actual = driver.getTitle();
				Assert.assertEquals(Actual, "Gmail");
		System.out.println("gmail home page");
		driver.close();
	}
	@Test(priority = 1)
	public void facebook(){
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		String Actual = driver.getTitle();
				Assert.assertEquals(Actual, "facebook");
		System.out.println("facebook home page");
		driver.close();
	}
	
	@Test(description = "Verify youtube", dependsOnMethods = {"google"} )
	public void Youtube(){	
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.youtube.com/");
		String Actual = driver.getTitle();
				Assert.assertEquals(Actual, "Youtube");
		System.out.println("youtube home page");
		driver.close();
	}
}
