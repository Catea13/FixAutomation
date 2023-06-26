package Steps;

import Hooks.TestContext;
import Pages.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.PageFactory;

public class MainSteps {
    private TestContext testContext;

    public MainSteps(TestContext testContext) {
        this.testContext = testContext;
    }

    @When("fill Search field with {string}")
    public void fillInWith(String value) {
        GooglePage googlePage = PageFactory.initElements(testContext.getHook().driver, GooglePage.class);
        googlePage.typeInSearchField(value);
    }

    @And("click  {string} button")
    public void clickButton(String button) {
        GooglePage googlePage = PageFactory.initElements(testContext.getHook().driver, GooglePage.class);
        switch (button) {
            case "Google Search":
                googlePage.clickSearchButton();
                break;

            default:
                System.out.println("This button " + button + " not exists");
        }
    }
}
