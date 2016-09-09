package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebdriverTest {
	@Test
	public void OpenBrowser()
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
	}

}
