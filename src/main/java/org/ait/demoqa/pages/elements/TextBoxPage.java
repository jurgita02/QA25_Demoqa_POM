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
        return this;
    }

    @FindBy(id="permanentAddress")
    WebElement permanentAddress;
    public TextBoxPage assertCopyPastText(String text) {
        // Gaukite tekstinę eilutę iš lauko "Current address" ir "Permanent Address"
        String currentAddressText = currentAddress.getAttribute("value");
        String permanentAddressText = permanentAddress.getAttribute("value");

        // Padalinkite gautą tekstą pagal naująją eilutę (jei tai atitinka jūsų duomenis)
        String[] currentAddressLines = currentAddressText.split("\n");
        String[] permanentAddressLines = permanentAddressText.split("\n");

        // Palyginkite atitinkamas eilutes su tikėjamu tekstu
        for (int i = 0; i < currentAddressLines.length; i++) {
            Assert.assertEquals(currentAddressLines[i], text);
            Assert.assertEquals(permanentAddressLines[i], text);
        }
        return this;
    }
}
