package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SelectNewMusicTest extends AbstractTest {

    @Test
    void changeNameTest() throws InterruptedException {
        webDriver.get("https://huddle.team/signup");
        SignUpPage signUpPage = new SignUpPage(getWebDriver());
        signUpPage.clicklogInButton();
        LoginPage loginPage = new LoginPage(getWebDriver());
        loginPage
                .sendKeysEmailField()
                .sendKeysPasswordField()
                .clickSubmitButton();
        Thread.sleep(1000);
        AccountInfoPage accountInfoPage = new AccountInfoPage(getWebDriver());
        Thread.sleep(1000);
        accountInfoPage.clickEditButton();
        UserInfoPage userInfoPage = new UserInfoPage(getWebDriver());
        userInfoPage.clickUpgradesTab();
        UpgradesPage upgradesPage = new UpgradesPage(getWebDriver());
        upgradesPage.customHoldMusicSelector();
        upgradesPage.clickSaveChangesButton();

        Assertions.assertEquals("https://www.huddle.team/profile/settings?tab=upgrades", webDriver.getCurrentUrl());
    }

}

