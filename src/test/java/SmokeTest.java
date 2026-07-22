import com.zevovan.framework.config.ConfigReader;
import com.zevovan.framework.pages.HomePage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmokeTest extends BaseTest{
    @Test
    void openTeachUA () {
        getDriver().get("https://speak-ukrainian.org.ua/dev/");

        assertEquals("Навчай українською", getDriver().getTitle());
    }

    @Test
    void checkConfig() {

        assertEquals("chrome", ConfigReader.getProperty("browser"));

        assertEquals("https://speak-ukrainian.org.ua/dev/", ConfigReader.getProperty("base.url"));
    }

    @Test
    void openHomePageTest() {
        HomePage homePage = new HomePage(getDriver())
                .open();

        homePage.getHeader();

        assertEquals(
                ConfigReader.getProperty("base.url"),
                getDriver().getCurrentUrl()
        );
    }

    @Test
    void openClubsPageFromHeader() {
        HomePage homePage = new HomePage(getDriver());

        homePage.open()
                .getHeader()
                .openClubsPageFromHeader();

        assertTrue(
                getDriver().getCurrentUrl().contains("clubs")
        );
    }

    @Test
    void openClubsPageFromDetailsButton() {
        HomePage homePage = new HomePage(getDriver());

        homePage.open()
                .openClubsPageFromDetailsButton();

        assertTrue(
                getDriver().getCurrentUrl().contains("clubs")
        );
    }
}
