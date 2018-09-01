package loginTests;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import parentTest.ParentTest;
import java.util.Arrays;
import java.util.Collection;



@RunWith(Parameterized.class)
public class UnvalidLoginWithParams extends ParentTest {

    String login , pass;


    public UnvalidLoginWithParams(String login, String pass) {
        this.login = login;
        this.pass = pass;
    }

    @Parameterized.Parameters (name = "Parameters are {0} and {1}")
    public static Collection testData (){
        return Arrays.asList(new Object[][] {
                {"Login", "ytrewq"},
                {"qatestchannel@gmail.com", "qwerty"}
        });
    }

    @Test

    public void invalidLoginWithParams () {

        loginPage.openPage();
        loginPage.enterLogin(login);
        loginPage.enterPass(pass);
        loginPage.clickOnSubmitButton();

        checkAC("Button is present", loginPage.isButtonPresent(),true);



    }
}
