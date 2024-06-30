package RahulShettyAcademy.comPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class PracticePage {

    WebDriver driver;
    String radioButtonLocator="//input[@value='radio2']";
    String suggestionClassLocator="//input[@type='text']";
    String countryLocator="ui-menu-item-wrapper";
   String dropDownLocator= "dropdown-class-example";
   String  checkboxLocator1="checkBoxOption1";
    String  checkboxLocator2="checkBoxOption2";
    String  checkboxLocator3="checkBoxOption3";
    String displayedLocator="displayed-text";
    String showBoxLocator="show-textbox";
    String hideLocator="hide-textbox";

    String showLocator="show-textbox";


    public PracticePage(WebDriver driver) {
        this.driver = driver;
        this.driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
    }



    public void checkradioButton() {
        WebElement radio2Button = driver.findElement(By.xpath(radioButtonLocator));

        radio2Button.click();
    }
public void setSuggestionClassLocator() throws InterruptedException {
    WebElement sCLocator = driver.findElement(By.xpath(suggestionClassLocator));
    sCLocator.sendKeys("IND");
    Thread.sleep(1000);

    List<WebElement> allOptions=driver.findElements(By.className("ui-menu-item"));



    String option="India";

   for(WebElement options: allOptions){
        System.out.println(options.getText());
       if(options.getText().equals(option)) {
           System.out.println("Trying to select: "+option);
           options.click();
           break;
       }
   }



    Thread.sleep(1000);
        }


public void dropDown(){
        WebElement dropDownElement=driver.findElement(By.id(dropDownLocator));
        Select selectObjectOne=new Select(dropDownElement);
        selectObjectOne.selectByVisibleText("Option3");
    }

    public void checkBoxSelection(){
        WebElement cbOne=driver.findElement(By.id(checkboxLocator1));
        cbOne.click();
        WebElement cbTwo=driver.findElement(By.id(checkboxLocator2));
        cbTwo.click();
        WebElement cbThree=driver.findElement(By.id(checkboxLocator3));
        cbThree.click();

    }

    public void displayedBox(){
        WebElement displayedBoxElement=driver.findElement(By.id(displayedLocator));
        displayedBoxElement.sendKeys("Akhila");


        WebElement hideButtonElement=driver.findElement(By.id(hideLocator));
        hideButtonElement.click();
       // hideButtonElement.isDisplayed();


        WebElement showButtonElement=driver.findElement(By.id(showLocator));
        showButtonElement.click();
        //showButtonElement.isDisplayed();
        }
    }

