package LTM_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_SelectionPage 
{	
	WebDriver driver;
	
	public TC_SelectionPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//div[@class='rtTop']//span[@class='rtPlus']")
	WebElement def;
	
	@FindBy(xpath="(//span[@class='icon-272--linux_red-dot-68'][normalize-space()='192.168.1.175'])[1]")
	WebElement select_TC;
	
	@FindBy(xpath="(//i[contains(@class,'icon-230--Upgrade-Management alignIcon')])[3]")
	WebElement upgrade_Mng;
	
	@FindBy(xpath="(//a[contains(@class,'nav-link navLinkLinux nav-toggle')])[36]")
	WebElement Soft_Upgrade_Mng;
	
	@FindBy(xpath="(//a[contains(@class,'nav-link navLinkLinux clsHTMLMenuItemClick')])[102]")
	WebElement Soft_Upgrade;
	
	@FindBy(xpath="//input[@id='LXSoftwareUpgrade_btnNew_Install']")
	WebElement new_update;
	
	
	public void seldef()
	{
		def.click();
	}

	public void TC()
	{
		select_TC.click();
	}
	
	public void upmg()
	{
		upgrade_Mng.click();
	}
	
	public void supmg()
	{
		Soft_Upgrade_Mng.click();
	}
	
	public void softupgrade()
	{
		Soft_Upgrade.click();
	}
	
	public void newup()
	{
		new_update.click();
	}	
	
}


