package PageObjects;
import Utils.Globals;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkBox  {

    WebDriver driver;
    public checkBox(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public checkBox() {

        super();
    }
//public checkBox(WebDriver driver){
//
//    PageFactory.initElements(driver, this);
//}

//    @FindBy(xpath = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div/ul/li[2]/a")
//    public By checkBoxDemo;

    public String checkBoxDemo = "//*[@id=\"__next\"]/div/section[2]/div/div/div/div/ul/li[2]/a";
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
