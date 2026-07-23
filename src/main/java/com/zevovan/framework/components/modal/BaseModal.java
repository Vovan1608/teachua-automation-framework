package com.zevovan.framework.components.modal;

import com.zevovan.framework.waits.WaitUtils;
import org.openqa.selenium.WebDriver;

public abstract class BaseModal {
    protected final WebDriver driver;
    protected final WaitUtils wait;

    protected BaseModal(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }
}
