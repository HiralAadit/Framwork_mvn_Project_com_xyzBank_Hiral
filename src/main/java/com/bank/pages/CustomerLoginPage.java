package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {

    @CacheLookup
            @FindBy(xpath="//button[@ng-click='customer()']")
    WebElement _clickOnCustomerLogin;

    @CacheLookup
    @FindBy(xpath="//select[@id='userSelect']")
    WebElement _serchCreateCustomer;

    @CacheLookup
    @FindBy (xpath="//button[@class='btn btn-default']")
    WebElement _clickOnLoginButton;

    @CacheLookup
            @FindBy(xpath="//button[@class='btn logout']")
            WebElement _verifyLogoutTab;
    @CacheLookup
            @FindBy(xpath="//select[@id='userSelect']")
    WebElement _verifyYourNametextdisplayed;



public void set_clickOnCustomerLogin(){
    Reporter.log("click on customer login" + _clickOnCustomerLogin.toString());
    clickOnElement(_clickOnCustomerLogin);}
public void set_serchCreateCustomer(){
    Reporter.log("Select customer" +_serchCreateCustomer.toString() );
    selectByVisibleTextFromDropDown(_serchCreateCustomer,"Harry Potter");}
public void set_clickOnLoginButton(){
    Reporter.log("click login button" + _clickOnLoginButton.toString());
    clickOnElement(_clickOnLoginButton);}
public void set_verifyLogoutTab(){
Reporter.log("verify logout" + _verifyLogoutTab.toString());
    clickOnElement(_verifyLogoutTab);}
//public void set_verifyLogoutTab(){clickOnElement(_serchCreateCustomer);}
}
