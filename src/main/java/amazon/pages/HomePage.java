package amazon.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import amazon.base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods{
public SearchResultPage SearchMobile(String mobileName) {
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(mobileName,Keys.ENTER);
	return new SearchResultPage();
}
}
