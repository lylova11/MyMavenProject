package hw6;

import io.qameta.allure.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public class EventListenerTest extends AbstractTest {


    @Test
    @DisplayName("Example test for fail")
    @Description("Example test with error")
    @Link("https://www.huddle.team/downloads")
    @Issue("Jira Issue №129")
    @Severity(SeverityLevel.NORMAL)
    void changeNameTest() {
        webDriver.get("https://huddle.team");
        try {
            getWebDriver().findElement(By.id("нет такого"));
        } catch (NoSuchElementException e) {
            MyUtils.makeScreenshot(getWebDriver(),
                    "failure.test" + System.currentTimeMillis() + ".png");
        }
        WebElement webElement = getWebDriver().findElement(By.cssSelector(".sb-icon-search"));
        webElement.click();
        Assertions.assertEquals("https://www.huddle.team/profile/settings?tab=general-information", webDriver.getCurrentUrl());
    }

}
