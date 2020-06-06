package mystorepackage;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MyStoreLoginTest {

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

    public void testLoginWithProperCredentials() {

        MyStoreLoginPage loginPage = new MyStoreLoginPage(driver);
        SignInButtonPage signInButtonPage = new SignInButtonPage(driver);
        AddFirstAddressPage addFirstAddressPage = new AddFirstAddressPage((driver));


        signInButtonPage.signIn();
        loginPage.loginAs("fugfmnwmygxkccodoh@ttirv.org", "CodersLab");
        Assert.assertEquals("Adam Kowalski", loginPage.getLoggedUsername());
        addFirstAddressPage.addFirstAddress();
        addFirstAddressPage.fillAddress();
    }

//     @After
//
//     public void tearDown(){
//        driver.quit();
//    }
}
