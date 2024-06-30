package Amazon.comPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SearchPage


{

    WebDriver driver;


    String firstElementLocator="s-image";

    String priceLocator="a-price-whole";
    String searchLocationLocator="//div[text()='Select delivery location']";
    String pinCodeLocator="GLUX_Full_Width a-declarative";

    String applyButtonLocator="a-button a-button-span12";

    String addToCartButton="add-to-cart-button";

    String visibilityCartButton="Added to Cart";

    public SearchPage(WebDriver driver) throws InterruptedException {
        this.driver = driver;
        this.driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.driver.get("https://www.amazon.in/");
        Thread.sleep(2000);
    }


    public void searchLaptop() throws InterruptedException {


        WebElement firstElement=driver.findElement(By.className(firstElementLocator));
        firstElement.click();

Thread.sleep(2000);


        WebElement totalPriceElement=driver.findElement(By.className(priceLocator));
        int limit = 40000;
        String totalPrice=totalPriceElement.getText().replace("₹","").trim();

        String actualTotalPrice=totalPrice.replace(",","").trim();


        System.out.println(actualTotalPrice);
        int itemPrice=Integer.parseInt(actualTotalPrice);

        System.out.println(itemPrice);
        if( limit > itemPrice){
            System.out.println("The price is less than 40000");}
        else{
            System.out.println("The price is grater than 40000");}
        Thread.sleep(2000);
    }



public void searchLocation() throws InterruptedException {


        WebElement searchLocationElement=driver.findElement(By.xpath(searchLocationLocator));
      searchLocationElement.click();
    Thread.sleep(2000);

        WebElement pinCodeElement=driver.findElement(By.className(pinCodeLocator));
        pinCodeElement.sendKeys("560087");
    Thread.sleep(2000);

        WebElement clickApply=driver.findElement(By.className(applyButtonLocator));
        clickApply.click();
    Thread.sleep(2000);

    WebElement clickAddToCart=driver.findElement(By.id(applyButtonLocator));
        clickAddToCart.click();
    Thread.sleep(2000);

        WebElement visibleAddToCart=driver.findElement(By.id(applyButtonLocator));
        visibleAddToCart.isDisplayed();
Thread.sleep(2000);

    }


}
