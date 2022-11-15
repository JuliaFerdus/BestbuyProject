package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.login_page;
import pageObject.signin_page;

public class login_stepDef extends Config {
    login_page lp = new login_page(driver);

    @And("i click on Account button")
    public void iClickOnAccountButton() {
        lp.clickOnAccountButton();
    }
    @And("i click on signin button")
    public void iClickOnSigninButton() {
        lp.clickOnSignInButton();
    }
    @And("i enter valid username")
    public void iEnterValidUsername() {
        lp.entereUsername(Hook.email);
    }
    @And("i enter valid password")
    public void iEnterValidPassword() {
        lp.enterePassword(Hook.password);
    }

    @When("i click on login button")
    public void iClickOnLoginButton() {
        lp.verifyClickOnSignIn();
    }

    @Then("i should be able to login successfully")
    public void iShouldBeAbleToLoginSuccessfully() {
        lp.successfulloginverify();
    }

    @And("i enter invalid password")
    public void iEnterInvalidPassword() { //for negative test case with invalid password
        lp.enterePassword("jara1");
    }

    @Then("i should not be able to login successfully")
    public void iShouldNotBeAbleToLoginSuccessfully() {
        lp.verifyInvalidPassErrorMsg();

    }

    @And("i enter invalid username")
    public void iEnterInvalidUsername() {
        lp.entereUsername("julw12@gmail.com");
    }

}
