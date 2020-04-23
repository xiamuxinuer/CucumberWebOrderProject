package com.WebOrders.pages;

import com.WebOrders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,10);



    public BasePage(){
        PageFactory.initElements(driver,this);
    }





}
