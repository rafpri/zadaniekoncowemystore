package mystorepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddFirstAddressPage {

    private static WebDriver driver;

    public AddFirstAddressPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"address-link\"]/span/i")
    WebElement addFirstAddressButton;

    public void addFirstAddress(){
        addFirstAddressButton.click();
    }

    @FindBy(name = "alias")
    WebElement alias;

    @FindBy(name = "address1")
    WebElement address;

    @FindBy(name = "city")
    WebElement city;

    @FindBy(name = "postcode")
    WebElement postcode;

    @FindBy(name = "phone")
    WebElement phone;

    @FindBy(name = "id_country")
    private WebElement Select;


    public void fillAddress(){

        alias.click();
        alias.clear();
        alias.sendKeys("alias");

        address.click();
        address.clear();
        address.sendKeys("address");

        city.click();
        city.clear();
        city.sendKeys("city");

        postcode.clear();
        postcode.clear();
        postcode.sendKeys("postcode");

        phone.click();
        phone.clear();
        phone.sendKeys("phone");

        Select countryDropdown = new Select(Select);
        String[] roles = {"United Kingdom"};
        countryDropdown.selectByVisibleText(roles[0]);
    }
}

