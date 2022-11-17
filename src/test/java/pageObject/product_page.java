package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import org.testng.Assert;

public class product_page extends Config {

    public product_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    public void verifyPageTitle() {
        String act = driver.getTitle();
        String exp = "Best Buy | Official Online Store | Shop Now & Save";
        Assert.assertEquals(exp, act);
        System.out.println("i am on bestbuy home page" + "  " + act );
    }

    @FindBy(how = How.ID, using = "gh-search-input")
    public WebElement searchLocator;

    @FindBy(how = How.CSS, using = "button[title='submit search']")
    public WebElement submitLocator;

    @FindBy(how = How.XPATH, using = "//div[@data-sku-id='6509650']/a[1]/img[1]")
    public WebElement laptopLocator;

    @FindBy(how = How.XPATH, using = "//button[@data-button-state='ADD_TO_CART']")
    public WebElement addToCartLocator;


    @FindBy(how = How.LINK_TEXT, using = "Go to Cart")
    public WebElement goToCartLocator;


    @FindBy(how = How.XPATH, using = "//html/body/div[1]/main/div/div[2]/div[1]/div/div[4]/div[1]/div/div/div/div/button")
    public WebElement cancelPopupLocator;


    @FindBy(how=How.XPATH, using = "//button[@data-track='Checkout - Top']")
    public WebElement checktOutLocator;

    @FindBy(how = How.CSS,using = "button[class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
    public WebElement continueAsGuest;

    @FindBy(how = How.CSS,using = "input[id='user.emailAddress']")
    public WebElement contractInformationLocator;

    @FindBy(how = How.CSS, using = "input[id='user.phone']")
    public WebElement phoneNumberLocator;

    @FindBy(how = How.XPATH,using = "//div[@class='button--continue']/button/span")
    public WebElement continueTopaymentlocator;

    @FindBy(how = How.XPATH,using = "//input[@name='number']")
    public WebElement paymentLocator;


    public void searchIcon() {
        searchLocator.sendKeys("mac laptop");
    }

    public void submitButton() { submitLocator.click();}

    public void findLaptop() {
        laptopLocator.click();
    }

    public void VerifyClickAdd() throws InterruptedException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
     WebElement clickADD = driver.findElement(By.xpath("//button[@class='c-button c-button-primary c-button-lg c-button-block c-button-icon c-button-icon-leading add-to-cart-button']"));
     js.executeScript("arguments[0].scrollIntoView()",clickADD);
     Thread.sleep(3000);
     addToCartLocator.click();
    }


    public void verifyGoToCart() {
        goToCartLocator.click();
    }

    public void verifyPopupCancel() {
        cancelPopupLocator.click();
    }

    public void verifyCheckOut()  {
        checktOutLocator.click();
    }

    public void clickOnContinueGuestButton(){ continueAsGuest.click(); }

    public void clickOnContractInformationButton(){ contractInformationLocator.sendKeys("juliaferduse7@gmail.com"); }

    public void clickOnPhoneNumberButton(){
        phoneNumberLocator.sendKeys("9295337556");
    }

    public void clickOnContinuePaymentButton(){
        continueTopaymentlocator.click();
    }

    public void clickOnCardNumberBox(){
        paymentLocator.sendKeys("378282246310005");
    }

}