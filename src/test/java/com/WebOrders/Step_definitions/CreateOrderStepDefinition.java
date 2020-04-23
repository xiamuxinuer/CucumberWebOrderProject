package com.WebOrders.Step_definitions;

import com.WebOrders.pages.OrderPage;
import com.WebOrders.pages.ViewAllOrdersPage;
import com.WebOrders.utilities.BrowserUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class CreateOrderStepDefinition {
    OrderPage orderPage=new OrderPage();
    ViewAllOrdersPage viewAllOrdersPage=new ViewAllOrdersPage();

    @Given("user navigates to {string} page")
    public void user_navigates_to_page(String string) {
        System.out.println("user navigate to "+string+" page");
        orderPage.navigateTo(string);
        BrowserUtilities.wait(1);
    }

    @When("user enters product information:")
    public void user_enters_product_information(List<Map<String,String>> dataTable ) {

        System.out.println("user enters product information:");
        orderPage.enterProductInput(dataTable.get(0).get("Product"));
        orderPage.enterQuantity(dataTable.get(0).get("Quantity"));
        orderPage.enterUnitPrice(dataTable.get(0).get("Price per unit"));
        orderPage.enterDiscount(dataTable.get(0).get("Discount"));

    }

    @When("user click on calculate button")
    public void user_click_on_calculate_button() {
        System.out.println("user calculate total");
        orderPage.clickCalculate();
        BrowserUtilities.wait(2);
    }

    @Then("user should verify that total {int} is displayed")
    public void user_should_verify_that_total_is_displayed(Integer int1) {
        System.out.println("user verifies total is displayed");
        Assert.assertTrue(orderPage.getTotal()==int1);
    }

    @When("user enters address information:")
    public void user_enters_address_information(List<Map<String,String>> dataTable) {
        System.out.println("user enters address information:");
        orderPage.enterCustomerName(dataTable.get(0).get("Customer name"));
        orderPage.enterStreetInput(dataTable.get(0).get("Street"));
        orderPage.enterCity(dataTable.get(0).get("City"));
        orderPage.enterStateInput(dataTable.get(0).get("State"));
        orderPage.enterZipCodeInput(dataTable.get(0).get("Zip"));
    }

    @When("user enters payment information:")
    public void user_enters_payment_information(List<Map<String,String>> dataTable) {
        System.out.println("user enters payment information:");
       orderPage.clickToSelectCard(dataTable.get(0).get("Card"));
       orderPage.enterCardNumber(dataTable.get(0).get("Card Nr:"));
       orderPage.enterExpiredDate(dataTable.get(0).get("Expire date (mm/yy)"));
    }

    @When("user click on process button")
    public void user_click_on_process_button() {
        System.out.println("user click to process");
        orderPage.clickToProcess();
        BrowserUtilities.wait(1);
    }
    @Then("user verifies that order is displayed")
    public void user_verifies_that_order_is_displayed(List<Map<String,String>> dataTable) {
        System.out.println("user verifies new order is displayed");
        Assert.assertEquals(dataTable.get(0).get("Name"), viewAllOrdersPage.getCarGeneralInfo("Test User"));
        Assert.assertEquals(dataTable.get(0).get("Product"), viewAllOrdersPage.getCarGeneralInfo("ScreenSaver"));



    }



}
