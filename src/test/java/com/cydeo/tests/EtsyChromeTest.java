package com.cydeo.tests;

import io.appium.java_client.MobileElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class EtsyChromeTest extends WebTestBase{


    @Test
    public void etsySearchTest() throws InterruptedException {

        driver.get("https://www.etsy.com");
        Thread.sleep(3000);

        WebElement cookies = driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        cookies.click();
        WebElement searchField = driver.findElement(By.id("global-enhancements-search-query"));
        searchField.sendKeys("wooden spoon"+ Keys.ENTER);

    }

}
