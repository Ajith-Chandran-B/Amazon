package TestCases;
import Pages.SelectProduct;
import Pages.CartPage;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TC001 {
	public static ChromeDriver driver;
public void setup()
{
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	driver=new ChromeDriver();
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
}
public static void main(String args[])
{
TC001 obj=new TC001();
SelectProduct obj2=new SelectProduct();
CartPage obj3=new CartPage();
obj.setup();
obj2.printPrize();
obj2.selectAProduct();
obj3.printDeliveryDate();
obj3.addToCart();
obj3.ValidateError();

}
}
