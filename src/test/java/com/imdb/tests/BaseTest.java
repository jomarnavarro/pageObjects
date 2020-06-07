package com.imdb.tests;

import com.imdb.pages.CreateAccountPage;
import com.imdb.pages.HomePage;
import com.imdb.pages.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseTest {


    WebDriver driver;

    protected HomePage home;
    protected LoginPage login;
    protected CreateAccountPage createAccount;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        home = new HomePage(driver);
        //login = new LoginPage(driver);
        //createAccount = new CreateAccountPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
