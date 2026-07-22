package com.zevovan.framework.pages;

import com.zevovan.framework.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private static final By ADD_CLUB_MODAL = By.cssSelector("button[class*='add-club-button']");
    }

    public HomePage open() {
        driver.get(ConfigReader.getProperty("base.url"));

        return this;
    }


}
