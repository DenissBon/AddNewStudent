package StepDefinitions;

import FunctionLibrary.CommonFunctions;
import PageObjects.AddNewStudentPage;
import PageObjects.DashboardPage;
import PageObjects.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.annotation.Nullable;

public class TimeSlotSteps extends CommonFunctions {

    LoginPage loginPage = new LoginPage(driver);
    DashboardPage dashboardPage = new DashboardPage(driver);
    AddNewStudentPage addNewStudentPage = new AddNewStudentPage(driver);

    @Given("^I'm on LoginPage \"(.*?)\"$")
    public void i_m_on_LoginPage(String url)  {

        driver.get(url);

    }

    @When("^I enter Email \"(.*?)\"$")
    public void i_enter_Email(String arg1) throws InterruptedException {
        Thread.sleep(500);
        loginPage.enterLogin();

    }

    @When("^I enter Password \"(.*?)\"$")
    public void i_enter_Password(String arg1) {
        loginPage.enterPassword();

    }

    @When("^I click Login button$")
    public void i_click_Login_button() {
        loginPage.LoginBtnClick();

    }

    @When("^I click on Students$")
    public void i_click_on_Students() {
        dashboardPage.StudentsBtnClick();


    }

    @When("^I click Add New Student$")
    public void i_click_Add_New_Student() {
        dashboardPage.AddNewStudentBtnClick();

    }

    @When("^I click on \\+ button$")
    public void i_click_on_button() {
        addNewStudentPage.AddNewTimeSlotBtn.click();


    }

    @Then("^I should see Time Slot being added$")
    public void i_should_see_Time_Slot_being_added() throws InterruptedException {


        Thread.sleep(500);
        Assert.assertTrue(addNewStudentPage.DeleteTimeSlotBtn.isDisplayed());

    }

    @When("^I click on bin sign$")
    public void i_click_on_bin_sign() throws InterruptedException {
        Thread.sleep(500);
        addNewStudentPage.DeleteTimeSlotBtnClick();

    }

    @Then("^I should see Time Slot being removed$")
    public void i_should_see_Time_Slot_being_removed() throws InterruptedException {

        Thread.sleep(1000);
        Assert.assertFalse(addNewStudentPage.DeleteTimeSlotBtn.isDisplayed());
        //Assert.assertEquals(0, addNewStudentPage.NewSlot);
        //Assert.assertNull(addNewStudentPage.NewSlot);

    }

}
