package RahulShettyAcademy.comTestcases;

import RahulShettyAcademy.comPages.PracticePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticePageTestCase {
    public static void main(String[] args) throws InterruptedException {
        PracticePageTestCase practicePageTestCase=new PracticePageTestCase();
        practicePageTestCase.testCasePracticePage();
    }

    public void testCasePracticePage() throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");

        PracticePage practicePage=new PracticePage(driver);
        practicePage.checkradioButton();
        practicePage.setSuggestionClassLocator();
        practicePage.dropDown();
        practicePage.checkBoxSelection();

        practicePage.displayedBox();
    }

}
