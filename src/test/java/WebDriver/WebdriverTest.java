package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class WebdriverTest {
	@Test
	public void OpenBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test(enabled = false)
	public void OpenBrowser1()
	{
		System.out.print("OpenBrowser1");
	}
	
	}
