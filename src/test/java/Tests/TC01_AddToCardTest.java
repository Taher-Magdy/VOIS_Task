package Tests;

import com.voisproject.DriverManager.DriverManager;
import com.voisproject.Pages.P01_HomePage;
import com.voisproject.Pages.P03_ProuductPage;
import com.voisproject.Pages.P04_AddToCart;
import com.voisproject.Utilities.Utility;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.voisproject.DriverManager.DriverFactory.createInstance;
import static com.voisproject.DriverManager.DriverManager.getDriver;
import static com.voisproject.Utilities.DataUtils.getEnvironmentPropertyValue;
import static com.voisproject.Utilities.Utility.openWebsite;

public class TC01_AddToCardTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        createInstance(getEnvironmentPropertyValue("BROWSER"));
        openWebsite(getEnvironmentPropertyValue("BASE_URL"));
}
    @Test
 public void AddToCard() {

     new P01_HomePage(getDriver())
             .searchProduct("car accessories")
             .PressOnTheFistProuduct()
             .PressAddToCartButton();
     // Make Double check with using two different pages
        Assert.assertTrue(new P03_ProuductPage(getDriver()).VerifyUserAddedProductToCart(), "Product is not added to cart");
        new P03_ProuductPage(getDriver()).NavigateToAddToCartPage();
        Assert.assertTrue(new P04_AddToCart(getDriver()).VerifyProductAddedToAddToCartPage(), "Product is not added to cart in add to cart page");
 }
    @AfterMethod
    public void tearDown() {
        DriverManager.quit();
    }

}

