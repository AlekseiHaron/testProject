package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends  ParentPage {

    @FindBy (xpath = ".//*[@id='base_direction']/div[1]/div/div[1]/div/a[@data-code='IEV']")
    private WebElement linkKiev;

    @FindBy(xpath = ".//*[@id='base_direction']/div[1]/div/div[2]/div/a[@data-code='TBS']")
    private WebElement linkTbilici;

    @FindBy (xpath = ".//table[@class='ui-datepicker-calendar']//tr[5]//td[7][@data-year='2018' and @data-month='8']/a")
    private WebElement dateFrom;

     @FindBy (xpath = ".//table[@class='ui-datepicker-calendar']//tr[5]//td[3][@data-year='2018' and @data-month='9']/a")
     private WebElement dateTo;

     @FindBy (xpath = ".//*[@type='submit' and @value='Поиск']")
     private WebElement buttonSearch;

     @FindBy (id = "departure_date")
     private WebElement fieldDateFrom;

    @FindBy (id = "departure_date_1")
    private WebElement fieldDateTo;

    @FindBy (id = "from_name")
    private WebElement fromName;

    @FindBy (id = "to_name")
    private WebElement toName;







    public HomePage(WebDriver webDriver) {
        super(webDriver, "/");
    }

    public void openHomePage () {
        try {
            webDriver.get(baseUrl);
            checkCurrentUrl();
            logger.info("Login Page was opened");
        } catch (Exception e){
            logger.error("Can't open LoginPage");
            Assert.fail("Can't open LoginPage");

        }
    }


    public void clickOnLinkKiev() {
        actionsWithOurElements.clickOnElement(linkKiev);
    }


    public void clickOnLinkTbilici() {
        actionsWithOurElements.clickOnElement(linkTbilici);
    }

    public void selectDateFrom() {
        actionsWithOurElements.clickOnElement(dateFrom);
    }

    public void selectDateTo() {
        actionsWithOurElements.clickOnElement(dateTo);
    }

    public void clickOnButtonSearch() {
        actionsWithOurElements.clickOnElement(buttonSearch);
    }

    public void clickOnFieldDateFrom() {
        actionsWithOurElements.clickOnElement(fieldDateFrom);
    }

    public void clickOnFieldDateTo() {
        actionsWithOurElements.clickOnElement(fieldDateTo);
    }

    public void clickFrom() {
        try {
            actionsWithOurElements.clickOnElement(fromName);
        } catch (NullPointerException e) {
            throw new IllegalStateException("A form has a null property", e);
        }
    }
    public void clickTo() {
        actionsWithOurElements.clickOnElement(toName);
    }
}



