package com.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
@Test
public void login() {
	System.setProperty("Webdriver.gecko.driver", "C:\\Test Automation\\Amazon\\Drivers\\geckodriver.exe");
	//WebDriverManager.chromedriver().setup();
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.amazon.com/");
	
	
	
}

}
