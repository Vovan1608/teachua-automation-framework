package com.zevovan.framework.pages;

import com.zevovan.framework.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private static class Locators {
        private static final By ADD_CLUB_MODAL = By.cssSelector("button[class*='add-club-button']");
        private static final By DETAILS_BUTTON_CLUBS_LINK = By.className("details-button");
        private static final By MORE_BUTTON_CLUBS_LINK = By.className("more-button");
        private static final By CHALLENGE_LINK = By.className("materials-button");
        private static final By DONATE_LINK = By.className("donate-button");
    }

    public HomePage open() {
        driver.get(ConfigReader.getProperty("base.url"));

        return this;
    }

    public ClubsPage openClubsPageFromDetailsButton() {
        wait.waitUntilClickable(Locators.DETAILS_BUTTON_CLUBS_LINK).click();

        return new ClubsPage(driver);
    }

    public ClubsPage openClubsPageFromMoreButton() {
        wait.waitUntilClickable(Locators.MORE_BUTTON_CLUBS_LINK).click();

        return new ClubsPage(driver);
    }

    public ChallengePage openChallengePageFromHomePage() {
        wait.waitUntilClickable(Locators.CHALLENGE_LINK);

        return new ChallengePage(driver);
    }

    public PaymentPage openPaymentPageFromHomePage() {
        wait.waitUntilClickable(Locators.DONATE_LINK).click();

        return new PaymentPage(driver);
    }
}
