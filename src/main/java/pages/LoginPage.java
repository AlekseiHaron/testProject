package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends ParentPage {

    HomePage homePage;


    @FindBy(id = "email_login")  //name = "user[email]"
    private WebElement userNameInput;

    @FindBy(id = "pass_login")
    private WebElement passwordInput;

    @FindBy(xpath = ".//input[@value='Вход на сайт' and @data-uil='login']")
    private WebElement sumbitButton;


    public LoginPage(WebDriver webDriver) {
        super(webDriver, "/");
        homePage = new HomePage(webDriver);
    }


    public void openPage () {
        try {
            webDriver.get(baseUrl + "/login_page");
            //checkCurrentUrl();
            logger.info("Login Page was opened");
        } catch (Exception e){
            logger.error("Can't open LoginPage");
            Assert.fail("Can't open LoginPage");

        }
    }

    public boolean isLoginPageDisplayed (){
        try {
            webDriver.get(baseUrl + "/");
            checkCurrentUrl();
            return true;
        } catch (Exception e) {
            return false;

        }

    }

    public void enterLogin (String login) {
        actionsWithOurElements.enterTextToElement(userNameInput, login);
    }


    public void enterPass (String pass) {
        actionsWithOurElements.enterTextToElement(passwordInput, pass);
    }

    public void clickOnSubmitButton (){
        actionsWithOurElements.clickOnElement(sumbitButton);
    }

    public boolean isButtonPresent (){
        try {
            WebDriverWait webDriverWait5 = new WebDriverWait (webDriver,5);
            webDriverWait5.until(ExpectedConditions.elementToBeClickable(webDriver.findElement(By.xpath(".//input[@value='Вход на сайт' and @data-uil='login']"))));
            return webDriver.findElement(By.xpath(".//input[@value='Вход на сайт' and @data-uil='login']")).isDisplayed();

        }catch (Exception e){
            return false;
        }

    }


    public void userValidLogIn(String login, String passWord) {
        openPage();
        enterLogin(login);
        enterPass(passWord);
        clickOnSubmitButton();
    }
}
