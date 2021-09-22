package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class driverFactory
{

    //Creating driver  map
    private static final Map<driverType,Supplier<WebDriver>> driverMap = new HashMap<>();

    //Chrome driver Supplier
    public static final Supplier<WebDriver> chromeDriverSupplier = ()->
    {
        System.setProperty("webdriver.chrome.driver" ,"src/main/resources/drivers/chromedriver");
        return new ChromeDriver();
    };

    //Firefox driver Supplier
    public static final Supplier<WebDriver> firefoxDriverSupplier = ()->
    {
        System.setProperty("webdriver.gecko.driver" ,"src/main/resources/drivers/geckodriver");
        return new FirefoxDriver();
    };

    //Adding all drivers in to the  map
    static
    {
        driverMap.put(driverType.CHROME,chromeDriverSupplier);
        driverMap.put(driverType.FIREFOX,firefoxDriverSupplier);
    }

    //Method to get driver
    public static final WebDriver getDriver(driverType type)
    {
        return driverMap.get(type).get();
    }

}
