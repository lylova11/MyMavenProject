package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;


public class ChangeNameTest {
    public static void main( String[] args ) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
//        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        options.addArguments("disable-popup-blocking");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://huddle.team/signup");
//      driver.manage().window().maximize();

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

//        старый код
//        WebElement webElement1 = driver.findElement(By.xpath(".//a[@title='Login here']"));
//        webElement1.click();
//        WebElement webElement2 = driver.findElement(By.xpath(".//input[@id='login_email']"));
//        webElement2.click();
//        webElement2.sendKeys("sprint444@yandex.ru");
//        WebElement webElement3 = driver.findElement(By.xpath(".//input[@id='password']"));
//        webElement3.click();
//        webElement3.sendKeys("1");
//        WebElement webElement4 = driver.findElement(By.xpath(".//button[@id='loginformsubmit']"));
//        webElement4.click();

//        WebElement webElement5 = driver.findElement(By.xpath(".//a[@title='Edit']"));
//        webElement5.click();
//        Thread.sleep(500);
//
//        WebElement webElement6 = driver.findElement(By.xpath(".//input[@name='first_name']"));
//        webElement6.clear();
//        webElement6.sendKeys("NewName");
//        WebElement webElement7 = driver.findElement(By.name("last_name"));
//        webElement7.clear();
//        webElement7.sendKeys("NewLastName");
//        Thread.sleep(500);
//        WebElement webElement8 = driver.findElement(By.xpath(".//button[@title='Save Changes']"));
//        webElement8.click();


    }
}
