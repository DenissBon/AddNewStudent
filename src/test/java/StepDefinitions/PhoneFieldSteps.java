package StepDefinitions;

import FunctionLibrary.CommonFunctions;
import PageObjects.AddNewStudentPage;
import Utils.Constants;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class PhoneFieldSteps extends CommonFunctions {

    AddNewStudentPage addNewStudentPage = new AddNewStudentPage(driver);


    @When("^I click inside Phone field$")
    public void i_click_inside_Phone_field() {
    addNewStudentPage.PhoneFieldClick();
    }

    @When("^I enter valid Phone Field data \"(.*?)\"$")
    public void i_enter_valid_Phone_Field_data(String ValidPhoneNumber) {
    addNewStudentPage.PhoneField.sendKeys(ValidPhoneNumber);
    }
    @When("^when data being added I click Enter$")
    public void when_data_being_added_I_click_Enter() {
        addNewStudentPage.PhoneFieldEnter();
    }


    @Then("^I should see Phone Field data being added$")
    public void i_should_see_Phone_Field_data_being_added() {

        Assert.assertEquals(Constants.Green_Outlining, addNewStudentPage.PhoneField.getCssValue("border-color"));

    }

    @When("^I enter invalid Phone Field data \"(.*?)\"$")
    public void i_enter_invalid_Phone_Field_data(String InvalidPhoneData) {

        addNewStudentPage.PhoneField.sendKeys(InvalidPhoneData);

    }

    @Then("^I should see a Phone Field warning message$")
    public void i_should_see_a_Phone_Field_warning_message() {

    Assert.assertTrue(addNewStudentPage.InvalidPhoneMsg.isDisplayed());

}

}