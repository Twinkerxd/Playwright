package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import core.BasePage;

public class SignUpPage extends BasePage {
    private final Locator signUpTitle;

    public SignUpPage(Page page) {
        super(page);
        this.signUpTitle = page.locator("#signup-form-fields");
    }

    public Boolean isSignUpTitleVisible() {
        return signUpTitle.isVisible();
    }
}
