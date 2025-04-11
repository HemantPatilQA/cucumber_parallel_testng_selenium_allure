package com.example.steps;

import com.example.base.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StepDefinitions {
    WebDriver driver = DriverFactory.getDriver();

    @Given("I open the OrangeHRM login page")
    public void openLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @When("I login with username {string} and password {string}")
    public void login(String username, String password) {
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
    }

    @Then("I should see the dashboard")
    public void verifyDashboard() {
        boolean visible = driver.findElements(By.xpath("//h6[text()='Dashboard']")).size() > 0;
        assert visible : "Dashboard heading not found!";
    }

    @Then("I should see some widgets on dashboard")
    public void verifyWidgets() {
        boolean widgetsVisible = driver.findElements(By.cssSelector(".orangehrm-dashboard-widget")).size() > 0;
        assert widgetsVisible : "Dashboard widgets not found!";
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}
