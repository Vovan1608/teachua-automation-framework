package com.zevovan.framework.utils;

import org.openqa.selenium.WebDriver;

public class BrowserUtils {

    private final WebDriver driver;

    public BrowserUtils(WebDriver driver) {
        this.driver = driver;
    }

    public void switchToNewTab() {

        String currentWindow = driver.getWindowHandle();

        for (String window : driver.getWindowHandles()) {
            if (!window.equals(currentWindow)) {
                driver.switchTo().window(window);
                return;
            }
        }

        throw new IllegalStateException("New browser tab was not opened.");
    }
}
