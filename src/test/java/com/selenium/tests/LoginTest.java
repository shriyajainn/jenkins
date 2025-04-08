package com.selenium.tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    public void openGoogle() {
        System.setProperty("webdriver.chrome.driver", "C:\\jenkins\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");

        System.out.println("Title is: " + driver.getTitle());
        driver.quit();
    }
}
