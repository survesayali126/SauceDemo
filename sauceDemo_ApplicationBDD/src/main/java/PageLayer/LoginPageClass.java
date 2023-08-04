package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import baseLayer.BaseClass;

public class LoginPageClass extends BaseClass {

	@FindBy (name="user-name")
	private WebElement uname;
	
	@FindBy (name="password")
	private WebElement password;
	
	@FindBy (name="login-button")
	private WebElement login;
	
	
	public LoginPageClass() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void validateLoginFunctionality(String Uname, String Password) {
		sendKeys(uname, Uname);
		sendKeys(password,Password);
		click(login);
	}

}
