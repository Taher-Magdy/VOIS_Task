package com.voisproject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.voisproject.Utilities.Utility.verifyElementVisible;

public class P04_AddToCart {


    private final WebDriver driver;

    public P04_AddToCart(WebDriver driver) {
        this.driver = driver;
    }
    private By ProductAddedToCart = By.className("sc-list-item-content");
    // class= sc-list-item-content
    public boolean VerifyProductAddedToAddToCartPage() {
        // verify that the product is visible in the cart in add to cart page
        return verifyElementVisible(ProductAddedToCart);
    }

}
