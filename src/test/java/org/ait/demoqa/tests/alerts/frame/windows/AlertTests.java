package org.ait.demoqa.tests.alerts.frame.windows;

import org.ait.demoqa.pages.alerts.Frame.Windows.AlertsPage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.alerts.Frame.Windows.SidePanelAlert;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertTests extends TestBase {

    //click on link Alerts, Frame & Windows
    // click on Alerts
    @BeforeMethod
    public void preconditions() {
        new HomePage(driver).getAlertsFramesWindows();
        new SidePanelAlert(driver).clickOnAlertsLink();
    }
    @Test
    public void toSeeAlert() {
        //click on Click Button to see alert
        //click on OK
        //assert. There are no any text. So return true or false
        new AlertsPage(driver).clickOnAlertButton()
                .toSeeAlert()
                .verifySuccessResult();
    }
    @Test
    public void appearAlertLater() {
        //click on link On button click, alert will appear after 5 seconds
        //click on OK
        //assert. There are no any text. So return true or false
        new AlertsPage(driver).clickOnTheAppearButton()
                .toSeeAlert()
                .verifySuccessResult();
    }
    @Test
    public void confirmAlertTest() {
        //click on link On button click, confirm box will appear
        // select Ok || Cancel
        //assert text result Ok || Cancel
        new AlertsPage(driver).clickOnConfirmButton()
                .selectConfirm("cancel")
                .verifyResult("Cancel");
    }
    @Test
    public void endMessageToAlertTest() {
        //click on link On button click, prompt box will appear
        // enter 'Hello world'
        // click on OK
        //assert text result 'Hello world'
        new AlertsPage(driver).clickOnPromptButton()
                .enterMessageToAlert("I love QA")
                .toSeeAlert()
                .verifyResultPrompt("I love QA");
    }
}