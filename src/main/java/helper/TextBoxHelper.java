package helper;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextBoxHelper extends StartWebDriver {
	
	public static void typeInTextBox(String locator, String value){
		
		WebElement ele = getElement(locator);
		ele.sendKeys(value);
	}
	
}
