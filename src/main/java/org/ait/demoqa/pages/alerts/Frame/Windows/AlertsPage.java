package org.ait.demoqa.pages.alerts.Frame.Windows;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class AlertsPage extends BasePage {

    public AlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//button[@id='alertButton']")
    WebElement toSeeAlert;
    public AlertsPage clickOnAlertButton() {
click(toSeeAlert);
        return this;
    }

    public AlertsPage toSeeAlert() {
        try{
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(7));
            wait.until(ExpectedConditions.alertIsPresent()).accept();
        }catch(NoAlertPresentException ex) {
        }
        return this;
    }

    public boolean verifySuccessResult() {
        try {
            Alert alert = driver.switchTo().alert();
            if (alert != null) {
                return true;
            }
        } catch (NoAlertPresentException e) {
        }
        return false;
    }
    @FindBy(xpath="//*[@id='confirmResult']")
    WebElement result;
    public AlertsPage verifyResult(String message) {
        Assert.assertTrue(shouldHaveText(result,message,5));
        return this;
    }
@FindBy(xpath="//*[@id='confirmButton']")
WebElement confirmButton;
    public AlertsPage clickOnConfirmButton() {
        click(confirmButton);
        return this;
    }

    public AlertsPage selectConfirm(String confirm) {
        if (confirm !=null &&confirm.equalsIgnoreCase("ok")){
            driver.switchTo().alert().accept();
        }else if( confirm !=null && confirm.equalsIgnoreCase("cancel")){
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(xpath=("//*[@id='promtButton']"))
    WebElement promptButton;

    public AlertsPage clickOnPromptButton() {
        click(promptButton);
        return this;
    }
    public AlertsPage enterMessageToAlert(String message) {
        if(message !=null){
            driver.switchTo().alert().sendKeys(message);
        }
        return this;
    }
    @FindBy(xpath="//*[@id='promptResult']")
    WebElement resultPrompt;
    public AlertsPage verifyResultPrompt(String message) {
        Assert.assertTrue(shouldHaveText(resultPrompt,message,5));
        return this;
    }

    @FindBy(xpath="//button[@id='timerAlertButton']")
    WebElement timerAlert;

    public AlertsPage clickOnTheAppearButton() {
click(timerAlert);
        return this;
    }


@FindBy(xpath="//span[.='Frames']")
WebElement frames;
    public FramePage selectFrame() {
        clickWithJSExecutor(frames,0,300);
        return new FramePage(driver);
    }
    @FindBy(xpath="//span[.='Nested Frames']")
    WebElement nestedFrames;
    public NestedFramesPage selectNestedFrames() {
        clickWithJSExecutor(nestedFrames,0,300);
        return new NestedFramesPage(driver);
    }
}
