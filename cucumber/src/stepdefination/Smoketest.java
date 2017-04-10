package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Smoketest {

	
	WebDriver driver;
		@Given("^open firefox and start application$")
		public void open_firefox_and_start_application() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
			driver = new ChromeDriver();
			
			driver.get("http://facebook.com/");
			driver.manage().window().maximize();
		    
		}

		@When("^I enter valid username and password$")
		public void I_enter_valid_username_and_password() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			driver.findElement(By.id("email")).sendKeys("username");
			driver.findElement(By.id("pass")).sendKeys("password");
		    
		}

		@Then("^user should able to login succesfully$")
		public void user_should_able_to_login_succesfully() throws Throwable {
		    // Express the Regexp above with the code you wish you had
			
			driver.findElement(By.id("loginbutton")).click();
		}
		
	}


