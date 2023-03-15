package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.PlaceOrderBase;

public class AddToCartPage extends PlaceOrderBase{
	
	@FindBy()
	WebElement addToCartBtn;
	
	public void AddCartToPage() {
		PageFactory.initElements(driver,this);
	}
	public void addItemtoCart() {
		addToCartBtn.click();
		
	}

}
