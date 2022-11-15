package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import stepDef.Hook;

public class login_page extends Config {
    public login_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    public void verifyPageTitle() {
        String act = driver.getTitle();
        String exp = "Best Buy | Official Online Store | Shop Now & Save";
        Assert.assertEquals(exp, act);
        System.out.println("i am on bestbuy home page" + "  " + act);
    }

    @FindBy(how = How.XPATH, using = "//span[@class='v-p-right-xxs line-clamp']")
    public WebElement accountLocator;
    @FindBy(how = How.XPATH, using = "//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
    public WebElement signInLOcator;
    @FindBy(how = How.XPATH, using = "//input[@id='fld-e']")
    public WebElement emailLocator;
    @FindBy(how = How.XPATH, using = "//input[@id='fld-p1']")
    public WebElement passLocator;
    @FindBy(how = How.XPATH, using = "//button[@data-track='Sign In']")
    public WebElement clickOnsignInLocator;
    @FindBy(how = How.XPATH, using = "//div[@class='c-alert-content rounded-r-100 flex-fill v-bg-pure-white p-200 pl-none']/strong/div[1]")
    public WebElement invalidPassLocator;
    @FindBy(how = How.XPATH, using = "//span[@class='v-p-right-xxs line-clamp']")
    public WebElement nameLocator;

    public void successfulloginverify() {
        String actText = nameLocator.getText();
        String exp = "Hi, Julia";
        System.out.println("Act successfull message: ==> " + actText);
        Assert.assertEquals(exp, actText);
    }
    public void verifyInvalidPassErrorMsg() {
        String actText = invalidPassLocator.getText();
        //String act = actTextBeforeTrim.substring(1,actTextBeforeTrim.length() - 1);
        String exp = "Oops! The email or password did not match our records. Please try again.";
        System.out.println("Act error message: ==> " + actText);
        Assert.assertEquals(exp, actText);
    }


    public void clickOnAccountButton() {
        accountLocator.click();
    }

    public void clickOnSignInButton() {
        signInLOcator.click();
    }

    public void entereUsername(String email) {
        emailLocator.sendKeys(email);
    }

    public void enterePassword(String pass) {
        passLocator.sendKeys(pass);
    }

    public void verifyClickOnSignIn() {
        clickOnsignInLocator.click();
    }

    }





