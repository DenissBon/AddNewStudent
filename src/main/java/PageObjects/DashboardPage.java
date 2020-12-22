package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    public DashboardPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@class='metismenu-icon pe-7s-users']")
    public WebElement StudentsBtn;


    @FindBy(xpath = "//*[@class='mm-students-entry']")
    public WebElement AddNewStudentBtn;

    public void StudentsBtnClick()
    {
        StudentsBtn.click();
    }

    public void AddNewStudentBtnClick()
    {
        AddNewStudentBtn.click();
    }



}
