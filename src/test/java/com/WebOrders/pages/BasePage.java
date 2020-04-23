package com.WebOrders.pages;

import com.WebOrders.utilities.BrowserUtilities;
import com.WebOrders.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait=new WebDriverWait(driver,10);

//    @FindBy(xpath = " //a[text()='Order']")
    protected WebElement pageName;



@FindBy(xpath = "//h1")
    protected WebElement subTitle;

    public BasePage(){
        PageFactory.initElements(driver,this);
    }

public String getPageSubTitle(){
        return subTitle.getText();

}
public void navigateTo(String page){
        String xpath= "//a[text()='"+page+"']";
        pageName=driver.findElement(By.xpath(xpath));
        pageName.click();
    BrowserUtilities.wait(2);
}







}
