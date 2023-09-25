package org.ait.demoqa.tests;

import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanelAlert;
import org.ait.demoqa.pages.WindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowTest extends TestBase {
    //click on link Alerts, Frame & Windows
    //click on Browser Windows
    @BeforeMethod
    public void preconditions() {
new HomePage(driver).getAlerts();
        new SidePanelAlert(driver).clickOnBrowserWindowLink();
    }
    @Test
    public void switchToNewTabTest(){
        //click on New Tab and switch to new tab
        //assert NewTab
        new WindowPage(driver).switchToNewTab(1)
                .verifyNewTabTitle("This is a sample page");

    }

@Test
    public void switchToNewWindowMessage(){
    //click on New Window Message and switch to new Window Message
    //assert NewTab
    new WindowPage(driver).switchToNewWindowMessage(1)
            .verifyNewWindowMessageTitle("Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.");

}

}
