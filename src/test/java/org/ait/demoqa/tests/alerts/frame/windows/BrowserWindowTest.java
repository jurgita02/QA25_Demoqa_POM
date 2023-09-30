package org.ait.demoqa.tests.alerts.frame.windows;

import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.alerts.Frame.Windows.SidePanelAlert;
import org.ait.demoqa.pages.alerts.Frame.Windows.WindowPage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserWindowTest extends TestBase {
    //click on link Alerts, Frame & Windows
    //click on Browser Windows
    @BeforeMethod
    public void preconditions() {
new HomePage(driver).getAlertsFramesWindows();
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
    public void switchToNewWindowTest(){
    //click on New Window and switch to new Window
    //assert NewTab
    new WindowPage(driver).switchToNewWindow(1)
            .verifyNewWindowTitle("This is a sample page");
}
}
