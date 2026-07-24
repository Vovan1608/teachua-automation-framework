package com.zevovan.framework.header;

import com.zevovan.framework.components.Header;
import com.zevovan.framework.core.BaseTest;
import com.zevovan.framework.pages.HomePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HeaderTest extends BaseTest {
    private Header header;

    @BeforeEach
    void setUp() {
        HomePage homePage = new HomePage(getDriver()).open();
        header = homePage.getHeader();
    }

    @Test
    @DisplayName("Should be linked to the clubs page.")
    void openClubsPageFromHeader() {
        header.openClubsPageFromHeader();

        assertTrue(getDriver().getCurrentUrl().contains("clubs"));
    }

    @Test
    @DisplayName("Should be linked to the news page.")
    void openNewsPageFromHeader() {
        header.openNewsPage();

        assertTrue(getDriver().getCurrentUrl().contains("news"));
    }
}
