package org.ait.demoqa.pages.alerts.Frame.Windows;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class WindowPage extends BasePage {

    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "tabButton")
    WebElement tabButton;

    public WindowPage switchToNewTab(int index) {
        click(tabButton);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }
@FindBy(tagName="h1")
WebElement title;
    public WindowPage verifyNewTabTitle(String text) {
        Assert.assertTrue(isTextPresent(title,text));
        return this;
    }

    @FindBy(css = "#windowButton")
    WebElement newWindowButton;
    public WindowPage switchToNewWindow(int index) {
        click(newWindowButton);
        List<String> windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(index));
        return this;
    }
    @FindBy(tagName = "h1")
    WebElement titleWindow;
    public WindowPage verifyNewWindowTitle(String text) {
        Assert.assertTrue(isTextPresent(titleWindow, text));
        return this;
    }
}
