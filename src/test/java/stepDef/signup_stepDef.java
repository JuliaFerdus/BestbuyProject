package stepDef;

import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.login_page;
import pageObject.signin_page;



public class signup_stepDef extends Config {

    signin_page SP = new signin_page(driver);
    login_page sl = new login_page(driver);
    Faker fake = new Faker();

    @Given("i am on best buy Home page")
    public void iAmOnBestBuyHomePage() {
        SP.verifyHomePageTitle();
        sl.verifyPageTitle();
    }

    @And("i click on Account")
    public void iClickOnAccount() {
        SP.accountForSignup();
    }

    @And("i click on create account")
    public void iClickOnCreateAccount() {
        SP.createAccount();

    }

    @Then("i am on the create an account page")
    public void iAmOnTheCreateAnAccountPage() {
    }

    @And("i enter first name")
    public void iEnterFirstName() {
        String fakeFirstName = fake.name().firstName();
        SP.enterFirstName(fakeFirstName);
    }

    @And("i enter last name")
    public void iEnterLastName() {
        String fakeLastName = fake.name().lastName();
        SP.enterLastName(fakeLastName);
    }

    @And("i enter valid email")
    public void iEnterValidEmail() {
        String fn = fake.name().firstName().toLowerCase();
        String ln = fake.name().lastName().toLowerCase();
        String num = fake.number().digits(7);
        String domain = "@gmail.com";
        String email = fn + ln + num + domain;
        SP.enterEmail(email);
    }

    @And("i enter password")
    public void iEnterPassword() {
        SP.enterPassword();
    }

    @And("i enter confirm password")
    public void iEnterConfirmPassword() {
        SP.enterComfpassword();
    }

    @And("i enter valid phone number")
    public void iEnterValidPhoneNumber() {
        String fakephoneNum = fake.phoneNumber().cellPhone();
        SP.enterPhoneNum(fakephoneNum);
    }

    @And("i click on check box")
    public void iClickOnCheckBox() {
        SP.clickOnCheckBox();
    }

    @When("i click on create on account button")
    public void iClickOnCreateOnAccountButton() {
        SP.createNewAccount();
    }

    @Then("i should be able to signup successfully")
    public void iShouldBeAlbeToSignupSuccessfully() {
    }

    @And("i enter valid firstname {string} during signup")
    public void iEnterValidFirstnameDuringSignup(String firstname) {
        SP.enterFirstName(firstname);
    }

    @And("i enter lastname {string} during signup")
    public void iEnterDuringSignup(String lastName) {
        SP.enterLastName(lastName);
    }

    @And("i enter valid emai {string} during signup")
    public void iEnterValidEmaiDuringSignup(String email) {
        SP.enterEmail(email);
    }

    @And("i enter valid password {string} during signup")
    public void iEnterValidDuringSignup(String pass) {
        SP.enterPassword1(pass);
    }

    @And("i enter confirmpassword {string} during signup")
    public void iEnterConfirmpasswordDuringSignup(String conf) {
        SP.enterComfpassword1(conf);
    }

    @And("i enter valid {string} number")
    public void iEnterValidNumber(String phonrNum) {
        SP.enterPhoneNum(phonrNum);
    }

    @Then("i should see the following {string} message")
    public void iShouldSeeTheFollowingMessage(String error) {
        SP.enterInvalidLastName(error);

    }
}