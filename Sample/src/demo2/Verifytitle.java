package demo2;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;

public class Verifytitle {

public void facebooktitle() {
		// TODO Auto-generated method stub
		
	ExtentReports extent = new ExtentReports();
	

	WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("http://facebook.com/");
		String title= driver.getTitle();
		System.out.println("title of facebook"+ title);
		AssertJUnit.assertEquals("Facebook", title);
	}

}
