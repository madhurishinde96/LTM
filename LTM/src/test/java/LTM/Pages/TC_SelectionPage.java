package LTM.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TC_SelectionPage 
{	
	WebDriver driver;
	
	public TC_SelectionPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By defaullt = By.xpath("//div[@class='rtTop']//span[@class='rtPlus']");
	By select_TC = By.xpath("(//span[@class='icon-272--linux_red-dot-68'][normalize-space()='192.168.1.175'])[1]");
	By upgrade_Mng = By.xpath("(//i[contains(@class,'icon-230--Upgrade-Management alignIcon')])[3]");
	By Soft_Upgrade_Mng = By.xpath("(//a[contains(@class,'nav-link navLinkLinux nav-toggle')])[36]");
	By Soft_Upgrade = By.xpath("(//a[contains(@class,'nav-link navLinkLinux clsHTMLMenuItemClick')])[102]");
	By new_update = By.xpath("//input[@id='LXSoftwareUpgrade_btnNew_Install']");
	
	
	public void def()
	{
		driver.findElement(defaullt).click();
	}

	public void TC()
	{
		driver.findElement(select_TC).click();
	}
	
	public void upmg()
	{
		driver.findElement(upgrade_Mng).click();
	}
	
	public void supmg()
	{
		driver.findElement(Soft_Upgrade_Mng).click();
	}
	
	public void softupgrade()
	{
		driver.findElement(Soft_Upgrade).click();
	}
	
	public void newup()
	{
		driver.findElement(new_update).click();
	}
}


