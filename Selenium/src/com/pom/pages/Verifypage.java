/**
 * 
 */
package com.pom.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pom.Loginpage;

/**
 * @author avinash
 *
 */
public class Verifypage {

	/**
	 * @param args
	 */
	@Test
	public  void verfiylogin() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver(); 
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.facebook.com/");
        Loginpage login = new Loginpage(driver);
        login.typeusername("avinash");
        login.typepass("aviansh123");
        login.clickbutton();
        driver.close();
	}

}
