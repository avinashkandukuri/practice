package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("search_query")).sendKeys("Star Wars");
		driver.findElement(By.id("search-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).clear();
		driver.findElement(By.name("search_query")).sendKeys("Jay z");
		driver.findElement(By.id("search-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).clear();
		driver.findElement(By.name("search_query")).sendKeys("Bala Krishna");
		driver.findElement(By.id("search-btn")).click();
		// TODO Auto-generated method stub

	}

}
