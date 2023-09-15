package org.example.locators;

import org.openqa.selenium.By;

public class Locators {
    public static By clickOnFirstProduct = By.xpath("(//div[@data-crosssell-title='Unsere Empfehlungen für Sie']/div[2]/ul/li)[1]");
    public static By priceTile = By.xpath("(//a[@data-qa-id='offer-attribute-price-tile'])[1]");
    public static By quantity = By.xpath("//button[@data-qa-id='product-quantity-select']");
    public static By selectQuantity = By.xpath("//li[@data-qa-id='product-quantity-select-option']");
    public static By addToCart = By.xpath("//button[@data-qa-id='add-to-cart-button']");
    public static By acceptButton = By.className("cwixVn");

}
