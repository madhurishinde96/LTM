package LTM.Pages;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LTM.Pages.TC_SelectionPage;

public class SelectTC extends Base_Class
{
	@BeforeTest
	public void setup()
	{
		Login_Test lt = new Login_Test();
		lt.Login();
	}
	
	@Test 
	public void TC()
	{
		TC_SelectionPage tc = new TC_SelectionPage(driver);
		tc.def();
		tc.TC();
		tc.upmg();
		tc.supmg();
		tc.softupgrade();
		tc.newup();
	}
	
}
