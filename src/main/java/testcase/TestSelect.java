package testcase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;

import helper.ButtonHelper;
import helper.CheckBoxHelper;
import helper.ComboBoxHelper;
import helper.GenericHelper;
import helper.LinkHelper;
import helper.StartWebDriver;
import helper.TextBoxHelper;

public class TestSelect extends StartWebDriver{
	@Test
	public void testDrowpdown(){
		LinkHelper.clickLink("File a Bug");
		TextBoxHelper.typeInTextBox("Bugzilla_login","zottola.diego@gmail.com");
		TextBoxHelper.typeInTextBox("Bugzilla_password","Enfermo@1");
		CheckBoxHelper.clickCheckBox("Bugzilla_restrictlogin");
		ButtonHelper.clickButton("log_in");
		LinkHelper.clickLink("Widgets");
		ComboBoxHelper.select("bug_severity", 1);
		ComboBoxHelper.select("bug_severity", "trivial");
		ComboBoxHelper.select("rep_platform", "Macintosh");
		
		try {
			throw new FileNotFoundException();
		} catch (FileNotFoundException e) {
			GenericHelper.takeScreenShot(this.getClass().toString());
			Assert.fail(e.toString());
		}
	
		
	}

}
