package cucumber.test;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import org.openqa.selenium.chrome.ChromeDrive;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class NewAddress {

    public String keyword;
    private WebDriver driver;


    @Given("an open website https://prod-kurs.coderslab.pl/index.php?controller=address")
    public void openGoogleSearch() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe"); // Uruchom nowy egzemplarz przeglądarki Chrome driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://prod-kurs.coderslab.pl/index.php?controller=address");}

    @When("a keyword <alias> is entered in input field")
    public void enterKeyword(String keyword) {
        WebElement element = driver.findElement(By.name("alias"));
        element.clear();
        element.sendKeys(keyword);
    }

    @Then("create new address with <alias>, <address>, <city>, <zip>, <country>, <phone>")
    public void theFirstOneShouldContainKeyword(String expectedText) {
        System.out.println(expectedText);}


    @And("close browser")
    public void closeBrowser(){
    }

}
