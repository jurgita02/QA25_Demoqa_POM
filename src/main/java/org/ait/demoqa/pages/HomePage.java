package org.ait.demoqa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage {
    public HomePage (WebDriver driver){
        super(driver);
    }

    @FindBy(css=".top-card:nth-child(6)")
    WebElement bookStore;
    public SidePanel getBookStore() {
        clickWithJSExecutor(bookStore,0,500);
        return new SidePanel (driver);
    }
@FindBy(xpath="//h5[.='Alerts, Frame & Windows']")
WebElement alertsLink;
    public AlertsPage getAlerts() {
        clickWithJSExecutor(alertsLink,0,400);
        return new AlertsPage(driver);
    }


}
