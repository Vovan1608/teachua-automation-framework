package com.zevovan.framework.pages;

import com.zevovan.framework.waits.WaitUtils;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    private final WebDriver driver;
    private final WaitUtils wait;

    public PaymentPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }
}
