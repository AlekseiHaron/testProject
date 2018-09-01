package loginTests;

import org.junit.Test;
import parentTest.ParentTest;

public class LoginTest extends ParentTest {

    @Test
    public void validLogin (){

        loginPage.openPage();
        loginPage.enterLogin("qatestchannel@gmail.com");
        loginPage.enterPass("ytrewq");
        loginPage.clickOnSubmitButton();
        checkAC("Button is present", loginPage.isButtonPresent(),false); //try add button verification
    }




}
