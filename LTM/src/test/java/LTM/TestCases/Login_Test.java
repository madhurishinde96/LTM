package LTM.TestCases;

import org.testng.annotations.Test;

import LTM_Pages.LoginPage;

public class Login_Test extends Base_Class
{
	@Test
	public void Login()
	{
		LoginPage login = new LoginPage(driver);
		login.username("admin","admin");
	}
	
}
