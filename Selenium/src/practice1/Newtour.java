package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Newtour {
	WebDriver driver;

	@BeforeMethod
	public void broswer() {
		@SuppressWarnings("unused")
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@Test
	public void tour() throws InterruptedException {
		// TODO Auto-generated method stub
		broswertitle();
		register();
		signon();
		lefthandnavigation();

	}

	public void broswertitle() {

		String baseUrl = "http://newtours.demoaut.com";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		driver.get(baseUrl);
		actualTitle = driver.getTitle();
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed");
		}

	}

	public void register() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Avinash");
		driver.findElement(By.name("lastName")).sendKeys("Kandukuri");
		driver.findElement(By.name("phone")).sendKeys("2702933339");
		driver.findElement(By.id("userName")).sendKeys("avinashkandukuri8@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.name("address1")).sendKeys("1602 miller apt 1");
		driver.findElement(By.name("address2")).sendKeys("murray ky");
		driver.findElement(By.name("city")).sendKeys("murray");
		driver.findElement(By.name("state")).sendKeys("KY");
		driver.findElement(By.name("postalCode")).sendKeys("42071");
		driver.findElement(By.name("country")).click();
		driver.findElement(By.name("country")).sendKeys("United States");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("avinash3394");
		driver.findElement(By.name("password")).sendKeys("kandukuri3394");
		driver.findElement(By.name("confirmPassword")).sendKeys("kandukuri3394");
		driver.findElement(By.name("register")).click();

	}

	public void invalidsignon() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("avinash");
		driver.findElement(By.name("password")).sendKeys("kandukuri");
		driver.findElement(By.name("login")).click();

	}

	public void signon() throws InterruptedException {

		Thread.sleep(3000);
		driver.findElement(By.linkText("SIGN-ON")).click();
		driver.findElement(By.name("userName")).sendKeys("avinash3394");
		driver.findElement(By.name("password")).sendKeys("kandukuri3394");
		driver.findElement(By.name("login")).click();

	}

	public void lefthandnavigation() throws InterruptedException {

		driver.findElement(By.linkText("Home")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Flights")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Hotels")).click();
		driver.findElement(By.linkText("cruises")).click();

	}

	@AfterMethod
	public void closebroswer() {
		driver.close();

	}
}
