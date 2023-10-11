package org.ait.demoqa.pages;

import org.ait.demoqa.pages.alerts.Frame.Windows.AlertsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
WebElement alertsFramesWindows;
    public AlertsPage getAlertsFramesWindows() {
        clickWithJSExecutor(alertsFramesWindows,0,400);
        return new AlertsPage(driver);
    }
    @FindBy(css=".top-card:nth-child(1)")
    WebElement elements;

    public SidePanel getElements() {
        clickWithJSExecutor(elements,0,200);
        return new SidePanel(driver);
    }
    @FindBy(css=".top-card:nth-child(4)")
    WebElement widgets;
    public SidePanel getWidgets() {
        clickWithJSExecutor(widgets,0,200);
        return new SidePanel(driver);
    }
    @FindBy(css=".top-card:nth-child(2)")
    WebElement forms;

    public SidePanel getForms() {
        clickWithJSExecutor(forms,0,200);
        return new SidePanel(driver);
    }
    @FindBy(css=".top-card:nth-child(5)")
    WebElement interactions;
    public SidePanel getInteractions() {
        clickWithJSExecutor(interactions,0,200);
        return new SidePanel(driver);
    }
}
