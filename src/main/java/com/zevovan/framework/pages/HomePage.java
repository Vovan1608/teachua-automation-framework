package com.zevovan.framework.pages;

import com.zevovan.framework.components.modal.AddClubModal;
import com.zevovan.framework.components.modal.LoginModal;
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

    public LoginModal  openAddClubModal() {
        click(Locators.ADD_CLUB_MODAL);

        return new LoginModal(driver);
    }

    public ClubsPage openClubsPageFromDetailsButton() {
        click(Locators.DETAILS_BUTTON_CLUBS_LINK);

        return new ClubsPage(driver);
    }

    public ClubsPage openClubsPageFromMoreButton() {
        click(Locators.MORE_BUTTON_CLUBS_LINK);

        return new ClubsPage(driver);
    }

    public ChallengePage openChallengePageFromHomePage() {
        scrollTo(Locators.CHALLENGE_LINK);
        click(Locators.CHALLENGE_LINK);

        return new ChallengePage(driver);
    }

    public PaymentPage openDonatePage() {
        scrollTo(Locators.DONATE_LINK);
        click(Locators.DONATE_LINK);
        browser.switchToNewTab();

        return new PaymentPage(driver);
    }
}
