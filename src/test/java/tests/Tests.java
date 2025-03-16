package tests;

import components.HeaderMenuComponent;
import core.BaseTest;
import org.junit.jupiter.api.Assertions;
import pages.MainPage;
import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.junit.jupiter.api.Test;
import pages.SignUpPage;

public class Tests extends BaseTest {



    @Test
    public void searchInputTest() {
        MainPage mainPage = new MainPage(page);
        mainPage.search("twinkerxd");
        PlaywrightAssertions.assertThat(page.locator("a[href='/Twinkerxd/Twinkerxd']")).hasCount(1);
    }

    @Test
    public void visibleOfSignUpTitle() {
        HeaderMenuComponent headerMenuComponent = new HeaderMenuComponent(page);
        headerMenuComponent
                .clickPricingButton()
                .clickJoinForFreeButton();

        Assertions.assertFalse(new SignUpPage(page).isSignUpTitleVisible());
    }
}
