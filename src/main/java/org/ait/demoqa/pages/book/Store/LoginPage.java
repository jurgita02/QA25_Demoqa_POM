package org.ait.demoqa.pages.book.Store;

import org.ait.demoqa.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userNameField;

    @FindBy(id = "password")
    WebElement passwordField;

    @FindBy(id = "login")
    WebElement loginButton;


    public ProfilePage login(String userName, String password) {
        type(userNameField, userName);
        type(passwordField, password);
        click(loginButton);
        return new ProfilePage(driver);
    }


//sitas metodas rasomas, kaip vz pilna reklamu ant psl, ir neina Selenium paspausti knopkiu
    //yra ten reklamu. Selenium kaip naudotojas yra, ir per issokancias reklamas negali ivest
    //pas mane nera reklamu, del to as tik komentinu

    public LoginPage loginNegative(String userName, String password) {
        typeWithJSExecutor(userNameField, userName, 0, 200);
        type(passwordField, password);
        click(loginButton);
        return this;
    }

}
