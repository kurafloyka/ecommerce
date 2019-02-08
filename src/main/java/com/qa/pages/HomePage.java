package com.qa.pages;

import com.qa.util.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage extends TestBase {

    @FindBy(xpath = "/html/body/div[1]/header/div/div[2]/div[2]/div/a[2]/span[1]")
    WebElement loginPageBtn;

    @FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[4]/div[2]/div[2]/div/div[2]/a[20]/span")
    WebElement logOut;

    public void goToLoginPage() throws InterruptedException {

    loginPageBtn.click();

    }



    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void logOut(){

        logOut.click();

    }



}
