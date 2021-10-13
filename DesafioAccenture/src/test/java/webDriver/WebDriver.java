package webDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import cucumber.api.Scenario;

public class WebDriver {
    public static org.openqa.selenium.WebDriver driver;

    public org.openqa.selenium.WebDriver iniciaChrome(){

        String path = System.getProperty("user.dir");
        String driverpath = path + "\\src\\test\\resources\\Driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverpath );

        ChromeOptions options = new ChromeOptions();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        options.addArguments("--kiosk");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver =  new ChromeDriver(options);
        return driver;
    }
    
    public static void screenshot(Scenario cenario){
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
			FileUtils.copyFile(file,new File("target/\\screenshot/\\"+cenario.getId()+".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    }

    public static void fechaChrome() {
        driver.close();
        driver.quit();
    }

    public org.openqa.selenium.WebDriver webdriver(){
        return driver;
    }




}
