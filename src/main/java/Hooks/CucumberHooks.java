package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class CucumberHooks {
    private TestContext testContext;

    public CucumberHooks(TestContext testContext) {
        this.testContext = testContext;
    }

    @Before
    public void setUp() {
        testContext.getHook().setup();
    }

    @After
    public void tearDown() {
        testContext.getHook().close();
    }
}