package init;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Intialize {
	public static WebDriver driver;

	public WebDriver BrowserIntialize() {

		System.setProperty("webdriver.chrome.driver", "E:\\testingSoftware\\chromedriver.exe");

		driver = new ChromeDriver();
		System.out.println("driver value:" + driver);
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		return driver;

		// driver.quit();
	}

}
