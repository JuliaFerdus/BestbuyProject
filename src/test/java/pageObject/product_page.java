package pageObject;

import base.Config;
import org.openqa.selenium.By;
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

    @FindBy(how = How.XPATH, using = "/html/body/div[4]/main/div[3]/div/div[1]/div[3]/div[2]/div/div[2]/div[2]/div/div/div[1]/button")
    public WebElement addToCartLocator;


    @FindBy(how = How.LINK_TEXT, using = "Go to Cart")
    public WebElement goToCartLocator;


    @FindBy(how = How.XPATH, using = "//button[@class='c-button c-button-primary c-button-md btn-lg']")
    public WebElement cancelPopupLocator;




@FindBy(how=How.XPATH, using = "/html/body/div[1]/main/div/div[2]/div[1]/div/div[2]/div[1]/section[2]/div/div/div[4]/div[1]/div/button")
public WebElement checktOutLocator;


    public void searchIcon() {
        searchLocator.sendKeys("mac laptop");
    }

    public void submitButton() {
        submitLocator.click();

    }

    public void findLaptop() {
        laptopLocator.click();
    }

    public void VerifyClickAdd() {
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

}