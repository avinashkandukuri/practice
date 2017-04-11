package datadriven1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POM {
	
	WebDriver driver;
	By username = By.id("email");
	By password = By.id("pass");
	By loginbutton = By.xpath("//button[text()='Log In']");
	By Signup = By.xpath("//a[text()='Sign up for Facebook']");
	By revover = By.xpath("//a[text()='Recover Your Account']");

	public void Loginpage(WebDriver driver) {
		// TODO Auto-generated method stub
		this.driver = driver;
	}

	public void typeusername(String id) {
		driver.findElement(username).sendKeys(id);
	}

	public void typepass(String pass) {
		driver.findElement(password).sendKeys(pass);

	}

	public void clickbutton() {
		driver.findElement(loginbutton).click();
	}

	public void loginbutton(String userid, String pass) {
		driver.findElement(username).sendKeys(userid);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(loginbutton).click();
		// TODO Auto-generated method stub
		
	}

	
}
