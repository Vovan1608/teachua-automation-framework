import com.zevovan.framework.config.ConfigReader;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
