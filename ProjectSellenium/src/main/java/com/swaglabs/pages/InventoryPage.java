package com.swaglabs.pages;

import helper.WaitUtility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class InventoryPage {


    WebDriver driver;


    public static String backpackAddToCart="add-to-cart-sauce-labs-backpack";
    public static String BikelightAddtoCart="add-to-cart-sauce-labs-bike-light";
    public static String  BolttShirtAddtoCart="add-to-cart-sauce-labs-bolt-t-shirt";
    public static  String  FleeceJacketAddtoCart ="add-to-cart-sauce-labs-fleece-jacket";



    public static String removeItem_backpack="remove-sauce-labs-backpack";
    public static String removeItem_bikelight="remove-sauce-labs-bike-light";
    public static String removeItem_fleeceJacket="remove-sauce-labs-fleece-jacket";
    public static String removeItem_boltTshirt="remove-sauce-labs-bolt-t-shirt";

    String Inventory_title="//div[@class='header_label']/div";
    public static String priceLocator = "inventory_item_price";


    public InventoryPage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        this.driver.get("https://www.saucedemo.com");
        LogInPage logpage=new LogInPage(driver);
        logpage.login("standard_user","secret_sauce");
    }

    public void Verify_inventory_Page_title(){
       // WebDriverWait  webDriverWait=new WebDriverWait(driver, Duration.ofSeconds(10));
       // webDriverWait.until(ExpectedConditions.urlToBe("https://www.saucedemo.com/"));

        WaitUtility.waitUntil(driver,10,ExpectedConditions.urlToBe("https://www.saucedemo.com/inventory.html"));


        WebElement TitleElement = driver.findElement(By.xpath(Inventory_title));
        String actual_tilename=TitleElement.getText();
        String expected_titlename="Swag Labs";


        Assert.assertEquals(actual_tilename,expected_titlename, "Unable to verify inventory page");

    }

    public void clickOnCart(){
        driver.findElement(By.className("shopping_cart_link")).click();
        System.out.println("add to cart button clicked");
    }
    public void Add_Product(String locator){
      //  WaitUtility.waitUntil(driver,10,ExpectedConditions.elementToBeSelected(Element));
        WebElement  Element= driver.findElement(By.id(locator));
        Element.click();

    }
    public void Remove_Product(String removeitem)
    {

        WebElement removeElement=driver.findElement(By.xpath(removeitem));
        removeElement.click();

        System.out.println("item removed successfully from cart=passed");

    }

   public void sortProducts(String optionValue,String ExpectedVisible_Text){
        WebElement Element= driver.findElement(By.className("product_sort_container"));
        Select selectElement=new Select(Element);
        selectElement.selectByValue(optionValue);
        WebElement SpanElement=driver.findElement(By.className("active_option"));
       Assert.assertEquals(SpanElement.getText().trim(),ExpectedVisible_Text);
    }

    public void VerifyAscending_order(){

        List<WebElement>priceList=driver.findElements(By.className(priceLocator ));
        boolean actual=true;


        for(int i=0;i<priceList.size()-1;i++) {
            String currentWebElementPrice = priceList.get(i).getText().replace("$", "").trim();
            String nextprice = priceList.get(i + 1).getText().replace("$", "").trim();
            float currentprice_f = Float.parseFloat(currentWebElementPrice);
            float nextprice_f = Float.parseFloat(nextprice);

            System.out.println("current_price" + currentprice_f + "&" + "next_price" + nextprice_f);
            if (!(currentprice_f <= nextprice_f) ){
                actual = false;
                break;
            }
        }

            // Assert.;
            Assert.assertEquals(actual, true, "price list not sorted in ascending order");

            System.out.println("verified the order");

    }
    public void Verifydescending_order(){

        List<WebElement>priceList=driver.findElements(By.className(priceLocator ));
        boolean actual=true;


        for(int i=0;i<priceList.size()-1;i++) {
            String currentWebElementPrice = priceList.get(i).getText().replace("$", "").trim();
            String nextprice = priceList.get(i + 1).getText().replace("$", "").trim();
            float currentprice_f = Float.parseFloat(currentWebElementPrice);
            float nextprice_f = Float.parseFloat(nextprice);

            System.out.println("current_price" + currentprice_f + "&" + "next_price" + nextprice_f);
            if (!(currentprice_f >= nextprice_f) ){
                actual = false;
                break;
            }
        }

        // Assert.;
        Assert.assertEquals(actual, true, "price list not sorted in descending order");

        System.out.println("verified the order");

    }
}