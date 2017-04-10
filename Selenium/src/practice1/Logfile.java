package practice1;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger logger = Logger.getLogger("Logfile");
		PropertyConfigurator.configure("Log4j.properties");

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com/");
		logger.info("brsower open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		logger.info("broswer maximize");
		driver.findElement(By.id("email")).sendKeys("Avinashkandukuri8@gmail.com");
		logger.info("username entered");
		driver.findElement(By.id("pass")).sendKeys("k_avinash123");
		logger.info("password entered ");
		driver.findElement(By.id("loginbutton")).click();
		logger.info("cicked on submit button");

	}

}
