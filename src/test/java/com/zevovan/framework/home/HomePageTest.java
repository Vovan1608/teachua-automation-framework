package com.zevovan.framework.home;

import com.zevovan.framework.config.ConfigReader;
import com.zevovan.framework.core.BaseTest;
import com.zevovan.framework.pages.HomePage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseTest {
    private HomePage homePage;

    @BeforeEach
    void openHomePage() {
        homePage = new HomePage(getDriver()).open();
    }

    @Test
    void openHomePageTest() {
        homePage.getHeader();

        assertEquals(
                ConfigReader.getProperty("base.url"),
                getDriver().getCurrentUrl()
        );
    }

    @Test
    void openClubsPageFromHeader() {
       homePage.open()
                .getHeader()
                .openClubsPageFromHeader();

        assertTrue(
                getDriver().getCurrentUrl().contains("clubs")
        );
    }

    @Test
    void openClubsPageFromDetailsButton() {
        homePage.open()
                .openClubsPageFromDetailsButton();

        assertTrue(
                getDriver().getCurrentUrl().contains("clubs")
        );
    }

    @Test
    void openClubsPageFromMoreButton() {
        homePage.open()
                .openClubsPageFromMoreButton();

        assertTrue(
                getDriver().getCurrentUrl().contains("clubs")
        );
    }

    @Test
    void openChallengePageFromHomePage() {
        homePage.open()
                .openChallengePageFromHomePage();

        assertTrue(
                getDriver().getCurrentUrl().contains("challenge")
        );
    }

    @Test
    void openPaymentPageFromHomePage() {
        homePage.open()
                .openDonatePage();

        assertTrue(
                getDriver().getCurrentUrl().contains("payment")
        );
    }
}
