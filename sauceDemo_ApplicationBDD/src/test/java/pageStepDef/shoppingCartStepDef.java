package pageStepDef;

import PageLayer.shoppincart;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class shoppingCartStepDef {

	shoppincart shop;
	
	@When("user select items and add to cart")
	public void user_select_items_and_add_to_cart() {
		shop = new shoppincart();
		shop.validateAddtoCart();
		
	   
	}
	@Then("user click on cart button")
	public void user_click_on_cart_button() {
	    shop.validateCartButton();
	}
}
