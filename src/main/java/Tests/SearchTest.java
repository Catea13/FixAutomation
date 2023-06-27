package Tests;

import Hooks.Hook;
import Pages.GooglePage;
import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class SearchTest extends Hook {
    @Test(description = "check that google page is loaded")
    public void testIfGooglePageIsLoaded() {
        GooglePage googlePage = PageFactory.initElements(driver, GooglePage.class);

        String searchText = "QA";
        googlePage.searchField.sendKeys(searchText);
        googlePage.clickSearchButton();

        String pageTitle = driver.getTitle();
        Assert.assertTrue("Entered text equals QA", pageTitle.contains(searchText));
    }
}
