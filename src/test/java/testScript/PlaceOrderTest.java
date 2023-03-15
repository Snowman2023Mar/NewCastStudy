package testScript;

import org.testng.annotations.Test;
import Base.PlaceOrderBase;
import Pages.AddToCartPage;
import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;

public class PlaceOrderTest extends PlaceOrderBase{
	HomePage homePage;
	LoginPage loginPage;
	AddToCartPage addToCartPage;
	CartPage cartPage;
	
  @Test
  public void loginToPage() {
	  initialize();
	  homePage=new HomePage();
	  loginPage=homePage.login();
  }
}

