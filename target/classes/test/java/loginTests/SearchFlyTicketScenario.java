package loginTests;

import org.junit.Test;
import parentTest.ParentTest;

public class SearchFlyTicketScenario extends ParentTest {

    @Test
    public void searchFlyTicket (){
        loginPage.userValidLogIn("qatestchannel@gmail.com","ytrewq");
        homePage.clickFrom();
        homePage.clickOnLinkKiev();
        homePage.clickTo();
        homePage.clickOnLinkTbilici();
        homePage.clickOnFieldDateFrom();
        homePage.selectDateFrom();
        homePage.clickOnFieldDateTo();
        homePage.selectDateTo();
        homePage.clickOnButtonSearch();







    }





}
