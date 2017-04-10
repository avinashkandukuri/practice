package practice1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Webelementhighlight {

	public static void hightlight(WebDriver driver, WebElement element) throws InterruptedException {
		// TODO Auto-generated method stub

		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("argument[0].setAttribute('Style', 'background : yellow; border: 2px Solid red;')", element);
		Thread.sleep(5000);
		je.executeScript("argument[0].setAttribute('Style', 'border: 2px Solid white;')", element);
		element.click();

	}

}
