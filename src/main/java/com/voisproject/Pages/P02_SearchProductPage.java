package com.voisproject.Pages;

import com.voisproject.Utilities.LogUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static com.voisproject.DriverManager.DriverManager.getDriver;
import static com.voisproject.Utilities.Utility.*;

public class P02_SearchProductPage {
    private final WebDriver driver;
    private final By AllProductPage = By.cssSelector("div[class=\"features_items\"]>h2");
    private final By SearchField = By.xpath("//input[@id=\"search_product\"]");
    private final By SearchButton = By.cssSelector("button[id=\"submit_search\"]");
    private final By SearchedSection =
            By.xpath("//h2[@class=\"title text-center\" and contains(text(), 'Searched Products')]");
    private final List<WebElement> SearchResults = getDriver().findElements
            (By.xpath("//div[@id=\"cartModal\"]//following::div[@class=\"col-sm-4\"]"));

    private final By FirstElement = By.xpath("(//img[@class=\"s-image\"])[1]");
    public P02_SearchProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public P02_SearchProductPage PressSearchButton() {
        clicking(driver, SearchButton);
        return this;
    }
    public P03_ProuductPage PressOnTheFistProuduct() {
        clicking(driver, FirstElement);
        return new P03_ProuductPage(driver);
    }


    public Boolean VerifyUserNavigatedToAllProductsPage() {
        return verifyElementVisible(AllProductPage);
    }


    public Boolean VerifySearchedProductsSectionVisible() {
        return verifyElementVisible(SearchedSection);
    }

    public int VerifyAllProductRelatedToSearchVisible() {
       LogUtils.info("Search Result Size:" + SearchResults.size());
       return SearchResults.size();
    }


}
