package com.WebOrders.pages;

import com.WebOrders.utilities.BrowserUtilities;
import com.WebOrders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class OrderPage extends BasePage {
    @FindBy(id = "ctl00_MainContent_fmwOrder_ddlProduct")
    private WebElement productInput;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtQuantity")
    private WebElement quantity;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtUnitPrice")
    private WebElement unitPrice;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtDiscount")
    private WebElement discount;
    @FindBy(css = "input[value='Calculate']")
    private WebElement calculateButton;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtTotal")
    private WebElement total;
    @FindBy(id = "ctl00_MainContent_fmwOrder_txtName")
    private WebElement customerName;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox2")
    private WebElement streetInput;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox3")
    private WebElement cityInput;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox4")
    private WebElement stateInput;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox5")
    private WebElement zipCodeInput;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox6")
    private WebElement cardNumber;
    @FindBy(id = "ctl00_MainContent_fmwOrder_TextBox1")
    private  WebElement expiredDate;
    @FindBy(id = "ctl00_MainContent_fmwOrder_InsertButton")
    private WebElement processButton;





public void enterProductInput(String string){
    BrowserUtilities.wait(2);
    Select select=new Select(productInput);
    select.selectByVisibleText(string);
    BrowserUtilities.wait(1);
}

public void enterQuantity(String string){
    ;
    quantity.sendKeys(string);
    BrowserUtilities.wait(1);
}

public void enterUnitPrice(String string){
    unitPrice.sendKeys(string);
    BrowserUtilities.wait(1);
}
public void enterDiscount(String string){
    discount.sendKeys(string);
    BrowserUtilities.wait(1);
}

public void clickCalculate(){
    calculateButton.click();
}

public int getTotal(){
    return Integer.parseInt(total.getAttribute("value"));
}

public void enterCustomerName(String string){
    customerName.sendKeys(string);
}

public void enterStreetInput(String string){
    streetInput.sendKeys(string);
}

public void enterCity(String string){
    cityInput.sendKeys(string);
}

public void enterStateInput(String string){
    stateInput.sendKeys(string);
}

public void enterZipCodeInput(String string){
    zipCodeInput.sendKeys(string);
}

////label[text()='Visa']
public void clickToSelectCard(String string){
    String xpath="//label[text()='"+string+"']";
    WebElement card= Driver.getDriver().findElement(By.xpath(xpath));
    card.click();
}

public void enterCardNumber(String string){
    cardNumber.sendKeys(string);
}

public void enterExpiredDate(String string){
    expiredDate.sendKeys(string);
}

public void clickToProcess(){
    processButton.click();
    BrowserUtilities.wait(2);
}



}
