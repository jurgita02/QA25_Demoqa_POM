package org.ait.demoqa.pages.elements;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.security.Key;

public class TextBoxPage extends BasePage {

    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="currentAddress")
    WebElement currentAddress;
    @FindBy(id = "submit")
    WebElement submit;

    public TextBoxPage keyBoardEvent(String text) {
typeWithJSExecutor(currentAddress,text,0,100);
        Actions actions=new Actions(driver);
        //select current address
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        //copy current address
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        //press TAB Kye to switch focus to permanent address
        actions.sendKeys(Keys.TAB).perform();
        //past current address in permanent address field
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        clickWithJSExecutor(submit, 0, 500);
        return this;
    }
//cia buvo mano metodas namu darbu lyginimui
  //  @FindBy(id="permanentAddress")
  //  WebElement permanentAddress;

   // @FindBy(id = "submit")
 //   WebElement submitButton;
   // public TextBoxPage assertCopyPastText(String text) {
     //   submitButton.click();
      //  String permanentAddressText = permanentAddress.getAttribute("value");
     //   Assert.assertEquals( permanentAddressText, text);
     //   return this;
  //  }
   //++ click Submit

    @FindBy(css = ".border > #currentAddress")
    WebElement currentAddressResult;

    @FindBy(css = ".border > #permanentAddress")
    WebElement permanentAddressResult;

    public TextBoxPage assertCopyPastText() {
        String[] current =  currentAddressResult.getText().split(":");
        String[] permanent =  permanentAddressResult.getText().split(":");

        Assert.assertEquals(permanent[1],current[1]);
        return this;
    }

}
