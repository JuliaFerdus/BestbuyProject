package pageObject;

import base.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


public class signin_page extends Config {
    public signin_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }
    //locators
    @FindBy(how = How.XPATH, using ="//span[@class='v-p-right-xxs line-clamp']")
    public WebElement accountLocator;

    @FindBy(how = How.LINK_TEXT, using ="Create Account")
    public WebElement signupLocator;

    @FindBy(how = How.XPATH, using ="//input[@id='firstName']")
    public WebElement firstnameLocator;

    @FindBy(how = How.XPATH, using ="//input[@id='lastName']")
    public WebElement lastNameLocator;
    @FindBy(how = How.XPATH,using = "//*[@id='lastName-text']/p")
    public WebElement lastNameInvalidLocator;

    @FindBy(how = How.CSS, using =" input[id='email']")
    public WebElement emailLocator;

    @FindBy(how = How.CSS, using ="input[id='fld-p1']")
    public WebElement passwordLocator;

    @FindBy(how = How.CSS, using =" input[id='reenterPassword']")
    public WebElement comfirmPasswordLocator;

    @FindBy(how = How.CSS, using ="input[id ='phone']")
    public WebElement phoneNumLocator;

    @FindBy(how = How.CSS, using ="input[name='isRecoveryPhone']")
    public WebElement checkBoxLocator;

    @FindBy(how = How.XPATH, using ="//button[@data-track='Create Account']")
    public WebElement createAnAccount;



    //function
    public void accountForSignup(){
        accountLocator.click();
    }
    public void createAccount() {
        signupLocator.click();

    }
    public void enterFirstName(String fname){
        firstnameLocator.sendKeys(fname);

    }
    public void enterLastName(String lname) {
        lastNameLocator.sendKeys(lname);
    }
    public void enterInvalidLastName(String error) {
       String act= lastNameInvalidLocator.getText();
       String expt= "Please enter your last name.";
       Assert.assertEquals(expt,act);
       System.out.println(act);
    }
    public void enterEmail(String email) {
        emailLocator.sendKeys(email);

    }
    public void enterPassword() {
        passwordLocator.sendKeys("Jen!1243jen");

    }
    public void enterPassword1(String pass) {
        passwordLocator.sendKeys(pass);
    }
    public void enterComfpassword(){
        comfirmPasswordLocator.sendKeys("Jen!1243jen");
    }
    public void enterComfpassword1(String confp){
        comfirmPasswordLocator.sendKeys(confp);
    }
    public void enterPhoneNum(String phnum){
      phoneNumLocator.sendKeys(phnum);
    }

    public void clickOnCheckBox(){
        checkBoxLocator.click();
    }
    public void createNewAccount(){
      createAnAccount.click();
    }

        public void verifyHomePageTitle(){
            String act = driver.getTitle();
            String exp = "Best Buy | Official Online Store | Shop Now & Save";
            Assert.assertEquals(exp, act);
            System.out.println("i am on bestbuy home page");

        }
    }


