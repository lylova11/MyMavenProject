package hw6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class LoginTest extends AbstractTest {

   @Test
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
