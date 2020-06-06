package mystorepackage;

import org.codehaus.plexus.util.FileUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class PurchasingTest {

    private WebDriver driver;

    @Before

    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php");
    }

    @Test

    public void PurchasingItems() {

        MyStoreLoginPage loginPage = new MyStoreLoginPage(driver);
        SignInButtonPage signInButtonPage = new SignInButtonPage(driver);
        AddFirstAddressPage addFirstAddressPage = new AddFirstAddressPage(driver);

        signInButtonPage.signIn();
        loginPage.loginAs("fugfmnwmygxkccodoh@ttirv.org", "CodersLab");
        Assert.assertEquals("Adam Kowalski", loginPage.getLoggedUsername());

        WebElement searchOurCatalog = driver.findElement(By.name("s"));
        searchOurCatalog.click();
        searchOurCatalog.sendKeys("Hummingbird Printed Sweater");
        searchOurCatalog.submit();

        WebElement productSelect = driver.findElement(By.xpath("//*[@id=\"js-product-list\"]/div[1]/article[1]/div/a"));
        productSelect.click();


        Select sizeDropdown = new Select(driver.findElement(By.id("group_1")));
        String[] sizes = {"S", "M", "L", "XL"};
        sizeDropdown.selectByVisibleText(sizes[1]);


        WebElement quantityWanted = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[1]/div/span[3]/button[1]"));
        quantityWanted.click();
        quantityWanted.click();
        quantityWanted.click();
        quantityWanted.click();


        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"add-to-cart-or-refresh\"]/div[2]/div/div[2" +
                "]/button"));
        addToCart.click();


        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"blockcart-modal\"]/div/div/div[2]/div/div[2]/div" +
                "/div/a"));
        checkout.click();


        WebElement proceedToCheckout = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div[1]/div[2]/div/a"));
        proceedToCheckout.click();


        WebElement continueButton1 = driver.findElement(By.name("confirm-addresses"));
        continueButton1.click();


        WebElement shipping = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/div/div[1]/div[1]/label/div/div[1" +
                "]/div/div/span"));
        shipping.click();


        WebElement continueButton2 = driver.findElement(By.xpath("//*[@id=\"js-delivery\"]/button"));
        continueButton2.click();


        WebElement payment = driver.findElement(By.xpath("//*[@id=\"payment-option-1-container\"]/label/span"));
        payment.click();


        WebElement termsOfService = driver.findElement(By.name("conditions_to_approve[terms-and-conditions]"));
        termsOfService.click();


        WebElement orderButton = driver.findElement(By.xpath("//*[@id=\"payment-confirmation\"]/div[1]/button"));
        orderButton.click();

    }

//     @After
//
//     public void tearDown(){
//        driver.quit();
//    }
}

