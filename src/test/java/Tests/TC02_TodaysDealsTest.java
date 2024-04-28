package Tests;

import com.voisproject.DriverManager.DriverManager;
import com.voisproject.Pages.P01_HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.voisproject.DriverManager.DriverFactory.createInstance;
import static com.voisproject.DriverManager.DriverManager.getDriver;
import static com.voisproject.Utilities.DataUtils.getEnvironmentPropertyValue;
import static com.voisproject.Utilities.Utility.openWebsite;

public class TC02_TodaysDealsTest {

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        createInstance(getEnvironmentPropertyValue("BROWSER"));
        openWebsite(getEnvironmentPropertyValue("TODAYSDEAL_URL"));
    }
    @Test
    public void verifyTodaysDeals() {
        new P01_HomePage(getDriver())
                .pressOnDismissButton()
                .pressOnTodaysDealButton()
                .pressOnHeadphonesButton()
                .pressOnGroceryButton()
                .pressOnDiscount10Button()
                .pressOnProduct()
                .PressAddToCartButton();
    }
    @AfterMethod
    public void tearDown() {
        DriverManager.quit();
    }
}
