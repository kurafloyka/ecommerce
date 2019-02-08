package com.qa.stepDefinitions;

import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.util.TestBase;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.junit.Assert;




public class HomePageSteps extends TestBase {

    HomePage homePage;
    LoginPage loginPage;
    HomePage homePageLoggedIn;
    //private static final Logger log = LogManager.getRootLogger();

    private static final Logger log = Logger.getLogger(HomePageSteps.class);
    @Before
    public void setUP() {

        System.out.println("Enter URL for amazon.com");
        TestBase.initialization();
        log.debug("****************opening webiste**********************");
        log.info("enter username");
        log.warn("warn");
        log.fatal("info");
    }

    @After
    public void tearDown() {

        System.out.println("Close the browser");
        log.debug("*****************closing website*****************************");
        driver.close();

    }


    @Given("^User is already on Home Page$")
    public void user_already_home_page() {


    }

    @When("^go to the login page$")
    public void go_to_login_page_is_sign_in() throws InterruptedException {
        homePage = new HomePage();
        homePage.goToLoginPage();

    }

    @Then("^user enters username and password and click button$")
    public void user_enters_username_and_password_and_click_button() throws InterruptedException {

        loginPage = new LoginPage();
        homePageLoggedIn = loginPage.login(prop.getProperty("email"), prop.getProperty("password"));

    }


    @And("^user is on home page$")
    public void user_is_login_home_page() {

        String homePageURL = "https://www.amazon.com/?ref_=nav_ya_signin&";
        Assert.assertEquals(homePageURL, driver.getCurrentUrl());


    }
}

