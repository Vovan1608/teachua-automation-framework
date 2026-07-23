package com.zevovan.framework.home;

import com.zevovan.framework.components.modal.LoginModal;
import com.zevovan.framework.core.BaseTest;
import com.zevovan.framework.pages.HomePage;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageTest extends BaseTest {
    private HomePage homePage;

    @BeforeEach
    void openHomePage() {
        homePage = new HomePage(getDriver()).open();
    }

    @Test
    @DisplayName("For guest should be appear login modal window.")
    void openAddClubModal() {
        LoginModal modal = homePage.openAddClubModal();

        assertTrue(modal.isOpened());
    }

    @Test
    @DisplayName("Should be linked to the clubs page.")
    void openClubsPageFromHeader() {
       homePage.getHeader()
                .openClubsPageFromHeader();

        assertTrue(
                getDriver().getCurrentUrl().contains("clubs")
        );
    }

    @Test
    @DisplayName("Should be linked to the clubs page.")
    void openClubsPageFromDetailsButton() {
        homePage.openClubsPageFromDetailsButton();

        assertTrue(
                getDriver().getCurrentUrl().contains("clubs")
        );
    }

    @Test
    @DisplayName("Should be linked to the clubs page.")
    void openClubsPageFromMoreButton() {
        homePage.openClubsPageFromMoreButton();

        assertTrue(
                getDriver().getCurrentUrl().contains("clubs")
        );
    }

    @Test
    @DisplayName("Should be linked to the challenge page.")
    void openChallengePageFromHomePage() {
        homePage.openChallengePageFromHomePage();

        assertTrue(
                getDriver().getCurrentUrl().contains("challenge")
        );
    }

    @Test
    @DisplayName("Should be linked to the payment page.")
    void openPaymentPageFromHomePage() {
        homePage.openDonatePage();

        assertTrue(
                getDriver().getCurrentUrl().contains("payment")
        );
    }
}
