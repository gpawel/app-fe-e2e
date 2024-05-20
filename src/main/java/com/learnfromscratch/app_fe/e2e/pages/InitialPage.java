package com.learnfromscratch.app_fe.e2e.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InitialPage extends AbstractPage{
    private final By backEndHeader = By.id("backend");
    private final By functionHeader = By.id("function");
    private final By componentHeader = By.id("component");

    public InitialPage(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.visibilityOfElementLocated(backEndHeader));
        wait.until(ExpectedConditions.visibilityOfElementLocated(functionHeader));
        wait.until(ExpectedConditions.visibilityOfElementLocated(componentHeader));
    }

    public String getBackEndHeaderValue() {
        return getLocatorValue(backEndHeader);
    }

    public String getFunctionHeaderValue() {
        return getLocatorValue(functionHeader);
    }

    public String getComponentHeaderValue() {
        return getLocatorValue(componentHeader);
    }

    private String getLocatorValue(By locator) {
        return driver.findElement(locator).getText();
    }
}
