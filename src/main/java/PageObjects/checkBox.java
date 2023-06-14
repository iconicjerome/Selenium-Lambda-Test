package PageObjects;
import Utils.Globals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class checkBox extends Globals {

    WebDriver driver;
    public checkBox(WebDriver driver){

        this.driver = driver;
    }
    public checkBox() {

        super();
    }

    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div[1]/div[1]/ul/li[2]/a")
    public By checkBoxDemo;
    @FindBy(xpath = "//*[@id=\"isAgeSelected\"]")
    public By singleBox;
    @FindBy (xpath = "//*[@id=\"ex1-check1\"]")
    public WebElement option1;
    @FindBy (xpath = "//*[@id=\"ex1-check2\"]")
    public WebElement option2;
    @FindBy(xpath = "//*[@id=\"ex1-check3\"]")
    public WebElement option3;
    @FindBy(xpath = "//*[@id=\"ex1-check3\"]")
    public WebElement option4;
    @FindBy(xpath = "//*[@id=\"box\"]")
    public WebElement checkAll;

}
