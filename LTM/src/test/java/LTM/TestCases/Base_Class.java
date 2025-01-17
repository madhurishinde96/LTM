package LTM.TestCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LTM_Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base_Class 

{
	WebDriver driver;
	
	@BeforeMethod
	public void beforetest()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
		driver.get("https://192.168.3.35");
	}


	@AfterMethod
	public void aftertest()
	{
		driver.quit();
						
	}
	
}
