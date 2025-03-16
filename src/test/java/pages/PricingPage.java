package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import core.BasePage;

public class PricingPage extends BasePage {
    private final Locator joinForFreeButton;

    public PricingPage(Page page) {
        super(page);
        this.joinForFreeButton = page.locator("[test_selector='plan-input-free']");
    }

    public void clickJoinForFreeButton() {
        joinForFreeButton.click();
    }
}
