package PageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddNewStudentPage {

    public AddNewStudentPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@class='fas fa-plus']")
    public WebElement AddNewTimeSlotBtn;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/button[1]/i[1]")
    public WebElement DeleteTimeSlotBtn;

    @FindBy(xpath = "//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/span[1]/span[1]/span[1]")
    public WebElement NewSlot;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement EmailField;

    @FindBy(xpath = "//button[contains(text(),'Create Student')]")
    public WebElement CreateStudentBtn;

    @FindBy(xpath = "//em[@id='email-error']")
    public WebElement InvalidEmailMsg;


    @FindBy(css = "#select2-relation-container")
    public WebElement RelationField;

    @FindBy(xpath = "//body/span[1]/span[1]/span[1]/input[1]")
    public WebElement RelationEntryField;

    @FindBy(css = "#relation-error")
    public WebElement InvalidRelationMsg;



    public void AddTimeSlotBtnClick()
    {
        AddNewTimeSlotBtn.click();
    }

    public void DeleteTimeSlotBtnClick()
    {
        DeleteTimeSlotBtn.click();
    }


    public void SlotIsAdded()
    {
        Assert.assertTrue(NewSlot.isDisplayed());
    }

    public void SlotIsRemoved()
    {
        Assert.assertEquals(0, NewSlot);
        //Assert.assertFalse(NewSlot.isDisplayed());
        //Assert.assertNull(NewSlot);
        //None of the methods work
    }


    public void EnterValidEmail()
    {
        EmailField.sendKeys("Georgecane@gmail.com");
    }

    public void EnterInvalidEmail()
    {
        EmailField.sendKeys("Georgecanegmail.com");
    }

    public void CreateStudentBtnClick()
    {
        CreateStudentBtn.click();
    }

    public void RelationFieldClick()
    {
        RelationField.click();
    }

    public void EnterValidRelation()
    {
        RelationEntryField.sendKeys("Brother");
    }
    public void EnterInvalidRelation()
    {
    RelationEntryField.sendKeys("123456789");
    }



}
