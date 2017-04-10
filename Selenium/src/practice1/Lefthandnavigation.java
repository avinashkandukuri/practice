package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lefthandnavigation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.linkText("cruises")).click();
		String txt.driver.findElement(By.ByCssSelector) 
		driver.findElement(By.name("userName")).sendKeys("avinash3394");
		driver.findElement(By.name("password")).sendKeys("kandukuri3394");
	}

}
