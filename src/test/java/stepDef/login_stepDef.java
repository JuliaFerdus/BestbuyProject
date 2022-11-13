package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.login_page;

public class login_stepDef extends Config {
    login_page lp = new login_page(driver);
    @And("i enter valid username")
    public void iEnterValidUsername() {
        lp.entereUsername(Hook.email);

    }

    @And("i enter valid password")
    public void iEnterValidPassword() {
    }

    @When("i click on login button")
    public void iClickOnLoginButton() {
    }

    @Then("i should be able to login successfully")
    public void iShouldBeAbleToLoginSuccessfully() {
    }

    @And("i enter invalid password")
    public void iEnterInvalidPassword() {
    }

    @Then("i should not be able to login successfully")
    public void iShouldNotBeAbleToLoginSuccessfully() {
    }

    @And("i enter invalid username")
    public void iEnterInvalidUsername() {
    }
}
