package amazon.pages;

import amazon.base.ProjectSpecificMethods;

public class CartPage extends ProjectSpecificMethods{
	public CartPage verifyAddedtoCart() {
		System.out.println(driver.findElementByTagName("h1").getText().contains("Added")?"Verified":"Mismatch");
		return this;
	}
	
	public LoginPage clickBuy() throws InterruptedException {
		Thread.sleep(2000);	
		driver.findElementById("hlb-ptc-btn-native").click();
		return new LoginPage();
	}

}
