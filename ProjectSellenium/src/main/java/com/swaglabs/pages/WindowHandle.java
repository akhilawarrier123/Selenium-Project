package com.swaglabs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {

    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
        String parentWindow=driver.getWindowHandle();
        Set<String> windows=driver.getWindowHandles();

        for(String window:windows){
            driver.switchTo().window(window);
            if(driver.getTitle().equals("SeleniumConf Chicago 2023 Playlist - YouTube")){
                break;
            }
        }
      driver.findElement(By.xpath("//a[@title='Home']")).click();
        System.out.println(driver.getTitle());
    }
}
