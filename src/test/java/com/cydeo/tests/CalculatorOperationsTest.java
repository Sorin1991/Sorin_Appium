package com.cydeo.tests;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import static org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CalculatorOperationsTest {

    AppiumDriver<MobileElement> driver;


    @BeforeEach
    public void setUp() throws MalformedURLException {
        //DesiredCapabilities
        DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability("deviceName","Pixel");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 3");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        caps.setCapability(MobileCapabilityType.APP,"https://cybertek-appium.s3.amazonaws.com/calculator.apk");

        //set URL for the appium server
        URL url = new URL("http://localhost:4723/wd/hub");

        //launch appiumDriver
         driver = new AndroidDriver<MobileElement>(url,caps);


    }

    /**
     * 4 + 5 = 9
     */

    @Test
    public void addTest(){

        //locate 4, plus, 5 , equals, and result
        MobileElement four = driver.findElement(By.id("com.google.android.calculator:id/digit_4"));
        four.click();

        MobileElement plus = driver.findElementByAccessibilityId("plus");
        plus.click();

        MobileElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        five.click();

        MobileElement equals = driver.findElementByAccessibilityId("equals");
        equals.click();

        MobileElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));

        String actResult = result.getText();
        int expResult = 9;

        Assertions.assertEquals(expResult,Integer.parseInt (actResult));

    }

    /**
     * 15 / 5 = 3
     */

    @Test
    public void divideTest(){

        MobileElement one = driver.findElement(By.id("com.google.android.calculator:id/digit_1"));
        one.click();

        MobileElement five = driver.findElement(By.id("com.google.android.calculator:id/digit_5"));
        five.click();

        MobileElement divide = driver.findElementByAccessibilityId("divide");
        divide.click();

        five.click();

        MobileElement equal = driver.findElementByAccessibilityId("equals");
        equal.click();

        MobileElement result = driver.findElement(By.id("com.google.android.calculator:id/result_final"));

        String actualResult = result.getText();
        System.out.println("Result = " + actualResult);

        int expectedResult = 3;











    }

    @AfterEach
    public  void cleanUp(){
        driver.closeApp();

    }


}
