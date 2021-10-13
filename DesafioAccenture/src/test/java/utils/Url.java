package utils;

import org.openqa.selenium.WebDriver;

public class Url extends webDriver.WebDriver {
	public static WebDriver driver;

	public void loginUrl() {
		webdriver().get("http://sampleapp.tricentis.com/101/app.php");
	}

}
