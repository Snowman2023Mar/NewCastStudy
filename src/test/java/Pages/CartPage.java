package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.PlaceOrderBase;

public class CartPage extends PlaceOrderBase {
	@FindBy()
	WebElement cartItem;
	
	@FindBy()
	WebElement orderBtn;
	
	public CartPage() {
		PageFactory.initElements(driver,this);
	}
	public void checkOut() {
		if(cartItem.isDisplayed()) {
			orderBtn.click();
		}
	}

}
