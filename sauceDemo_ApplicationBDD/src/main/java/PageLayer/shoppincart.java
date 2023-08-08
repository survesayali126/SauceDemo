package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtilsLayer.UtilsClass;
import baseLayer.BaseClass;

public class shoppincart extends BaseClass {
	
	@FindBy(id="add-to-cart-sauce-labs-backpack")
	private WebElement item1;
	
	@FindBy(id="add-to-cart-sauce-labs-bike-light")
	private WebElement item2;

	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement item3;

	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement cartbuttn;
	
	public shoppincart() {
		PageFactory.initElements(getDriver(), this);
	}
	
	public void validateAddtoCart() {
		
		UtilsClass.click(item1);
		UtilsClass.click(item2);
		UtilsClass.click(item3);
		
		
	}
	
	public void validateCartButton() {
		
		UtilsClass.click(cartbuttn);
		
	}


}
