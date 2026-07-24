package com.zevovan.framework.components.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginModal extends BaseModal{
    public LoginModal(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private static final By ROOT_LOGIN_MODAL = By.cssSelector("div[class*='modal-login']");
        private static final By EMAIL_INPUT = By.id("basic_email");
        private static final By PASSWORD_INPUT = By.id("basic_password");
        private static final By LOGIN_BUTTON = By.className("login-button");
    }

    public boolean isOpened() {
        return wait.waitUntilVisible(Locators.ROOT_LOGIN_MODAL).isDisplayed();
    }

    public LoginModal enterEmail(String email) {
        type(Locators.EMAIL_INPUT, email);

        return this;
    }

    public LoginModal enterPassword(String password) {
        type(Locators.PASSWORD_INPUT, password);

        return this;
    }

    public void logIn(By locator) {
        wait.waitUntilClickable(Locators.LOGIN_BUTTON);
    }

}
