package practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {


	public static void main(String[] args) throws InterruptedException {
		
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");        
         WebDriver driver = new ChromeDriver(); 
          
         
         driver.get("http://www.gmail.com");
          
         
         WebElement element = driver.findElement(By.id("Email"));
         element.sendKeys("avinashkandukuri8@gmail.com");
          
         driver.findElement(By.id("next")).click();
         Thread.sleep(3000);
          
         driver.findElement(By.id("Passwd")).sendKeys("k_avinash123");
         driver.findElement(By.id("signIn")).click();
         Thread.sleep(3000);
         
         driver.findElement(By.xpath("//*[@id=':i5/']/div/div")).click();
         Thread.sleep(3000); 
        
 driver.findElement(By.id("gb_71")).click();   
           
     
	}

}
