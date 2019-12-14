package amazonin;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class AmazonTestCase {
	public static ChromeDriver driver;
	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
			driver=new ChromeDriver();
			WebDriverWait wait = new WebDriverWait(driver, 1);
		    driver.get("https://www.amazon.in/");
		    driver.manage().window().maximize();
		    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung Galaxy M30");
		    driver.findElement(By.className("nav-input")).click();
		    String a=driver.findElement(By.xpath("//span[@class=\'a-price\']//span[2]//span[2]")).getText();
		    System.out.println("price of first value is "+a);
		    driver.findElement(By.xpath("(//div[@class=\'a-section aok-relative s-image-fixed-height\'])")).click();
		    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		    driver.switchTo().window(tabs.get(1));
		    String b=driver.findElement(By.cssSelector("div#ddmDeliveryMessage>span")).getText();
		    System.out.println("Delivery by"+b);
		    driver.findElement(By.id("add-to-cart-button")).click();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='a-size-medium a-text-bold']")));
			String addedToCart = driver.findElement(By.xpath("//h1[@class='a-size-medium a-text-bold']")).getText();
			if(addedToCart.equals("Added to Cart")) {
			System.out.println(addedToCart);
			}
			else {
				System.out.println("Problem in adding to cart");
			}
			driver.findElementById("hlb-ptc-btn-native").click();
			driver.findElementById("continue").click();
			String aa=driver.findElement(By.xpath("//div[@id=\'auth-email-missing-alert\']//div//div")).getText();
			System.out.println(aa);
			
	}

}
