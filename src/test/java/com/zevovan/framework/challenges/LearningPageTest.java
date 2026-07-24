package com.zevovan.framework.challenges;

import com.zevovan.framework.core.BaseTest;
import com.zevovan.framework.pages.HomePage;
import com.zevovan.framework.pages.LearningPage;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LearningPageTest extends BaseTest {
    @Test
    void openLearningPageFromChallengeDropdown() {

        LearningPage page = new HomePage(getDriver())
                .open()
                .getHeader()
                .openChallengeDropdown()
                .openLearnPage();

        assertTrue(page.isOpened());
    }

}
