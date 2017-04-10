package practice1;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sibling {


		    @Test

		    public void testSiblingAndParentInXpath(){

		    	
		    	WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
				driver = new ChromeDriver();       
		        
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        driver.get("http://demo.guru99.com/selenium/guru99home/");

		        //Search element inside 'Popular course' which are sibling of control 'SELENIUM' ,Here first we will find a h2 whose text is ''A few of our most popular courses' ,then we move to its parent element which is a 'div' , inside this div we will find a link whose text is 'SELENIUM' then at last we will find all of the sibling elements of this link('SELENIUM')
		        List <WebElement> dateBox = driver.findElements(By.xpath("//h2[contains(text(),'A few of our most popular courses')]/parent::div//div[//a[text()='SELENIUM']]/following-sibling::div[@class='rt-grid-2 rt-omega']"));

		        //Print all the which are sibling of the the element named as 'SELENIUM' in 'Popular course'
		        for (WebElement webElement : dateBox) {
		            System.out.println(webElement.getText());
		        }     

		        driver.close();
		    }
		}


