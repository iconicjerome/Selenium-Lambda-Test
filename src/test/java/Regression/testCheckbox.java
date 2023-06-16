package Regression;

import PageObjects.checkBox;
import Utils.Globals;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testCheckbox extends Globals{
//    WebDriver driver;
    Globals  globals;
    checkBox getCheckbox;

    @Test(priority = 0)
    public void testSingleCheckbox(){
        globals = new Globals(driver);
        getCheckbox = new checkBox(globals.driver);

        try{
            globals.clickElement2(getCheckbox.checkBoxDemo);
        }
        catch (NullPointerException e){
            System.out.println(e);
            System.out.println(getCheckbox.checkBoxDemo);
        }

//        globals.clickElement(getCheckbox.checkBoxDemo);
//        System.out.println(getCheckbox.checkBoxDemo);
//
//        globals.clickElement(getCheckbox.singleBox);

//        getCheckbox.checkBoxDemo.click();

    }

}
