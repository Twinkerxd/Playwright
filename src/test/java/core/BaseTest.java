package core;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;

import java.util.Properties;

public class BaseTest {

    protected static Playwright playwright;
    protected static Browser browser;
    protected BrowserContext context;
    protected Page page;
    protected Properties config;

    @BeforeEach
    public void setupTest() {
        playwright = Playwright.create();
        BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
        browser = playwright.chromium().launch(launchOptions);
        context = browser.newContext(new Browser.NewContextOptions().setViewportSize(1920,1080).setIgnoreHTTPSErrors(true));
        page = context.newPage();
        page.navigate("https://github.com/");
    }

    @AfterAll
    public static void tearDown() {
        browser.close();
        playwright.close();
    }
}
