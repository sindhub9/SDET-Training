package pageObject;

import base.baseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class textBoxPage extends baseMethods
{
    WebDriver driver;
    WebDriverWait wait;

    //Page Object Creation

    @FindBy(xpath="//span[text()='Text Box']")
    WebElement btn_textbox;

    @FindBy(id="userName")
    WebElement txt_userName;

    @FindBy(id="userEmail")
    WebElement txt_userEmail;

    @FindBy(id="currentAddress")
    WebElement txt_currentAddress;

    @FindBy(id="permanentAddress")
    WebElement txt_permanentAddress;

    @FindBy(id="submit")
    WebElement btn_submit;

    //Constructor to initialize  the driver
    public  textBoxPage(WebDriver  driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickTextButton()
    {
        this.btn_textbox.click();
    }

    //Method to enter the details
    public void enterDetails(String email)
    {
        //click the text box

        this.txt_userName.sendKeys("name");
        this.txt_userEmail.sendKeys(email);
        this.txt_currentAddress.sendKeys("address");
        this.txt_permanentAddress.sendKeys("permanent");

        this.btn_submit.click();


    }

    @Override
    public boolean isAt()
    {
        wait =new WebDriverWait(this.driver,15);
        return this.wait.until((d)->this.txt_userName.isDisplayed());
    }

}
