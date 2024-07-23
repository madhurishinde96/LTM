package LTM.TestCases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import LTM_Pages.LoginPage;

public class SelectTC extends Base_Class
{
	
	@Test
	public void Login()
	{
		LoginPage login = new LoginPage(driver);
		login.username("admin");
		login.password("admin");
		login.loginBtn();
	}

	
	
	@Test
	public void TC() throws InterruptedException
	{	
		Thread.sleep(5000);
		driver.findElement(By.xpath("*[@id=\"ctl00_ContentPlaceHolder1_RadTreeView1\"]/ul/li/ul/li/ul/li[2]/div/span[2]")).click();
		
		//*[@id="ctl00_ContentPlaceHolder1_RadTreeView1"]/ul/li/ul/li/ul/li[2]/div/span[2]
		driver.findElement(By.xpath("//span[@icon-274--linux_green-dot']")).click();
	}
	
	
}
