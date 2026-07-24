package com.zevovan.framework.components;

import com.zevovan.framework.waits.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseComponent {
    protected final WebDriver driver;
    protected final WaitUtils wait;

    protected BaseComponent(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }

    protected void click(By locator) {
        wait.waitUntilClickable(locator).click();
    }

    protected void type(By locator, String text) {
        WebElement element = wait.waitUntilVisible(locator);
        element.clear();
        element.sendKeys(text);
    }

    protected void scrollTo(By locator) {
        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block: 'center'});",
                        driver.findElement(locator)
                );
    }
}
