package exp.willowTree.pages;

import exp.willowTree.utilities.ConfigurationReader;
import exp.willowTree.utilities.Driver;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public BasePage(){PageFactory.initElements(Driver.getDriver(),this);}






}
