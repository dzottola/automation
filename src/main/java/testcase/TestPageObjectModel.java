package testcase;

import java.io.File;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import helper.StartWebDriver;
import helper.WindowHelper;

public class TestPageObjectModel extends StartWebDriver{
	
	@Test
	public void testcase(){
		
		WindowHelper.navigateToPage(file.getUrl());
		LoginPage lPage = new LoginPage();
		lPage.Login(file.getUsername(), file.getPassword());
	}

}
