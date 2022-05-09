package org.example.hw5;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChangeNameTest {

    static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

    }

    @BeforeEach
    void getPage(){
        driver.get("https://huddle.team/signup");
    }


    @Test
    void testDownloadApp() throws InterruptedException {
        driver.findElement(By.xpath(".//a[@title='Login here']")).click();
        driver.findElement(By.xpath(".//input[@id='login_email']")).sendKeys("sprint44444@yandex.ru");
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("1");
        driver.findElement(By.xpath(".//button[@id='loginformsubmit']")).click();

        Thread.sleep(500);

        driver.findElement(By.xpath(".//a[@title='Edit']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath(".//input[@name='first_name']")).clear();
        driver.findElement(By.xpath(".//input[@name='first_name']")).sendKeys("NewName");
        driver.findElement(By.name("last_name")).clear();
        driver.findElement(By.name("last_name")).sendKeys("NewLastName");
        Thread.sleep(500);
        driver.findElement(By.xpath(".//button[@title='Save Changes']")).click();
        Assertions.assertEquals("https://www.huddle.team/profile/settings?tab=general-information", driver.getCurrentUrl());

    }




}
