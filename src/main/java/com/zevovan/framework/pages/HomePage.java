package com.zevovan.framework.pages;

import com.zevovan.framework.config.ConfigReader;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    public HomePage(WebDriver driver) {
        super(driver);
    }

    public HomePage openHomePage() {
        driver.get(ConfigReader.getProperty("base.url"));

        return this;
    }
}
