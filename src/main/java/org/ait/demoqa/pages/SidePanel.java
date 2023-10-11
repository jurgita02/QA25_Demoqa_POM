package org.ait.demoqa.pages;

import org.ait.demoqa.pages.book.Store.BookStorePage;
import org.ait.demoqa.pages.book.Store.LoginPage;
import org.ait.demoqa.pages.book.Store.ProfilePage;
import org.ait.demoqa.pages.elements.BrokenLinksImagesPage;
import org.ait.demoqa.pages.elements.ButtonsPage;
import org.ait.demoqa.pages.elements.LinksPage;
import org.ait.demoqa.pages.elements.TextBoxPage;
import org.ait.demoqa.pages.forms.PracticeFormPage;
import org.ait.demoqa.pages.interactions.DroppablePage;
import org.ait.demoqa.pages.widgets.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SidePanel extends BasePage {

    public SidePanel (WebDriver driver){
        super(driver);

    }
@FindBy(css=".show #item-0")
    WebElement login;
    public LoginPage selectLogin() {
        clickWithJSExecutor(login, 0,600);
        return new LoginPage(driver);
    }
@FindBy(xpath="//span[.='Profile']")
WebElement profile;
    public ProfilePage selectProfile() {
        clickWithJSExecutor(profile,0,600);
        return new ProfilePage(driver);
    }
    @FindBy(xpath = "//span[.='Links']")
    WebElement links;
    public LinksPage selectLinks() {
        clickWithJSExecutor(links,0,300);
        return new LinksPage(driver);
    }
    @FindBy(xpath = "//span[.='Broken Links - Images']")
    WebElement brokenLinksImages;
    public BrokenLinksImagesPage selectBrokenLinksImages() {
        clickWithJSExecutor(brokenLinksImages, 0,300);
        return new BrokenLinksImagesPage(driver);
    }
    @FindBy(xpath = "//span[.='Buttons']")
    WebElement buttons;
    public ButtonsPage selectButtons() {
        clickWithJSExecutor(buttons,0,300);
        return new ButtonsPage(driver);
    }
    @FindBy(xpath = "//span[.='Auto Complete']")
    WebElement autoComplete;
    public AutoCompletePage selectAutoComplete() {
        clickWithJSExecutor(autoComplete,0,400);
        return new AutoCompletePage(driver);
    }

    @FindBy(xpath = "//span[.='Slider']")
    WebElement slider;

    public SliderPage selectSlider() {
        clickWithJSExecutor(slider,0,400);
        return new SliderPage(driver);
    }
    @FindBy(xpath = "//span[.='Menu']")
    WebElement menu;

    public MenuPage selectMenu() {
        clickWithJSExecutor(menu,0,600);
        return new MenuPage(driver);
    }

    @FindBy(xpath = "//span[.='Select Menu']")
    WebElement selectMenu;
    public SelectMenuPage selectSelectMenu() {
        clickWithJSExecutor(selectMenu,0,600);
        return new SelectMenuPage(driver);
    }


    @FindBy(xpath = "//span[.='Practice Form']")
    WebElement practiceForm;
    public PracticeFormPage selectPracticeForm() {
        clickWithJSExecutor(practiceForm,0,300);
        return new PracticeFormPage(driver);
    }

    @FindBy(xpath = "//span[.='Tool Tips']")
    WebElement toolTips;
    public ToolTipsPage selectToolTips() {
        clickWithJSExecutor(toolTips,0,400);
        return new ToolTipsPage(driver);
    }

    @FindBy(xpath = "//span[.='Droppable']")
    WebElement droppable;
    public DroppablePage selectDroppable() {
        clickWithJSExecutor(droppable,0,600);
        return new DroppablePage(driver);
    }
    @FindBy(xpath = "//span[.='Text Box']")
    WebElement textBox;
    public TextBoxPage selectTextBox() {
        click(textBox);
        return new TextBoxPage(driver);
    }
}
