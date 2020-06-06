package mystorepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInButtonPage {

    private static WebDriver driver;

    public SignInButtonPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a/span")
    WebElement signInButton;

    public void signIn(){
        signInButton.click();
    }
}