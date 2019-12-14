package amazon.testcases;

import org.testng.annotations.Test;

import amazon.base.ProjectSpecificMethods;
import amazon.pages.HomePage;

public class TC001 extends ProjectSpecificMethods{
	@Test
	public void runTC001() throws InterruptedException {
		new HomePage()
		.SearchMobile("SAMSUNG GALAXY M30")
		.clickFirstResult()
		.getDeliveryDate()
		.clickAddToCart()
		.verifyAddedtoCart()
		.clickBuy()
		.clickContinue()
		.verifyErrorMessage();
	}

}
