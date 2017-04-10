package practice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-automate-radio-button-in.html");
		driver.manage().window().maximize();
		List<WebElement> elements= driver.findElements(By.id("//input[@type='radio'][@name='male']"));
		int count = elements.size();
		System.out.println("total number of buttons" + count);
		for(int i= 0; i < count; i++)
		{
			WebElement ele = elements.get(i);
			int x = elements.get(i).getLocation().getX();
			int y = elements.get(i).getLocation().getY();
			if(x!= 0)
			{
				ele.click();
				elements.get(i).click();
				break;
			}
		}
	
	}

}
