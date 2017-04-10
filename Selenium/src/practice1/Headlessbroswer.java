package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Headlessbroswer {
@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new HtmlUnitDriver();
		driver.get("http://www.facebook.com");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("tile of facebook" + title );
		String Expected = "Facebook";
		Assert.assertEquals(title, Expected);
		System.out.println("test passed facebook");
		driver.findElement(By.id("email")).sendKeys("Avinashkandukuri8@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("k_avinash123");
		driver.findElement(By.id("loginbutton")).click();
		driver.close();
		System.out.println("program end");
		
		

		
		
	}

}
