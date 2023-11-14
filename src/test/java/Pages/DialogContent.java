package Pages;

import Utilities.GWD;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class DialogContent extends Parent {

    public DialogContent() {

        PageFactory.initElements(GWD.getDriver(), this );
    }
    @FindBy(xpath = "//span[text()='Create Account']")
    public WebElement createAccountButton;

    @FindBy(css = "input[data-testid='register-firstname-input']")
    public WebElement firstName;

    @FindBy(css = "input[data-testid='register-lastname-input']")
    public WebElement lastName;

    @FindBy(css = "input[data-testid='register-email-input']")
    public WebElement email;

    @FindBy(css = "input[placeholder='Select']")
    public WebElement country;

    @FindBy(xpath = "//span[text()='Turkey']")
    public WebElement selectedCountry;

    @FindBy(xpath = "//span[text()='Privacy Policy']")
    public WebElement privacyPolicy;

    @FindBy(xpath = "//span[text()='I have read and accept']")
    public WebElement privacyPolicyAccept;

    @FindBy(xpath = "//span[text()='Terms of Service']")
    public WebElement termService;

    @FindBy(xpath = "//span[text()='I have read and accept']")
    public WebElement termServiceAccept;

    @FindBy(css = "button[class='el-button el-button--danger']")
    public WebElement continueButton;

    @FindBy(xpath = "//*[contains(text(), 'already exist')]")
    public WebElement verifyMessage;

    @FindBy(xpath = "//*[contains(text(), 'Google Recaptcha')]")
    public WebElement recaptchaMessage;

    @FindBy(css = "input[data-testid='login-email-input']")
    public WebElement loginEmail;

    @FindBy(css = "input[type='password']")
    public WebElement loginPassword;

    @FindBy(id = "header-user")
    public WebElement profilIcon;









}
