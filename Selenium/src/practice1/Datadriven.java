package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Datadriven {
	WebDriver driver;

	@Test(dataProvider = "logindata")
	public void login(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println("title of the page" + title);
		Assert.assertTrue(driver.getTitle().contains("Facebook"));
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		
	}

	@AfterMethod
	public void driverclose() {
		driver.close();
	}

	@DataProvider(name = "logindata")
	public Object[][] passData() {

		Object[][] data = new Object[3][2];
		data[0][0] = "avinash";
		data[0][1] = "avinash123";

		data[1][0] = "kavinash";
		data[1][1] = "avinash";

		data[2][0] = "avinash123";
		data[2][1] = "k_avinash123";
		return data;
	}
}