package com.zevovan.framework.waits;

import com.zevovan.framework.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitUtils {
    private final WebDriverWait wait;
    private static final Duration DURATION = Duration.ofSeconds(
            ConfigReader.getLongProperty("timeout.element.wait"));

    public WaitUtils(WebDriver driver) {
        this.wait = new WebDriverWait(driver, DURATION);
    }

    public WebElement waitUntilVisible(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public WebElement waitUntilClickable(By locator) {
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
