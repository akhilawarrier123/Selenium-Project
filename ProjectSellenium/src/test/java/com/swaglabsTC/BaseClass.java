package com.swaglabsTC;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

//import java.io.FileInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class BaseClass {
    ExtentReports extentReports;

    @DataProvider(name = "validCred")
    public Object[][] getValidCredentials() {

        Properties properties = new Properties();
        try {
            properties.load(new FileReader("D:\\intellij project\\ProjectSellenium\\src\\test\\resources\\testdata\\validCred.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        String[] username = properties.getProperty("username").split(",");
        String[] password = properties.getProperty("password").split(",");

        Object[][] testdata = new Object[username.length][2];
        for (int col = 0; col < 2; col++) {
            for (int row = 0; row < username.length; row++) {
                switch (col) {
                    case 0:
                        testdata[row][col] = username[row];
                        break;
                    case 1:
                        testdata[row][col] = password[col];
                        break;
                }
            }
        }

        return testdata;

    }
    @DataProvider(name = "InvalidCred")
    public Object[][] getInvalidCredentials()
    {
        return new Object[][]
                {
                        {"standard","secret"},
                        {"locked_user","secretSauce"},
                        {"problem","sauce"}
                };
    }
    @DataProvider(name = "invUservaPsw")
    public Object[][] getInvaliduservalpw()
    {
        return new Object[][]
                {
                        {"standard","secret_sauce"},
                        {"locked_user","secret_sauce"},
                        {"problem","secret_sauce"}
                };
    }
    @DataProvider(name = "vauserInvalpsw")
    public Object[][] getValuserInvalPsw()
    {
        return new Object[][]
                {
                        {"standard_user","secretsauce"},
                        {"locked_out_user","sauce"},
                        {"problem_user","secret"}
                };
    }









    @BeforeSuite
    public void reporting() {
        long timestamp = System.currentTimeMillis();

        ExtentSparkReporter reporter = new ExtentSparkReporter("D:\\intellij project\\ProjectSellenium\\Reports\\Swag-Labs-reports_" + timestamp + ".html");
        extentReports = new ExtentReports();
        extentReports.attachReporter(reporter);
    }

    @AfterSuite
    public void writeReport() {

        extentReports.flush();

    }

    public String captureScreenshot(WebDriver driver) {
        long timestamp = System.currentTimeMillis();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File destination = new File("D:\\intellij project\\ProjectSellenium\\src\\test\\resources\\screenshots\\screenshot_" + timestamp + ".png");
        try {
            FileUtils.copyFile(source,destination);
            return destination.getAbsolutePath();

        } catch (IOException e) {
           // throw new RuntimeException(e);
            System.err.println("Unable to capture the screenshot");
            return" ";
        }
    }


}


















