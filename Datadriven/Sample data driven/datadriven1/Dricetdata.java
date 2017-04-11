package datadriven1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dricetdata {
 WebDriver driver;
@Test(dataProvider = "testdata")
	public void test2(String email, String password) {
		// TODO Auto-generated method stub
       
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys(email);
		WebElement pass1 = driver.findElement(By.id("pass"));
		pass1.sendKeys(password);
		pass1.sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//button[text()='Log In']")).click();
}
@AfterMethod		
public void closebroswer(){
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
