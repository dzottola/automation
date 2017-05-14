package testcase;


import org.testng.annotations.Test;

import helper.LinkHelper;
import helper.StartWebDriver;

public class TestPageFactory extends StartWebDriver{
	
	@Test
	public void testLogin() throws InterruptedException{
//		LinkHelper.clickLink("Don't have an account? Request Access");
	    java.lang.Thread.sleep(10000);
	    login_name.clear();
	    login_name.sendKeys("diego.zottola@gpcloud.com");
	    login_password.clear();
	    login_password.sendKeys("Enfermo@1");
	    login_button.click();
		
	}
	
}
