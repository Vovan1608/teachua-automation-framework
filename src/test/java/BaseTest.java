import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.zevovan.driver.DriverFactory;

public class BaseTest {
    private WebDriver driver;

    protected WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    void setup() {
        driver = DriverFactory.createDriver();
    }

    @AfterEach
    void tearDown () {
        if(driver != null) {
            driver.quit();
        }
    }
}
