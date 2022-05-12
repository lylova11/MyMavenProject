package hw6;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class ChangeNameTest extends AbstractTest {


    @Test
    @DisplayName("Change Name/Last Name test")
    @Description("This test changes Name/Last Name on the User Information page")
    @Link("https://www.huddle.team/profile/settings?tab=general-information")
    @Issue("Jira Issue №123")
    @Severity(SeverityLevel.CRITICAL)
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
