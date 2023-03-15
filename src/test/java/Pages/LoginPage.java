package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.PlaceOrderBase;

public class LoginPage extends PlaceOrderBase {
	@FindBy(xpath="//div//a[contains(text(), \"Samsung galaxy s6\")]")
	WebElement item;
	
	public LoginPage() {
		PageFactory.initElements(driver,this);
		}
	public void selectItem() {
		item.click();
	}

}
