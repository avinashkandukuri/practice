package practice1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://http://seleniumpractise.blogspot.com/2016/11/handle-bootstrap-model-dialog-in.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Click here to Login']")).click();
		driver.findElement(By.xpath(".//*[@id='myModal']/div/div/div[2]/input[1]")).sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='myModal']/div/div/div[2]/input[2]")).sendKeys("pass123");
		driver.findElement(By.xpath(".//*[@id='myModal']/div/div/div[2]/input[3]")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0, 400)");
		driver.close();
		
	}

}
