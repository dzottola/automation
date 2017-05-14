package testcase;

import java.io.File;

import org.testng.annotations.Test;

import PageObjects.LoginPage;
import helper.StartWebDriver;

public class TestPageObjectModel extends StartWebDriver{
	
	@Test
	public void testcase(){
		System.out.println(file.getBrowser());
		System.out.println(file.getPassword());
		System.out.println(file.getUsername());
		LoginPage lPage = new LoginPage();

		lPage.Login(file.getUsername(), file.getPassword());
	}

}
