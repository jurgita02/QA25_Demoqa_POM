package org.ait.demoqa.pages;

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

    @FindBy(xpath = "//button[@id='tabButton']")
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
@FindBy(xpath="//button[@id='messageWindowButton']")
WebElement windowNewMessage;
    public WindowPage switchToNewWindowMessage(int index) {
       click(windowNewMessage);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(index));
        return this;
    }
    @FindBy(xpath="//body")
    WebElement titleMessage;
    public WindowPage verifyNewWindowMessageTitle(String text) {
        Assert.assertTrue(isTextPresent(titleMessage,text));
        return this;
    }
}
