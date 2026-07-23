package com.zevovan.framework.components.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModal extends BaseModal{
    public LoginModal(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private static final By ROOT_LOGIN_MODAL = By.cssSelector("div[class*='modal-login']");
    }

    public boolean isOpened() {
        return wait.waitUntilVisible(Locators.ROOT_LOGIN_MODAL).isDisplayed();
    }
}
