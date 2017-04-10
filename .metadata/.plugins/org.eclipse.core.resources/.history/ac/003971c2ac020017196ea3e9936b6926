package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlightfacebook {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.id("email"));
		Webelementhighlight.hightlight(driver, username);
		username.sendKeys("Avinash");
		WebElement password = driver.findElement(By.id("pass"));
		Webelementhighlight.hightlight(driver, password);
		password.sendKeys("passw123");
		WebElement button = driver.findElement(By.id("loginbutton"));
		Webelementhighlight.hightlight(driver, button);
		button.click();
		driver.quit();
	}
}