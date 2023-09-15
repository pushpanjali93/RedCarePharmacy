package org.example.pages;

import org.example.locators.Locators;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.example.commonFunctions.CommonFunctions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

public class Pages {

    public static void deleteCookies() {
        WebDriver driver = Base.getDriver();
        String title = driver.getTitle();
        Assert.assertEquals("SHOP APOTHEKE ▷ Online Apotheke für Deutschland", title);
        driver.findElement(By.id("usercentrics-root")).getShadowRoot().findElement(Locators.acceptButton).click();
    }

    public static void anyOneOfTheProduct() {
        WebDriver driver = Base.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)", "");
        CommonFunctions.waitForElement(Locators.clickOnFirstProduct, 20);
        driver.findElement(Locators.clickOnFirstProduct).click();
    }

    public static void priceTile() {
        WebDriver driver = Base.getDriver();
        CommonFunctions.waitForElement(Locators.priceTile, 30);
        driver.findElement(Locators.priceTile).click();
    }

    public static void Quantity() {
        WebDriver driver = Base.getDriver();
        WebElement ele = driver.findElement(Locators.quantity);
        Actions a = new Actions(driver);
        a.moveToElement(ele);
        a.perform();
        ele.click();
        CommonFunctions.waitForElement(Locators.selectQuantity, 30);
        List<WebElement> totalQuantity = driver.findElements(Locators.selectQuantity);
        int size = totalQuantity.size();
        totalQuantity.get(size - 1).click();
    }

    public static void addToCart() {
        WebDriver driver = Base.getDriver();
        CommonFunctions.waitForElement(Locators.addToCart, 30);
        driver.findElement(Locators.addToCart).click();
    }

}
