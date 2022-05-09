package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest {
    public static void main( String[] args ) {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.addArguments("disable-popup-blocking");


        WebDriver driver = new ChromeDriver(options);
        driver.get("https://huddle.team/signup");


        driver.findElement(By.xpath(".//a[@title='Login here']")).click();

        driver.findElement(By.xpath(".//input[@id='login_email']")).sendKeys("sprint44444@yandex.ru");
        driver.findElement(By.xpath(".//input[@id='password']")).sendKeys("1");
        driver.findElement(By.xpath(".//button[@id='loginformsubmit']")).click();



//        WebElement webElement1 = driver.findElement(By.xpath(".//a[@title='Login here']"));
//        webElement1.click();
//        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='login_email']"));
//        webElement2.click();
//        webElement2.sendKeys("sprint44444@yandex.ru");
//        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='password']"));
//        webElement3.click();
//        webElement3.sendKeys("1");
//        WebElement webElement4 = driver.findElement(By.xpath(".//button[@id='loginformsubmit']"));
//        webElement4.click();

//        driver.quit();
    }
}
