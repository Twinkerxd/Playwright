import com.microsoft.playwright.assertions.PlaywrightAssertions;
import org.junit.jupiter.api.Test;

public class Tests extends BaseTest{

    @Test
    public void searchInputTest() {
        MainPage mainPage = new MainPage(page);
        mainPage.search("twinkerxd");
        PlaywrightAssertions.assertThat(page.locator("a[href='/Twinkerxd/Twinkerxd']")).hasCount(1);
    }
}
