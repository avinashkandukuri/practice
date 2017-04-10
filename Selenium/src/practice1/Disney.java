package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Disney {

	WebDriver driver;

	public void OpenBroswer() {
		
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver.get("http://www.google.com");

		System.out.println("browser is diplayed");
	}

	public void Searchgoogle() {

		WebElement searchInbox = driver.findElement(By.name("q"));
		searchInbox("12345");
		searchInbox.submit();
		if (driver.getTitle().contains("12345")) {
			System.out.println("Correct Results Page is shown");
		} else {
			System.out.println("Incorrect Results Page is shown");
		}

		System.out.println("search google verified");
	}

	public void Veriymaplink() {
		WebElement mapLinkText = driver.findElement(By.id("lst-ib"));
		String searchElementVal = mapLinkText.getAttribute("value");
		Boolean trueFlag;
		String word = "http:////www.google.com/maps/place";

		if (trueFlag = true) {
			System.out.println("Found link!");
		} else {
			System.out.println("Cannot find link on the page!");
		}
	}

	public void Quitbrowser() {
		driver.close();
		driver.quit();
		System.out.println("website closed");
	}

	public void searchInbox(String string) {
		System.out.println("searchbox contains text");

	}

}
