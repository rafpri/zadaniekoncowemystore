package cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/feature/newaddress.feature",
plugin = {"pretty", "html:out"})

public class NewAddressTest {
}
