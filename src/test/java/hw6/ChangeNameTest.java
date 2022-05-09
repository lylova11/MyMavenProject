package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ChangeNameTest extends AbstractTest {


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
        Thread.sleep(600);
        AccountInfoPage accountInfoPage = new AccountInfoPage(getWebDriver());
        accountInfoPage.clickEditButton();
        UserInfoPage userInfoPage = new UserInfoPage(getWebDriver());
        userInfoPage
            .sendKeysFirstNameField()
            .sendKeysLastNameField()
            .clickSaveChangesButton();
        Assertions.assertEquals("https://www.huddle.team/profile/settings?tab=general-information", webDriver.getCurrentUrl());
    }
}
