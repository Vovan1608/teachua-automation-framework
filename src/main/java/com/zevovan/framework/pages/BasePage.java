package com.zevovan.framework.pages;

import com.zevovan.framework.components.Header;
import com.zevovan.framework.utils.BrowserUtils;
import com.zevovan.framework.waits.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BasePage {
    protected final WebDriver driver;
    protected final WaitUtils wait;
    protected final Header header;
    protected final BrowserUtils browser;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
        this.header = new Header(driver);
        this.browser = new BrowserUtils(driver);
    }

    public Header getHeader() {
        return header;
    }

    protected void scrollTo(By locator) {
        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block: 'center'});",
                        driver.findElement(locator)
                );
    }
}
