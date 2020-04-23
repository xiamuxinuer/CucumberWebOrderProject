package com.WebOrders.pages;

import com.WebOrders.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ViewAllOrdersPage  extends BasePage{

//               xpath to the first row (new created order information:  //tbody/tr[2]/td[2]
    // or this:              //td[text()='emma']

    public String getCarGeneralInfo(String parameter) {
        String xpath = "//td[text()='" + parameter + "']";
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        BrowserUtilities.wait(1);
        return driver.findElement(By.xpath(xpath)).getText().trim();

    }

}
