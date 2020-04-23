package com.WebOrders.Step_definitions;

import com.WebOrders.pages.LoginPage;
import com.WebOrders.utilities.ConfigurationReader;
import com.WebOrders.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LoginStep_Definition {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("user is on login page");
        String url= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @Given("user logs in")
    public void user_logs_in() {
        System.out.println("user logs in");
        loginPage.login();
    }

    @Then("user verifies sub title is {string}")
    public void user_verifies_sub_title_is(String string) {
        System.out.println("user verifies page sub title is : " +string);
        Assert.assertEquals(loginPage.getPageSubTitle(),string);
    }

}
