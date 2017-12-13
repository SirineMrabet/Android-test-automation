package Steps;
import Base.BaseUtile;
import Pages.PageObjects;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


/**
 * Created by smrabet on 12/12/17.
 */
public class AddExpenses extends BaseUtile {
    private BaseUtile base;

    public AddExpenses(BaseUtile base) {
        this.base = base;
        this.driver=base.driver;
    }
    @Given("^I'm in the page adding expenses$")
    public void i_m_in_the_page_adding_expenses() throws Throwable {
        //******************* Wait until elements are visible ************
        PageObjects PO = new PageObjects(driver);
        Assert.assertTrue(PO.InputMoney.isDisplayed());


    }

    @When("^I add expense$")
    public void iAddExpense() throws Throwable {
        PageObjects PO = new PageObjects(driver);
        PO.Nume1.click();
        PO.Nume2.click();
        Assert.assertEquals(PO.InputMoney.getText(),"12");
    }

    @And("^I select a ([^\"]*)$")
    public void iSelectACategory(String Category) throws Throwable {
        PageObjects PO = new PageObjects(driver);
        if(Category.equals("Breakfast"))
            PO.BreakfastCategory.click();

        if(Category.equals("Lunch"))
            PO.LunchCategory.click();

        if(Category.equals("Dinner"))
            PO.DinnerCategory.click();

        

    }


    @Then ("^New ([^\"]*) is added in the specified ([^\"]*)$")
    public void ThenNewExpenseIsAddedInTheSpecifiedCategory(String Expense,String Category) throws Throwable {

    }
}
