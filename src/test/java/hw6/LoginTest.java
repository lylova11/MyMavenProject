package hw6;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



public class LoginTest extends AbstractTest {

   @Test
   @DisplayName("Login test")
   @Description("This test logs in to Huddle.team service")
   @Link("https://www.huddle.team/profile/account-info-login")
   @Issue("Jira Issue №127")
   @Severity(SeverityLevel.BLOCKER)
   void loginPageTest() {
      webDriver.get("https://huddle.team/signup");
      SignUpPage signUpPage = new SignUpPage(getWebDriver());
      signUpPage.clicklogInButton();
      LoginPage loginPage = new LoginPage(getWebDriver());
      loginPage.sendKeysEmailField();
      loginPage.sendKeysPasswordField();
      loginPage.clickSubmitButton();
      Assertions.assertEquals("https://www.huddle.team/profile/account-info-login", webDriver.getCurrentUrl());
   }
}
