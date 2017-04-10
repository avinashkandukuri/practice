package practice1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Softassertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		String name= driver.getTitle();
		System.out.println("title of the page" + name);
		String expectedtitle = "Wellcome to selenium";
		SoftAssert Assertion = new SoftAssert();
		System.out.println("print the list" );
		Assertion.assertEquals(name, expectedtitle );
		System.out.println(" test is done ");
		Assertion.assertAll();
	
	}

}
