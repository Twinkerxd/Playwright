package pages;

import core.BasePage;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class MainPage extends BasePage {

    private final Locator searchInput;

    public MainPage(Page page) {
        super(page);
        this.searchInput = page.locator(".search-input");
    }

    public void search(String text) {
        searchInput.click();
        page.fill("#query-builder-test",text);
        page.press("#query-builder-test", "Enter");
    }
}
