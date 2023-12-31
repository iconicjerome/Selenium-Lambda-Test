package Utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Globals {
    WebDriver driver;
    @BeforeMethod
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.lambdatest.com/selenium-playground/");
    }
    public WebElement findElement(By locator){

        return driver.findElement(locator);
    }

    public void clickElement(By locator){

        findElement(locator).click();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(6000);
        driver.quit();
    }
}
