package pageObject;

import base.baseMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class buttonPage extends baseMethods
{
    WebDriver driver;
    WebDriverWait wait;

    //Page Object Creation

    @FindBy(xpath = "//span[text()='Buttons']")
    WebElement btn_button;

    @FindBy(id = "doubleClickBtn")
    WebElement btn_doubleClick;

    @FindBy(id = "rightClickBtn")
    WebElement btn_rightClick;

    //Constructor to initialise  the driver
    public buttonPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void clickButtonOption()  {

        this.btn_button.click();
    }

    //Method to click
    public void clickButtons()
    {


        Actions actions = new Actions(driver);
        actions.moveToElement(btn_doubleClick).doubleClick();
        actions.moveToElement(btn_rightClick).contextClick();

    }

    @Override
    public boolean isAt()
    {
        wait =new WebDriverWait(this.driver,15);
        return this.wait.until((d)->this.btn_doubleClick.isDisplayed());
    }
}
