package com.zevovan.framework.components.dropdown;

import com.zevovan.framework.pages.LearningPage;
import com.zevovan.framework.pages.UniquePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChallengeDropdown extends BaseDropdown{
    public ChallengeDropdown(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private static final By OPTIONS = By.cssSelector("[id$='challenge_ONE-popup'] .ant-menu-item");
    }

    @Override
    protected By getOptions() {
        return Locators.OPTIONS;
    }

    public enum Item {
        LEARN("Навчайся"),
        UNIQUE("Єдині");

        private final String text;

        Item (String text) {
            this.text = text;
        }

        public String getText() {
            return text;
        }
    }

    public LearningPage openLearnPage() {
        select(Item.LEARN.getText());

        return new LearningPage(driver);
    }

    public UniquePage openUniquePage() {
        select(Item.UNIQUE.getText());

        return new UniquePage(driver);
    }


}
