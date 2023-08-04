package pageStepDef;

import PageLayer.LoginPageClass;
import baseLayer.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LoginPageStepDef extends BaseClass {

	LoginPageClass login;
	@Given("User opens sauce demo application with required URL with {string} browser")
	public void user_opens_sauce_demo_application_with_required_url_with_browser(String browsername) {
	  
		initialisation(browsername);
	}

	@Then("User enters user name and password and login button")
	public void user_enters_user_name_and_password_and_login_button() {
	    login= new LoginPageClass();
	    login.validateLoginFunctionality(prop.getProperty("username"), prop.getProperty("password"));
	  
	}

}
