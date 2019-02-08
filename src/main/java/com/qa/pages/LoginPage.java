package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {


    @FindBy(id = "ap_email")
    WebElement emailField;

    @FindBy(id = "ap_password")
    WebElement passwordField;

    @FindBy(id = "signInSubmit")
    WebElement loginBtn;

    // Initializing the Page Objects:
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String em, String pwd) throws InterruptedException {
        emailField.sendKeys(em);
        passwordField.sendKeys(pwd);
        loginBtn.click();
        return new HomePage();
    }
}
