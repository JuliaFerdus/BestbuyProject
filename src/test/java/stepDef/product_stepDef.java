package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.product_page;

public class product_stepDef extends Config {

    product_page pp = new product_page(driver);

    @Given("i am on best buy home page searching for product")
    public void iAmOnBestBuyHomePageSearchingForProduct() {
        pp.verifyPageTitle();
    }

    @And("i enter mac laptop on search box")
    public void iEnterMaclaptopOnSearchBox() {
        pp.searchIcon();
    }

    @And("i click on search icon")
    public void iClickOnSearchIcon() {
        pp.submitButton();
    }

    @And("i click on the first mac laptop link")
    public void iClickOnTheFirstMacLaptopLink() {
        pp.findLaptop();
    }

    @And("i click on add to cart button")
    public void iClickOnAddToCartButton() throws InterruptedException {
        pp.VerifyClickAdd();
    }

    @And("from the pop up window i click go to cart button")
    public void fromThePopUpWindowIClickGoToCartButton() {
        pp.verifyGoToCart();
    }

    @And("cancel the next pop up window")
    public void cancelTheNextPopUpWindow() {
        pp.verifyPopupCancel();
    }

    @And("i click on checkout button")
    public void iClickOnCheckoutButton() {
        pp.verifyCheckOut();
    }

    @And("i click on continue as guest")
    public void iClickOnContinueAsGuest() {
        pp.clickOnContinueGuestButton();
    }

    @And("i enter valid email address")
    public void iEnterValidEmailAddress() {
        pp.clickOnContractInformationButton();
    }

    @And("i enter valid phone number for order")
    public void iEnterValidPhoneNumberForOrder() {

        pp.clickOnPhoneNumberButton();
    }

    @When("i click on continue to payment information button")
    public void iClickOnContinueToPaymentInformationButton() throws InterruptedException {
        pp.clickOnContinuePaymentButton();
    }
}