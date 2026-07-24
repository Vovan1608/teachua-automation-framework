package com.zevovan.framework.pages;

import com.zevovan.framework.components.BaseComponent;
import com.zevovan.framework.components.Header;
import com.zevovan.framework.utils.BrowserUtils;
import org.openqa.selenium.WebDriver;

public abstract class BasePage extends BaseComponent {
    protected final Header header;
    protected final BrowserUtils browser;

    protected BasePage(WebDriver driver) {
        super(driver);
        this.header = new Header(driver);
        this.browser = new BrowserUtils(driver);
    }

    public Header getHeader() {
        return header;
    }
}
