package components;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import core.BasePage;
import pages.PricingPage;

public class HeaderMenuComponent extends BasePage {

    private final Locator pricingButton;

    public HeaderMenuComponent(Page page) {
        super(page);
        this.pricingButton = page.locator("a[href='https://github.com/pricing']");
    }

    public PricingPage clickPricingButton() {
        pricingButton.click();
        return new PricingPage(page);
    }
}
