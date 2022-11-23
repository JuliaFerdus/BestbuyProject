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




    //Function
    public void verificationOfallLinks() {
        WebElement ulbody = driver.findElement(By.id("section-1"));
        List<WebElement> link = ulbody.findElements(By.cssSelector("a"));
     System.out.println(link.size());
     for(int i =0; i< link.size();i++){
         WebElement linkTex= driver.findElement(By.id("section-1"));
         List<WebElement> links =linkTex.findElements(By.cssSelector("a"));
         String printlinkText= links.get(i).getText();
         System.out.println(printlinkText);
         links.get(i).click();
         if(driver.getTitle().contains("Product Recalls - Best Buy")){
             Assert.assertTrue(driver.findElement(By.xpath("//h1[@class='page-title']")).getText().contains("Product Recalls and Safety Alerts"));
             driver.findElement(By.linkText("www.cpsc.gov/recalls/")).click();
             System.out.println("Links is click");

             driver.switchTo().defaultContent();
             driver.navigate().to("https://www.bestbuy.com/");
         } else {

             driver.navigate().to("https://www.bestbuy.com/");

         }


     }

    }
}