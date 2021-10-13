package stepDefinition;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import webDriver.WebDriver;

public class Hooks {

    webDriver.WebDriver WebDriver = new WebDriver();

        @Before
        public void iniciaChrome(){
               WebDriver.iniciaChrome();
        }
        
        @After(order = 1)
        public void screenshot(Scenario cenario){
            WebDriver.screenshot(cenario);
        }

        @After (order = 0)
        public void closeDriver(){
            WebDriver.fechaChrome();
        }
}
