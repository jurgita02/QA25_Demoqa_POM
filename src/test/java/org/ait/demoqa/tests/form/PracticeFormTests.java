package org.ait.demoqa.tests.form;

import org.ait.demoqa.data.StudentData;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.pages.forms.PracticeFormPage;
import org.ait.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeFormTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getForms();
        new SidePanel(driver).selectPracticeForm().hideIframes();
    }

    @Test
    public void fillStudentFormTest() {
        //enter personal data: name, surname, email,phone no
        new PracticeFormPage(driver).enterPersonalData(StudentData.FIRST_NAME, StudentData.LAST_NAME,
                StudentData.EMAIL, StudentData.PHONE_NUMBER)
        //select gender
                .selectGender(StudentData.GENDER)
        //enter Date of Birth
        .enterDate(StudentData.DATE)
        //select subjects
        .selectSubjects(StudentData.SUBJECTS)
        //select hobbies
        .selectHobbies(StudentData.HOBBIES)
        //upload  file
        .uploadFile(StudentData.PHOTO_PATH)
        //enter address
        .enterAddress(StudentData.ADDRESS)
        //select state
        .selectState(StudentData.STATE)
        //select city
        .selectCity(StudentData.CITY)
        //click on Submit
        .submit();
    }
}
