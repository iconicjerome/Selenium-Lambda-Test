package Regression;

import PageObjects.checkBox;
import Utils.Globals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class testCheckbox extends Globals{
    WebDriver driver;
    checkBox  getCheckBox;

    @Test(priority = 0)
    public void testSingleCheckbox(){

        getCheckBox = new checkBox(driver);
        getCheckBox.clickElement(getCheckBox.checkBoxDemo);
        getCheckBox.clickElement(getCheckBox.singleBox);
    }

}
