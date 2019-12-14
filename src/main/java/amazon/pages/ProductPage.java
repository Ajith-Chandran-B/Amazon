package amazon.pages;

import amazon.base.ProjectSpecificMethods;

public class ProductPage extends ProjectSpecificMethods{
	
	public ProductPage getDeliveryDate() {
		String date = driver.findElementByXPath("//div[@id='ddmDeliveryMessage']/span").getText();
		System.out.println(date);
		return this;
	}
	public CartPage clickAddToCart() {
		driver.findElementById("add-to-cart-button").click();
		return new CartPage();
	}

}
