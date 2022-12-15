package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.Listeners;


public class OpenAccountPage extends Utility {

    @CacheLookup
            @FindBy (xpath="//button[@class='btn btn-primary btn-lg']")
    WebElement _clickOnBankManagerLogin;

    @CacheLookup
    @FindBy (xpath ="//button[@ng-click='openAccount()']" )
    WebElement _clickOnOpenAccountTab;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='openAccount()']" )
    WebElement _SearchCustomer;

    @CacheLookup
    @FindBy(xpath="//select[@id='currency']")
    WebElement _SelectCurrency;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement _clickOnProcessButton;



   // public void set_clickOnBankManagerLogin(){click            }
    public void set_clickOnOpenAccountTab(){
        Reporter.log("Click on open account" + _clickOnOpenAccountTab.toString());
        clickOnElement(_clickOnOpenAccountTab);}
    public void set_SearchCustomer(){
        Reporter.log("Click on search customer" + _SearchCustomer.toString());
        selectByVisibleTextFromDropDown(_SearchCustomer,"Harry Potter");}
public void set_SelectCurrency(){
        Reporter.log("select from currency box" + _SelectCurrency.toString());
        selectByVisibleTextFromDropDown(_SelectCurrency,"Pound");}
public void set_clickOnProcessButton(){
        Reporter.log("cleck on process button"+_clickOnOpenAccountTab.toString());
        clickOnElement(_clickOnProcessButton);}
    // popup displayed
    // verify message "Account created successfully"
    public String verifyGetText1(){
        return getTextFromAlert();

    }
    public  void alertAccept1(){
        driver.switchTo().alert().getText();
        // click on "ok" button on popup.

    }
}




