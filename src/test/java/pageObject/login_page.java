package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import stepDef.Hook;

public class login_page extends Config {
    public login_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }
    @FindBy(how = How.XPATH, using = "//input[@id='fld-e']")
    public WebElement emailLocator;










    public void entereUsername(String email){
        emailLocator.sendKeys(email);
    }





}