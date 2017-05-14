package helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ElementRepository {

	@FindBy(how=How.CLASS_NAME, using="email")
	@CacheLookup
	public static WebElement login_name;
	
	@FindBy(how=How.CSS, using="input[name=\"password\"]")
	@CacheLookup
	public static WebElement login_password;
	
	@FindBy(how=How.XPATH, using="//div[@id='main']/div[2]/div/form/div[4]/button")
	@CacheLookup
	public static WebElement login_button;
}
