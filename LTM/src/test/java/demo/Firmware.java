package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Firmware 
{

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setAcceptInsecureCerts(true);
		
		WebDriver d = new ChromeDriver(options);
		d.manage().window().maximize();
		d.get("https://192.168.3.10");
		
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		d.findElement(By.name("UserName")).sendKeys("admin");
		d.findElement(By.id("Password")).sendKeys("Ccl@1234");
		d.findElement(By.xpath("//input[@id='btnLogin']")).click();
		
		//default
		d.findElement(By.xpath("//div[@class='rtTop']//span[@class='rtPlus']")).click();
		
		//TC Selection
		//d.findElement(By.xpath("(//span[contains(@class,'icon-274--linux_green-dot')])[1]")).click();
		d.findElement(By.xpath("(//span[@class='icon-272--linux_red-dot-68'][normalize-space()='192.168.1.175'])[1]")).click();	
		
		//Upgrade Mng
		d.findElement(By.xpath("(//i[contains(@class,'icon-230--Upgrade-Management alignIcon')])[3]")).click();
		
		//Software Upgrade Mng
		d.findElement(By.xpath("(//a[contains(@class,'nav-link navLinkLinux nav-toggle')])[36]")).click();
		
		//Software Upgrade
		d.findElement(By.xpath("(//a[contains(@class,'nav-link navLinkLinux clsHTMLMenuItemClick')])[102]")).click();
		
		//New Update
		d.findElement(By.xpath("//input[@id='LXSoftwareUpgrade_btnNew_Install']")).click();
		
		//Upgrade Type
		WebElement upType = d.findElement(By.id("LXSoftwareUpgrade_ddlUpgradeType"));
		Select s1 = new Select(upType);
		s1.selectByValue("Firmware Upgrade");
		
		//Source Type
		WebElement srcType = d.findElement(By.id("LXSoftwareUpgrade_ddlSourceType"));
		Select s2 = new Select(srcType);
		s2.selectByIndex(0);
		
		//Source
		WebElement src = d.findElement(By.id("LXSoftwareUpgrade_ddlSource"));
		Select s3 = new Select(src);
		s3.selectByValue("1");
		
		//File
		WebElement file = d.findElement(By.id("LXSoftwareUpgrade_ddlFile"));
		Select s4 = new Select(file);
		s4.selectByIndex(5);
		
		//validate
		d.findElement(By.id("LXSoftwareUpgrade_btnVldtCnnctn")).click();
	
		//Apply
		d.findElement(By.xpath("//input[@id='LXSoftwareUpgrade_btnInstallSW']")).click();
		
		
		d.quit();


	}

}
