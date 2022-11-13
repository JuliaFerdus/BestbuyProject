package pageObject;

import base.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;


public class link_page extends Config {

    public link_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    public void homePageTitle() {
        String act = driver.getTitle();
        String exp = "Best Buy | Official Online Store | Shop Now & Save";
        Assert.assertEquals(exp, act);
        System.out.println("i am on bestbuy home page");
    }

    @FindBy(how = How.ID, using = "section-1")
    public WebElement orderAndpurechasesLocator;


    //Function
    public void verificationOfallLinks() {
     WebElement ulbody = driver.findElement(By.id("section-1"));
     int link =ulbody.findElements(By.cssSelector("a")).size();
     System.out.println(link);
     for(int i =0; i<link;i++){
         WebElement linkTex= driver.findElement(By.id("section-1"));
         List<WebElement> links =linkTex.findElements(By.cssSelector("a"));
         String printlinkText= links.get(i).getText();
         System.out.println(printlinkText);
         links.get(i).click();
         driver.navigate().back();
     }

    }
}
   /* WebElement ulbody = driver.findElement(By.cssSelector("div.footer__bottom-section"));

        int link = ulbody.findElements(By.cssSelector("a")).size();


        System.out.println(link);
        for (int i = 0; i < link; i++) {
            WebElement ulbody2 = driver.findElement(By.cssSelector("div.footer__bottom-section"));
            List<WebElement> links= ulbody2.findElements(By.cssSelector("a"));
            String linkText = links.get(i).getText();

            System.out.println(linkText);
            links.get(i).click();


            String actTitle = driver.getTitle();
            System.out.println(actTitle);
            Assert.assertTrue(actTitle.contains(linkText));
            driver.navigate().back();

    int link = ulbody.findElements(By.cssSelector("a")).size();


        System.out.println(link);
                for (int i = 0; i < link; i++) {
        WebElement ulbody2 = driver.findElement(By.cssSelector("div.footer__bottom-section"));
        List<WebElement> links= ulbody2.findElements(By.cssSelector("a"));
        String linkText = links.get(i).getText();

        System.out.println(linkText);
        links.get(i).click();


        String actTitle = driver.getTitle();
        System.out.println(actTitle);
        Assert.assertTrue(actTitle.contains(linkText));
        driver.navigate().back();*/