package com.zevovan.framework.components.dropdown;

import com.zevovan.framework.components.BaseComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class BaseDropdown extends BaseComponent {
    public BaseDropdown (WebDriver driver) {
        super(driver);
    }

    protected abstract By getOptions();

    public void select(String value) {
        for (WebElement option : wait.waitUntilVisibleAll(getOptions())) {
            if (option.getText().trim().equals(value)) {
                option.click();
                return;
            }
        }

        throw new IllegalArgumentException("Option not found: " + value);
    }
}
