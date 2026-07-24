package com.zevovan.framework.components.modal;

import com.zevovan.framework.components.BaseComponent;
import org.openqa.selenium.WebDriver;

public abstract class BaseModal extends BaseComponent {

    protected BaseModal(WebDriver driver) {
        super(driver);
    }
}
