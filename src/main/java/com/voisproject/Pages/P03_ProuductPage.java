package com.voisproject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.voisproject.Utilities.Utility.clicking;
import static com.voisproject.Utilities.Utility.verifyElementVisible;

public class P03_ProuductPage {
    private final WebDriver driver;

    public P03_ProuductPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By AddToCartButton = By.xpath("(//input[@id=\"add-to-cart-button\"])[1]");
    private  final By AddedToCartMessage = By.xpath("//div[@class=\"a-fixed-left-grid\"]");
    private final By AddToCardSign = By.id("nav-cart-count-container");


    public P03_ProuductPage PressAddToCartButton() {
        clicking(driver, AddToCartButton);
        return this;
    }

    public boolean VerifyUserAddedProductToCart() {
        // verify that the product is visible in the cart in product page
        return verifyElementVisible(AddedToCartMessage);
    }
    public P04_AddToCart NavigateToAddToCartPage() {
        clicking(driver, AddToCardSign);
        return new P04_AddToCart(driver);
    }




}
