package amazon.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import amazon.base.ProjectSpecificMethods;

public class SearchResultPage extends ProjectSpecificMethods{
public ProductPage clickFirstResult() {
	System.out.println(driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText());
	List<WebElement> allElements = driver.findElementsByXPath("//span[@class='a-size-medium a-color-base a-text-normal']");
	WebElement firstResult = allElements.get(0);
	firstResult.click();
	Set<String> set = driver.getWindowHandles();
	String string = new ArrayList<String>(set).get(1);
	driver.switchTo().window(string);
	return new ProductPage();

}
}
