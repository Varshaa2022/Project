package com.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
@Test
public void login() {
	//System.setProperty("Webdriver.chrome.driver", "C:\\Test Automation\\Amazon\\Drivers\\webdrivermanager-5.2.2.jar");
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.com/");
	
	
	
}

}
