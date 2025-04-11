package com.example.base;

//import com.epam.healenium.SelfHealingDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver getDriver() {
        if (driver.get() == null) {
            WebDriver delegate = new ChromeDriver();
            delegate.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            delegate.manage().window().maximize();
//            SelfHealingDriver selfHealingDriver = SelfHealingDriver.create(delegate);
            driver.set(delegate);
//            driver.set(selfHealingDriver);
        }
        return driver.get();
    }

    public static void quitDriver() {
        driver.get().quit();
        driver.remove();
    }
}
