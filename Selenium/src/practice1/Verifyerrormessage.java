package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifyerrormessage {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://https://accounts.google.com/AddSession?sacu=1&hl=EN#identifier/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit'][@name='signIn']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Please enter your email.')]")).getAttribute("innerHTML");
	}

}
