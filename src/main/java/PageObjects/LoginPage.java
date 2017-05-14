package PageObjects;

import org.openqa.selenium.By;

import helper.StartWebDriver;

public class LoginPage extends StartWebDriver{

	// Web Elements
	private By ForgotPassword = By.linkText("Forgot Password?");
	private By RequestAccess = By.linkText("Don't have an account? Request Access");
	private By LoginEmail = By.className("email");
	private By LoginPassword = By.cssSelector("input[name=\"password\"]");
	private By LoginButton = By.xpath("//div[@id='main']/div[2]/div/form/div[4]/button");
	private By RememberCheckBox = By.className("remember");

	//Actions


	public void Login(String loginEmail, String loginPassword){
		driver.findElement(LoginEmail).clear();;
		driver.findElement(LoginEmail).sendKeys(loginEmail);
		driver.findElement(LoginPassword).clear();
		driver.findElement(LoginPassword).sendKeys(loginPassword);
		driver.findElement(LoginButton).click();

	}
//	
//	public void SendPasswordLogin(String loginPassword){
//		driver.findElement(LoginPassword).clear();
//		driver.findElement(LoginPassword).sendKeys(loginPassword);
//	}
//	
//	public void ClickLoginButton(){
//		driver.findElement(LoginButton);
//	}
}
