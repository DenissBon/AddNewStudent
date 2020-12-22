package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='identity']")
    public WebElement LoginField;


    @FindBy(xpath = "//input[@id='password']")
    public WebElement PasswordField;


    @FindBy(xpath = "//*[@class='btn btn-primary btn-lg']")
    public WebElement LoginBtn;

    public void enterLogin()
    {
        LoginField.sendKeys("admin@coaching.com");
    }

    public void enterPassword()
    {
PasswordField.sendKeys("22091671");
    }

    public void LoginBtnClick()
    {
LoginBtn.click();
    }


}
