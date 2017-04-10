package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonandCheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
	    driver.manage().window().maximize();
	    driver.getTitle();
		List<WebElement> buttons = driver.findElements(By.xpath("//input[@type='radio'][@name='lang']"));
	    for(int i= 0; i< buttons.size(); i++)
	    {
	    	WebElement rbutton = buttons.get(i);
	    	String value = rbutton.getAttribute("value");
	    	System.out.println("value of the buttons" + value);
	    	if(value.equalsIgnoreCase("java"))
	    	{
	    		rbutton.click();
	    		break;
	    	}
	    
	    }
	    
	    List<WebElement> Checkb = driver.findElements(By.xpath("//input[@type='checkbox'][@name='lang']"));
	    for(int i= 0; i<Checkb.size(); i++)
	    {
	    	WebElement box = Checkb.get(i);
	    	String Value1 = box.getAttribute("value");
	    	System.out.println("value of checkbox" + Value1);
	    	if (Value1.equalsIgnoreCase("code"))
	    	{
	    		box.click();
	    		break;
	    	}
	    	driver.quit();
	    }
	}

}
