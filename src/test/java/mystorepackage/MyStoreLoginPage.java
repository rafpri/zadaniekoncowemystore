package mystorepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyStoreLoginPage {

    private static WebDriver driver;

    public MyStoreLoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "email")
    WebElement loginInput;

    @FindBy(name = "password")
    WebElement passwordInput;

    @FindBy(id = "submit-login")
    WebElement submitButton;

    public void loginAs(String email, String password){
        loginInput.click();
        loginInput.clear();
        loginInput.sendKeys(email);

        passwordInput.click();
        passwordInput.sendKeys(password);

        submitButton.click();
    }

    @FindBy(xpath = "//*[@id=\"_desktop_user_info\"]/div/a[2]/span")
    WebElement userName;

    public String getLoggedUsername(){
        return userName.getText();
    }
}
