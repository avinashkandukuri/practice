package practice1;

import java.io.File;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.Assert;

public class Phantonjs {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		File src = new File("C:\\Program Files\\Java\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
		System.setProperty("phantomjs.binary.path", src.getAbsolutePath());
		WebDriver driver = new PhantomJSDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		String title = driver.getTitle();
		UtilityScreen.Screenshot(driver, "facebook");
		System.out.println("tile of facebook" + title);
		String Expected = "Facebook";
		Assert.assertEquals(title, Expected);

	}

}
