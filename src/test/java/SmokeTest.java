import org.junit.jupiter.api.Test;

public class SmokeTest extends BaseTest{
    @Test
    void openTeachUA () {
        getDriver().get("https://speak-ukrainian.org.ua/dev/");

        System.out.println(getDriver().getTitle());
    }
}
