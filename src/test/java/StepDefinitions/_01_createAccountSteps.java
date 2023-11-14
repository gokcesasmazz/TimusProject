package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


public class _01_createAccountSteps {

    DialogContent dc =new DialogContent();
    Actions act = new Actions(GWD.getDriver());
    WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
    @Given("Navigate to Website")
    public void navigateToWebsite() {
        GWD.getDriver().get("https://manage.timusnetworks.com/");
    }

    @When("Admin Click on the Create Account button")
    public void adminClickOnTheCreateAccountButton() {
        dc.clickFunction(dc.createAccountButton);
    }

    @And("Fill the mandatory fields and check the check box")
    public void fillTheMandatoryFieldsAndCheckTheCheckBox() {
        dc.sendKeysFunction(dc.firstName, "Gökçe");
        dc.sendKeysFunction(dc.lastName, "Şaşmaz");
        dc.sendKeysFunction(dc.email, "gokcesasmaz06@gmail.com");
        dc.clickFunction(dc.country);
        dc.sendKeysFunction(dc.country, "turkey");
        wait.until(ExpectedConditions.visibilityOf(dc.selectedCountry));
        dc.clickFunction(dc.selectedCountry);
        act.sendKeys(Keys.TAB).build().perform();

    }

    @When("Click the Continue button")
    public void clickTheContinueButton() {
        dc.clickFunction(dc.privacyPolicy);
        dc.jsClickFunc(dc.privacyPolicyAccept);
        dc.clickFunction(dc.termService);
        dc.jsClickFunc(dc.termServiceAccept);
        dc.clickFunction(dc.continueButton);

    }

    @Then("Admin see the unsuccess message")
    public void adminSeeTheUnsuccessMessage() {
        dc.waitUntilVisible(dc.recaptchaMessage);
        dc.verifyContainsTextFunction(dc.recaptchaMessage, "Google Recaptcha");

    }
}
