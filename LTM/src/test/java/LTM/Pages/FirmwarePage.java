package LTM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FirmwarePage 
{
	WebDriver driver;
	
	public FirmwarePage(WebDriver driver)
	{
		this.driver = driver;
	}
	
			By upType = By.id("LXSoftwareUpgrade_ddlUpgradeType");
			By srcType = By.id("LXSoftwareUpgrade_ddlSourceType");
			By src = By.id("LXSoftwareUpgrade_ddlSource");
			By file = By.id("LXSoftwareUpgrade_ddlFile");
			By validate = By.id("LXSoftwareUpgrade_btnVldtCnnctn");
			By apply = By.xpath("//input[@id='LXSoftwareUpgrade_btnInstallSW']");
			
			
			public void testUpType()
			{
				Select s1 = new Select((WebElement) upType);
				s1.selectByValue("Firmware Upgrade");
			}
			
			public void testSrcType()
			{
				Select s2 = new Select((WebElement) srcType);
				s2.selectByIndex(0);
			}
		
			public void testsrc()
			{
				Select s3 = new Select((WebElement) src);
				s3.selectByValue("1");
			}
			
			public void testFile()
			{
				Select s4 = new Select((WebElement) file);
				s4.selectByIndex(5);
			}
			
		
			
			//validate
		
			//Apply
	
	
}
