package pageObjects;

import io.cucumber.java.bs.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ButtonPage
{
    WebDriver driver;

    //Page Objects Creation
    @FindBy(xpath = "//span[text()='Buttons']")
    WebElement btn_Buttons;

    @FindBy(id = "doubleClickBtn")
    WebElement btn_doubleClick;

    @FindBy(id = "rightClickBtn")
    WebElement btn_rightClick;

    //Constructor to Initialize the driver
    public ButtonPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickingButtons() throws InterruptedException {

        Thread.sleep(3000);
        this.btn_Buttons.click();

        Thread.sleep(3000);

        Actions actions = new Actions(driver);
        actions.moveToElement(this.btn_doubleClick).doubleClick();

        actions.moveToElement(this.btn_rightClick).contextClick();
    }

}
