package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import practice1.UtilityScreen;

public class Facebooklogin {
	static WebDriver driver;
	
	@BeforeMethod
	public static void intial()
	{		
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("www.facebook.com");
	}
	@Test
	public static void validlogin(){ 
	
    Loginpage login = new Loginpage(driver);
    login.loginbutton("13452", "dbjsdbfs");
    UtilityScreen.Screenshot(driver, "Basepage");
	}
	@Test
	public static void invalid(){
		Loginpage login = new Loginpage(driver);
	    login.loginbutton("13452", "dbjsdbfs");
	    UtilityScreen.Screenshot(driver, "Basepage");
	}
	@AfterMethod
	public static void close(){
	driver.close();
	}
	
/***
 * 
 * login.typeusername("avinash");
login.typepass("1231456");
login.clickbutton();
**/
    
    
    
	}
}