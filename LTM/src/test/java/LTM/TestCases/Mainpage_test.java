package LTM.TestCases;

import org.testng.annotations.Test;

public class Mainpage_test extends Base_Class
{	
//	@Test
//	public void Login()
//	{
//		LoginPage login = new LoginPage(driver);
//		login.username("admin");
//		login.password("admin");
//		login.loginBtn();
//	}
	
	@Test 
	public void registered_TC() throws InterruptedException 
	{
		Login_Test lt = new Login_Test();
		lt.Login();
	
	}}
		/*
		MainPage mp = new MainPage(driver);
		mp.search();
		
		Thread.sleep(5000);
		
		List<WebElement> tcs = driver.findElements(By.xpath("//table[@id='tblDatatableGI']//td[3]"));
		
		
		for(int i=0 ; i<tcs.size() ; i++)
		{
			String ip=tcs.get(i).getText();
//			System.out.println(ip);
			
			if (ip.contains("192.168.1.160"))
			{			
				String s1 = driver.findElements(By.xpath("//table[@id='tblDatatableGI']//td[5]")).get(i).getText();
				System.out.println(s1);
			}
						
		}
		
	}
}
*/