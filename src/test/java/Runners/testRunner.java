package Runners;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {
                "src/test/java/FeatureFiles/createAccount.feature",
                "src/test/java/FeatureFiles/loginAccount.feature"
        },
        glue = {"StepDefinitions"}
)

public class testRunner extends AbstractTestNGCucumberTests {
}
