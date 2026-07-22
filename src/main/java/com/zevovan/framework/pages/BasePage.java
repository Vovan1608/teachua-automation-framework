package com.zevovan.framework.pages;

import com.zevovan.framework.components.Header;
import com.zevovan.framework.waits.WaitUtils;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    protected final WebDriver driver;
    protected final WaitUtils wait;
    protected final Header header;

    protected BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
        this.header = new Header(driver);
    }

    public Header getHeader() {
        return header;
    }
}
