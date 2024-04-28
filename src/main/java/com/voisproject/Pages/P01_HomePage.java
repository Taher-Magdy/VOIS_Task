package com.voisproject.Pages;

import com.voisproject.Utilities.LogUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.voisproject.Utilities.Utility.*;
public class P01_HomePage {


    private final WebDriver driver;

    private final By ProductButton = By.xpath("//a[@href=\"/products\"]");

    //  Test Case 25: Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    private final By SubscriptionText = By.xpath("//h2[contains(text(),'Subscription')]");
    private final By ScrollUpButton = By.cssSelector("[id=\"scrollUp\"]");
    private final By HeaderText = By.cssSelector("div[class='item active'] div[class='col-sm-6'] h2");

    private final By SearchField = By.name("field-keywords");
    private final By SearchButton = By.id("nav-search-submit-button");
    private final By AllButton = By.className("hm-icon-label");
    //*[@id="hmenu-content"]/ul[1]/li[7]/a
    // nav-sprite hmenu-arrow-next
    // (//a[@class="hmenu-item"])[4]

    private final By dismissButton = By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input");
    private final By todaysdealButton = By.cssSelector("#nav-xshop > a:nth-child(2)");
    public P01_HomePage(WebDriver driver) {
        this.driver = driver;
    }


    /**
     * This method is used to click on the products button on the home page
     */

    public P02_SearchProductPage searchProduct(String product) {
        sendData(driver, SearchField, product);
        clicking(driver, SearchButton);
        return new P02_SearchProductPage(driver);
    }

    public P01_HomePage pressOnAllButton() {
        clicking(driver, AllButton);
        return this;
    }

    public P01_HomePage pressOnDismissButton() {
        clicking(driver, dismissButton);
        return this;
    }
    public P05_TodaysDealsPage pressOnTodaysDealButton() {
        clicking(driver, todaysdealButton);
        return new P05_TodaysDealsPage(driver);
    }


    /**
     * This method is used to scroll to the bottom of the home page
     */
    public P01_HomePage scrollToBottom() {
        scrollToElementAtBottom(driver, SubscriptionText);
        return this;
    }

    /**
     * This method is used to verify scroll down to the bottom of the home page
     */
    public P01_HomePage verifyScrollDown() {
        verifyElementVisible(SubscriptionText);
        LogUtils.info("SubscriptionText:" + getText(driver, SubscriptionText));
        return this;
    }

    /**
     * This method is used scrollUp on the home page
     */
    public P01_HomePage pressScrollUpButton() {
        clicking(driver, ScrollUpButton);
        return this;
    }

    /**
     * This method is used to verify scrollUP to the top of the home page
     */
    public P01_HomePage verifyScrollUp() {
        verifyElementVisible(HeaderText);
        LogUtils.info("HeaderText:" + getText(driver, HeaderText));
        return this;
    }

    public P01_HomePage scrollToUpWithOutArrowButton() {
        scrollToElementAtTop(driver, HeaderText);
        return this;

    }
}