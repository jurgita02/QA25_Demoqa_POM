package org.ait.demoqa.pages.alerts.Frame.Windows;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanelAlert extends BasePage {
    public SidePanelAlert(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[.='Alerts']")
    WebElement alertsButtonsLink;

    public AlertsPage clickOnAlertsLink() {
        clickWithJSExecutor(alertsButtonsLink, 0, 600);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//span[.='Browser Windows']")
    WebElement windowsButtonsLink;

    public WindowPage clickOnBrowserWindowLink() {
        click(windowsButtonsLink);
        return new WindowPage(driver);
    }
}
