package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class _02_loginAccountSteps {

    DialogContent dc = new DialogContent();

    WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));

    @When("Fill the Email and Password fields")
    public void fillTheEmailAndPasswordFields() {
        dc.sendKeysFunction(dc.loginEmail, "gokcesasmaz06@gmail.com");
        dc.sendKeysFunction(dc.loginPassword, "Timus2023");
    }

    @And("Admin click the Continue Button")
    public void adminClickTheContinueButton() {
        wait.until(ExpectedConditions.elementToBeClickable(dc.continueButton));
        dc.clickFunction(dc.continueButton);

    }

    @Then("Admin see the profile icon")
    public void adminSeeTheProfileIcon() {
        wait.until(ExpectedConditions.visibilityOf(dc.profilIcon));
        Assert.assertTrue(dc.profilIcon.isDisplayed());

    }
}
