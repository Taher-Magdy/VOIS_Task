package com.voisproject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.voisproject.Utilities.Utility.clicking;

public class P05_TodaysDealsPage {

    private final WebDriver driver;

    public P05_TodaysDealsPage(WebDriver driver) {
        this.driver = driver;
    }
    private final By HeadphonesButton = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[27]/label/input");
    // //*[@id="grid-main-container"]/div[2]/span[3]/ul/li[27]/label/input
    private final By GroceryButton = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[3]/ul/li[25]/label/input");
    private final By discount10Button = By.xpath("//*[@id=\"grid-main-container\"]/div[2]/span[6]/ul/li[2]/div/a/span");
    private final By AnyProductButton = By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[3]");
    private final By AddToCartButton = By.xpath("(//input[@id=\"add-to-cart-button\"])[1]");

    public P05_TodaysDealsPage pressOnHeadphonesButton() {
        clicking(driver, HeadphonesButton);
        return this;
    }
    public P05_TodaysDealsPage pressOnGroceryButton() {
        clicking(driver, GroceryButton);
        return this;
    }
    public P05_TodaysDealsPage pressOnDiscount10Button() {
        clicking(driver, discount10Button);
        return this;
    }
    public P05_TodaysDealsPage pressOnProduct() {
        clicking(driver, AnyProductButton);
        return this;
    }
    public P05_TodaysDealsPage PressAddToCartButton() {
        clicking(driver, AddToCartButton);
        return this;
    }

}
