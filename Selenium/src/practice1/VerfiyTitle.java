package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerfiyTitle {
@Test
	public static void title(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com/");
		String title =  driver.getTitle();
		System.out.println("title od facebook" + title);
		String Expectedtitle = "facebook";
		System.out.println(Expectedtitle);
		Assert.assertTrue(Expectedtitle.contains("facebook"), "print and give the message ");
		Assert.assertEquals(title, Expectedtitle);
		System.out.println("test complete");
		driver.close();
	}

}
