package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Google12345 {
	WebDriver driver;

	public void intial() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("12345");
		element.sendKeys(Keys.ENTER);
		String title = driver.getTitle();
		System.out.println("title of page" + title);
		Assert.assertEquals(title, "google");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// *[@id="hdtb-msb"]/div[1]/div[2]/a
		// *[@id="hdtb-msb"]/div[1]/div[4]/a
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//a[text()='Maps']"))).click().perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Maps']")).click();
		driver.close();
	}
}
