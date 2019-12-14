package amazon.pages;

import org.openqa.selenium.By;

import amazon.base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods{
	public LoginPage clickContinue() {
		driver.findElementById("continue").click();
		return this;
	}
	public LoginPage verifyErrorMessage() {
		 	System.out.println(driver.findElement(By.xpath("(//div[@class='a-alert-content'])[2]")).getText());
		 	return this;
	}

}
