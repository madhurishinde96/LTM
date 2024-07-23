package demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Background
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
		d.findElement(By.xpath("(//span[normalize-space()='192.168.1.67'])[1]")).click();
		
		//User Settings
		d.findElement(By.id("btnExpandMenu")).click();
		d.findElement(By.xpath("(//a[@class='nav-link navLinkLinux nav-toggle'])[29]")).click();
		d.findElement(By.xpath("//div[@id='htmlmenuDeviceManagerView']//li[@id='lblMenu_usersettings_Linux']//label[contains(@title,'User Interface')][normalize-space()='User Interface']")).click();
		d.findElement(By.xpath("//div[@id='htmlmenuDeviceManagerView']//label[@title='Background'][normalize-space()='Background']")).click();
		
		WebElement bg = d.findElement(By.xpath("//select[@id='LXBackground_ddlBrowseUpload']"));
		Select s1 = new Select(bg);
		s1.selectByIndex(2);
		
		WebElement cn = d.findElement(By.xpath("//select[@id='LXBackground_ddlWallPaperConnName']"));
		Select s2 = new Select(cn);
		s2.selectByIndex(1);
		
		WebElement pt = d.findElement(By.xpath("//select[@id='LXBackground_ddlFile']"));
		Select s3 = new Select(pt);
		s3.selectByIndex(1);
		
//		WebElement cl = d.findElement(By.xpath("//select[@id='LXBackground_ddlColor']"));
//		Select s4 = new Select(cl);
//		s3.selectByIndex(1);
		
		WebElement st = d.findElement(By.xpath("//select[@id='LXBackground_ddlPosition']"));
		Select s5 = new Select(st);
		s5.selectByValue("Tile");
		
		d.findElement(By.xpath("//input[@id='LXBackground_btnsave']")).click();
		d.quit();


	}

}
