package org.ait.demoqa.tests.book.Store;

import org.ait.demoqa.data.UserData;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.pages.book.Store.BookStorePage;
import org.ait.demoqa.pages.book.Store.LoginPage;
import org.ait.demoqa.pages.book.Store.ProfilePage;
import org.ait.demoqa.pages.elements.LinksPage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddBookToCollectionTests extends TestBase {

    @BeforeMethod
    public void precondition(){
        //click on BookStore application
        new HomePage(driver).getBookStore();
        //click ont eh Login Button
        new BookStorePage(driver).clickOnLoginButton();
        //login
        new LoginPage(driver).login(UserData.USER_NAME,UserData.USER_PASSWORD);

    }
    @Test
    public void  addBookToCollectionTest(){
        //enter book name
        //click on the book name
        //click on Add to your collection button and accept alert
        //click on the profile
        //verify the book is added Assert
        new BookStorePage(driver).enterBookName(UserData.BOOK_NAME)
                .clickOnBookName()
                .addToCollection();
              new SidePanel(driver).selectProfile();
              new BookStorePage(driver).verifyBookName(UserData.BOOK_NAME);

    }
    @AfterMethod
    public void deleteBookFromCollection(){
        new ProfilePage(driver).deleteBook();
    }

}
