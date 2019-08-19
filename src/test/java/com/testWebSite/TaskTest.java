package com.testWebSite;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskTest {

    @Test
    public void loginTest() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/damas/Downloads/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://members.helium10.com/user/signin");

        driver.quit();
    }
}
