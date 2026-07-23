package com.zevovan.framework.smoke;

import com.zevovan.framework.config.ConfigReader;
import com.zevovan.framework.core.BaseTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SmokeTest extends BaseTest {
    @Test
    void openTeachUA () {
        getDriver().get("http://speak-ukrainian.eastus2.cloudapp.azure.com/dev/");

        assertEquals("Навчай українською", getDriver().getTitle());
    }

    @Test
    void checkConfig() {

        assertEquals("chrome", ConfigReader.getProperty("browser"));

        assertEquals("http://speak-ukrainian.eastus2.cloudapp.azure.com/dev/", ConfigReader.getProperty("base.url"));
    }
}
