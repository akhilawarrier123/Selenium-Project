package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Negetive_testing {

    WebDriver driver;

    public Negetive_testing(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        this.driver.get("https://www.saucedemo.com/");
    }

    public static String firstNameLocator = "first-name";
    public static String LastNameLocator = "last-name";
    public static String PostalCodeLocator = "postal-code";
    public static String ContinueLocator = "continue";
    public static String priceLocator = "inventory_item_price";


    public static String taxLocator="//div[@class='summary_info']/div[@class='summary_tax_label']";//parent child classes
    public static String TotalPriceLocator="//div[@class='summary_info']/div[@class='summary_info_label summary_total_label']";

    public void fillDetails(String fN, String lN, String pinCode) {
        driver.findElement(By.id(firstNameLocator)).sendKeys(fN);
        driver.findElement(By.id(LastNameLocator)).sendKeys(lN);
        driver.findElement(By.id(PostalCodeLocator)).sendKeys(pinCode);
        driver.findElement(By.id(ContinueLocator)).click();
    }


    public float null_taxtesting(){
    List<WebElement> priceList = driver.findElements(By.className(priceLocator));

    float sum = 0;
    for (int i = 0; i < priceList.size(); i++) {


        String currentWebElementPrice = priceList.get(i).getText().replace("$", "").trim();

        float CurrentpriceFloat = Float.parseFloat(currentWebElementPrice);
        sum = sum + CurrentpriceFloat;
        System.out.println("currentWebElementPrice" + CurrentpriceFloat);
    }

    System.out.println(sum);
    return sum;

}
    public void null_calculateTotal(){


        float itemprice=null_taxtesting();

        WebElement taxElement =driver.findElement(By.xpath(taxLocator));
        String tax=taxElement.getText().replace("Tax: $","");
        System.out.println(tax);

        WebElement totalPriceElement=driver.findElement(By.xpath(TotalPriceLocator));
        String totalPrice=totalPriceElement.getText().replace("Total: $","").trim();
        System.out.println(totalPrice);

        float TotalPriceAfteraddingTax=itemprice+Float.parseFloat(tax);
        float TotalPricef=Float.parseFloat(totalPrice);
        Assert.assertEquals(TotalPriceAfteraddingTax,TotalPricef,"TotalPrice mismatch");





    }



}
