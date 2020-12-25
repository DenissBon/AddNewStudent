package StepDefinitions;

import FunctionLibrary.CommonFunctions;
import PageObjects.AddNewStudentPage;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import Utils.Constants;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class RelationFieldSteps extends CommonFunctions {

    AddNewStudentPage addNewStudentPage = new AddNewStudentPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);
    LoginPage loginPage = new LoginPage(driver);



    @When("^I click on Relation$")
    public void i_click_on_Relation() {
    addNewStudentPage.RelationFieldClick();

    }

    @When("^I enter valid data \"(.*?)\"$")
    public void i_enter_valid_data(String arg1) {

      addNewStudentPage.EnterValidRelation();

    }

    @When("^I enter invalid data \"(.*?)\"$")
    public void i_enter_invalid_data(String arg1) {

        addNewStudentPage.EnterInvalidRelation();

    }
    @When("^I click Enter$")
    public void i_click_Enter() {
     addNewStudentPage.RelationEntryField.sendKeys(Keys.ENTER);
    }

    @Then("^I should see data being added$")
    public void i_should_see_data_being_added() {

        Assert.assertEquals( Constants.ValidRelationData, addNewStudentPage.RelationField.getText());
    }

    @Then("^I should see a warning message$")
    public void i_should_see_a_warning_message() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(addNewStudentPage.InvalidRelationMsg.isDisplayed());


    }
}
