package com.zevovan.framework.components;

import com.zevovan.framework.pages.ClubsPage;
import com.zevovan.framework.pages.HomePage;
import com.zevovan.framework.waits.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Header {
    private final WebDriver driver;
    private final WaitUtils wait;

    public Header (WebDriver driver) {
        this.driver = driver;
        this.wait = new WaitUtils(driver);
    }

    private static class Locators {
        private static final By HOME_PAGE_LINK = By.cssSelector("div.left-side-menu a");
        private static final By CLUBS_LINK = By.cssSelector("li[data-menu-id*='clubs'] a");
        private static final By CHALLENGE_DROPDOWN = By.cssSelector("div[data-menu-id*='challenge_ONE']");
        private static final By NEWS_LINK = By.cssSelector("li[data-menu-id*='news'] a");
        private static final By ABOUT_LINK = By.cssSelector("li[data-menu-id*='about'] a");
        private static final By SERVICE_LINK = By.cssSelector("li[data-menu-id*='service'] a");
        private static final By CITY_DROPDOWN = By.className("city");
        private static final By USER_PROFILE_DROPDOWN = By.className("user-profile");
        private static final By SHOW_MAP_MODAL = By.className("show-map-button");
        private static final By SEARCH_INPUT = By.id("rc_select_82");
        private static final By ADVANCED_SEARCH_CLUBS_LINK = By.cssSelector("span[aria-label='search']");
        private static final By DETAILS_BUTTON_CLUBS_LINK = By.className("details-button");
        private static final By MORE_BUTTON_CLUBS_LINK = By.className("more-button");
        private static final By CHALLENGE_LINK = By.className("materials-button");
        private static final By DONATE_LINK = By.className("donate-button");
    }

    public HomePage openHomePage() {
        wait.waitUntilClickable(Locators.HOME_PAGE_LINK).click();

        return new HomePage(driver);
    }

    public ClubsPage openClubsPage() {
        wait.waitUntilClickable(Locators.CLUBS_LINK).click();

        return new ClubsPage(driver);
    }
}
