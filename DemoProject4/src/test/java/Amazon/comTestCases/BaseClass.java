package Amazon.comTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;
    String url;

    public BaseClass(WebDriver driver, String url) {
        this.driver = driver;
        this.url = url;
        this.driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        this.driver.get("https://www.amazon.in/");
    }
    public static void findElement(WebDriver driver,By selector){
        driver.findElement(selector);
    }
    public static void sendKeys( WebDriver driver,By selector, String keys){

        driver.findElement(selector).sendKeys(keys);
    }

    public static void byId_Click(WebDriver driver,String location){
        driver.findElement(By.id(location)).click();
    }

    public static void byXpath_Click(WebDriver driver,String location){
        driver.findElement(By.xpath(location)).click();
    }
    public static void byClassname_Click(WebDriver driver,String location){
        driver.findElement(By.xpath(location)).click();
    }
    public static void byName_Click(WebDriver driver,String location){
        driver.findElement(By.xpath(location)).click();

    }
    public static void byLinkedText_Click(WebDriver driver,String location){
        driver.findElement(By.xpath(location)).click();

    }
    public static void byPartialLinkedText_Click(WebDriver driver,String location){
        driver.findElement(By.xpath(location)).click();

    }

    public static void byTagName_Click(WebDriver driver,String location){
        driver.findElement(By.tagName(location)).click();

    }
    public static void byNameSendKeys( WebDriver driver,String location, String keys){

        driver.findElement(By.name(location)).sendKeys(keys);
    }
    public static void byIdSendKeys( WebDriver driver,String location, String keys){

        driver.findElement(By.id(location)).sendKeys(keys);
    }

    public static void byClassNameSendKeys( WebDriver driver,String location, String keys){

        driver.findElement(By.className(location)).sendKeys(keys);
    }

    public static void byLinkedTextSendKeys( WebDriver driver,String location, String keys){

        driver.findElement(By.linkText(location)).sendKeys(keys);
    }
    public static void byPartialLinkedTextSendKeys( WebDriver driver,String location, String keys){

        driver.findElement(By.partialLinkText(location)).sendKeys(keys);
    }

    public static void byTagNameSendKeys( WebDriver driver,String location, String keys){

        driver.findElement(By.tagName(location)).sendKeys(keys);
    }
    public static void closeApplication(WebDriver driver){
        driver.quit();

    }
    public static Boolean isVisible(WebDriver driver,By selector){

        return true;
    }
public static void manage(WebDriver driver){
        driver.manage();
}
    public static void getCurrentURL(WebDriver driver){

        driver.getCurrentUrl();
    }
    public static void getTitle(WebDriver driver){

        driver.getTitle();
    }

    public static void windowHandleDemo(WebDriver driver){
        String parent=driver.getWindowHandle();

        Set<String> s=driver.getWindowHandles();


        Iterator<String> I1= s.iterator();

        while(I1.hasNext())
        {

            String child_window=I1.next();


            if(!parent.equals(child_window))
            {
                driver.switchTo().window(child_window);

                System.out.println(driver.switchTo().window(child_window).getTitle());

                driver.close();
            }

        }

        driver.switchTo().window(parent);

    }

    public static void switchTo(WebDriver driver ){
        driver.switchTo();
    }
        public static void clearInputId( WebDriver driver,String location, String keys){

            driver.findElement(By.id(location)).clear();
        }
    public static void clearInputClassName( WebDriver driver,String location, String keys){

        driver.findElement(By.className(location)).clear();
    }
    public static void clearInputTagName( WebDriver driver,String location, String keys){

        driver.findElement(By.tagName(location)).clear();
    }

    public static void clearInputLinkedText( WebDriver driver,String location, String keys){

        driver.findElement(By.linkText(location)).clear();
    }
    public static void clearInputPartialLT( WebDriver driver,String location, String keys){

        driver.findElement(By.partialLinkText(location)).clear();
    }
    public static void clearInputName( WebDriver driver,String location, String keys){

        driver.findElement(By.name(location)).clear();
    }
    public static void clearInputXpath( WebDriver driver,String location, String keys){

        driver.findElement(By.xpath(location)).clear();
    }
        }







