package org.ait.demoqa.tests.book.Store;

import org.ait.demoqa.pages.book.Store.BookStorePage;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchBookTests extends TestBase {
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getBookStore();
    }

    @Test
    public void searchBookTest(){
        new BookStorePage(driver)
                .enterBookName("Git")
                .verifyBookName("Git");
    }
}
