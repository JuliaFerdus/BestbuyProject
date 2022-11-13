package stepDef;

import base.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.link_page;

public class all_links extends Config {
    link_page lp = new link_page(driver);
    @Given("i am in best buy Home page")
    public void iAmInBestBuyHomePage() {
       lp.homePageTitle();

    }


    @And("verify all the links are available at footer")
    public void verifyAllTheLinksAreAvailable() {
       lp.verificationOfallLinks();


    }
}
