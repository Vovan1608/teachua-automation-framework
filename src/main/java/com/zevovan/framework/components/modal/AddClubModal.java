package com.zevovan.framework.components.modal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddClubModal extends BaseModal{
    public AddClubModal(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private static final By TITLE = By.cssSelector("div[class*='modal-add-club']");
    }

    public boolean isOpened() {
        return wait.waitUntilVisible(Locators.TITLE).isDisplayed();
    }
}
