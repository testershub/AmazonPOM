package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;

public class BaseTest {
public WebDriver driver;
  @BeforeSuite
  public void beforeSuit() {
	  
	  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in");
	  
	  
		
  }
 
  @AfterSuite
  public void afterSuit() {
	  driver.quit();
  }

}
