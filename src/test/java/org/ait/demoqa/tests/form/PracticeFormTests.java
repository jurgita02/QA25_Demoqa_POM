package org.ait.demoqa.tests.form;

import org.ait.demoqa.data.StudentData;
import org.ait.demoqa.pages.HomePage;
import org.ait.demoqa.pages.SidePanel;
import org.ait.demoqa.pages.forms.PracticeFormPage;
import org.ait.demoqa.tests.TestBase;
import org.ait.demoqa.utils.DataProviders;
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
       // .enterDate(StudentData.DATE)
        //select subjects
                //cia yra antrasis variantas DATE , kada pasirenkame data patys, nurodydami diena, metus, men
           .selectDate("May","2001","15")
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
        .submit()
         .assertSubmit("Thanks for submitting the form");
    }

    @Test(dataProviderClass = DataProviders.class,dataProvider = "studentDataFromCSVFile")
    public void fillStudentFormUsingDataProviderTest(String name, String lastname, String email,
                                                     String phone,String dateOfBirth,
                                                     String path, String address) {

        new PracticeFormPage(driver).enterPersonalData(name,lastname,email,phone)
                .selectGender(StudentData.GENDER)
                .enterDate(dateOfBirth)
                .selectSubjects(StudentData.SUBJECTS)
                .selectHobbies(StudentData.HOBBIES)
                .uploadFile(path)
                .enterAddress(address)
                .selectState(StudentData.STATE)
                .selectCity(StudentData.CITY)
                .submit()
                .assertSubmit("Thanks for submitting the form");
    }
}
