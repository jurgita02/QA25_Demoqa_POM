package org.ait.demoqa.tests.alerts.frame.windows;

import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.alerts.Frame.Windows.AlertsPage;
import org.ait.demoqa.pages.alerts.Frame.Windows.FramePage;
import org.ait.demoqa.pages.alerts.Frame.Windows.NestedFramesPage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IframesTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getAlertsFramesWindows();
    }

    @Test
    public void iframesTest(){
        new AlertsPage(driver).selectFrame();
        new FramePage(driver).returnListOfFrames().switchToIframeByIndex(2);
    }

    @Test
    public void switchToIframeByIdTest(){
        new AlertsPage(driver).selectFrame();
        new FramePage(driver).switchToIframeById();
    }
    @Test
    public void handleNestedIframeTest(){
        new AlertsPage(driver).selectNestedFrames();
        new NestedFramesPage(driver).handleNestedIframes();
    }
}
