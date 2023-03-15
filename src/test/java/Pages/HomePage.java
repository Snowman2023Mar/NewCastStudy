package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.PlaceOrderBase;

public class HomePage extends PlaceOrderBase{
	@FindBy(xpath="//li//a[contains(text(),'Log in')]")
	WebElement login;
	
	@FindBy()
	WebElement username;
	
	@FindBy()
	WebElement password;
	
	@FindBy()
	WebElement formLogin;
	
	@FindBy()
	WebElement formClose;
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	public LoginPage login() {
		login.click();
		username.sendKeys("sopina44");
		password.sendKeys("Sterlin@2013");
		formLogin.click();
		return new LoginPage();
		
	}
	
}
