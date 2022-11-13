package stepDef;

import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.signin_page;



public class signup_stepDef extends Config {

    signin_page SP = new signin_page(driver);
    Faker fake = new Faker();
    @Given("i am on best buy Home page")
    public void iAmOnBestBuyHomePage() {
        SP.verifyHomePageTitle();

    }

    @And("i click on Account")
    public void iClickOnAccount() {
        SP.accountForSignin();
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
      String email = fn+ln+num+domain;
        SP.enterEmail(email);
    }

    @And("i enter password")

    public void iEnterPassword() {
        String fakePassword = fake.internet().password();
        SP.enterPassword(fakePassword);
        SP.enterComfpassword(fakePassword);
    }

    @And("i enter confirm password")
    public void iEnterConfirmPassword() {
//       String fakeConfPass = fake.internet().password();
//       SP.enterComfpassword(fakeConfPass);
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

}

