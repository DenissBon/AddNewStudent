package StepDefinitions;

import FunctionLibrary.CommonFunctions;
import PageObjects.AddNewStudentPage;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import Utils.Constants;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class EmailSteps extends CommonFunctions {

    LoginPage loginPage = new LoginPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);
    AddNewStudentPage addNewStudentPage = new AddNewStudentPage(driver);

    @When("^I type in valid email address \"(.*?)\"$")
    public void i_type_in_valid_email_address(String arg1)
    {
    addNewStudentPage.EnterValidEmail();
    }

    @When("^I click Create Student$")
    public void i_click_Create_Student()
    {
    addNewStudentPage.CreateStudentBtnClick();
    }

    @Then("^Email should be added$")
    public void email_should_be_added()
    {
        Assert.assertEquals(Constants.Green_Outlining, addNewStudentPage.EmailField.getCssValue("border-color"));
    }

    @When("^I type in invalid email address \"(.*?)\"$")
    public void i_type_in_invalid_email_address(String arg1)
    {
    addNewStudentPage.EnterInvalidEmail();
    }

    @Then("^Should receive a warning message$")
    public void should_receive_a_warning_message()
    {
    Assert.assertTrue(addNewStudentPage.InvalidEmailMsg.isDisplayed());
    }
}
