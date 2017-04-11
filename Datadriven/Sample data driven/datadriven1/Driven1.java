package datadriven1;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Driven1 {
	static WebDriver driver;

	@Test(dataProvider = "testdata")
	public static void frist(String username, String password) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		POM driven = new POM();
		driven.typeusername(username);
		driven.typepass(password);
		driven.clickbutton();
	}
	
	@AfterMethod
	public void close(){
		driver.close();
		}

	@DataProvider(name = "testdata")
	public Object[][] getdata() {

		Object[][] obj = new Object[2][2];

		obj[0][0] = "avinashkandukuri8@gmail.com";
		obj[0][1] = "k_avinash123";

		return obj;

	}

}
