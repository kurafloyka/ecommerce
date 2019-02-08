package com.qa.util;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import com.cucumber.listener.Reporter; reporter singleton icin yapilmisti



public class TestBase {

    public static WebDriver driver;
    public static Properties prop;


    public static void initialization() {

        try {
            prop = new Properties();
            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\FARUK\\IdeaProjects\\orgAmazon\\src\\main\\java\\com\\qa\\config\\config.properties");

            prop.load(fis);

        } catch (IOException e) {
            e.getMessage();
        }

        String browserName = prop.getProperty("browser");

        if (browserName.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equals("mozilla")) {
            System.setProperty("webdriver.gecko.driver", "C:\\\\geckodriver.exe");
            driver = new FirefoxDriver();
        }


        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.manage().window().maximize();


        driver.get(prop.getProperty("url"));

    }








}