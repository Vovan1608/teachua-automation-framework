package com.zevovan.framework.pages;

import org.openqa.selenium.WebDriver;

public class LearningPage extends BasePage{
    public  LearningPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOpened() {
        return driver.getCurrentUrl().contains("/challenges/2");
    }
}
