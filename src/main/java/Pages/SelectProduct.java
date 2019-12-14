package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectProduct {
	WebDriver driver;
	public void printPrize()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy M30");
	    driver.findElement(By.className("nav-input")).click();
	    String a=driver.findElement(By.xpath("//span[@class=\'a-price\']//span[2]//span[2]")).getText();
	    System.out.println("price of first value is "+a);
	}
	public void selectAProduct()
	{
		 driver.findElement(By.xpath("(//div[@class=\'a-section aok-relative s-image-fixed-height\'])")).click();
	}
}

