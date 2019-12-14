package Pages;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, 1);
	
public void printDeliveryDate() {
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
    driver.switchTo().window(tabs.get(1));
    String b=driver.findElement(By.cssSelector("div#ddmDeliveryMessage>span")).getText();
    System.out.println("Delivery by"+b);
}
public void addToCart()
{
	driver.findElement(By.id("add-to-cart-button")).click();
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='a-size-medium a-text-bold']")));
	String addedToCart = driver.findElement(By.xpath("//h1[@class='a-size-medium a-text-bold']")).getText();
	if(addedToCart.equals("Added to Cart")) {
	System.out.println(addedToCart);
	}
	else {
		System.out.println("Problem in adding to cart");
	}
	driver.findElement(By.id("hlb-ptc-btn-native")).click();
	driver.findElement(By.id("continue")).click();
}
public void ValidateError()
{
	String aa=driver.findElement(By.xpath("//div[@id=\'auth-email-missing-alert\']//div//div")).getText();
	System.out.println(aa);
}
}
