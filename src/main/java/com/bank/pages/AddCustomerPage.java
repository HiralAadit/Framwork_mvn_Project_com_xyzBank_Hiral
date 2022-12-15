package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Bank Manager Login']")
    WebElement _clickOnBankManagerLogin;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement _clickOnAddCustomerTab;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement _enterFirstName;
    //xpath("//*[contains(text(),'First Name')]");

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement _enterLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement _enterPostCode;

    @CacheLookup
    @FindBy(xpath = "//button[@class='btnClass1']")
    WebElement _clickOnAddCustomerButton;

    public void set_ClickOnBankManagerLogin() {
        Reporter.log("Click on manager login" + _clickOnBankManagerLogin.toString());
        clickOnElement(_clickOnBankManagerLogin);
    }

    public void set_clickOnAddCustomerTab() {
        Reporter.log("click on addcustomer" + _clickOnAddCustomerTab.toString());
        clickOnElement(_clickOnAddCustomerTab);
    }

    public void set_enterFirstName(String firstName) {
        Reporter.log("enter text name" + firstName + " to first name field" + _enterFirstName);
        sendTextToElement(_enterFirstName, firstName);
    }

    public void set_enterLastName(String lastname) {
        Reporter.log("enter text name" + lastname + " to lat name field" + _enterLastName);
        sendTextToElement(_enterLastName, lastname);
    }

    public void set_enterPostCode(String postCode) {
        Reporter.log("enter PostCode" + postCode + " to post code field" + _enterPostCode);
        sendTextToElement(_enterPostCode, postCode);
    }

    public void set_clickOnAddCustomerButton() {
        Reporter.log("click on addcustomer button" + _clickOnAddCustomerButton.toString());
        clickOnElement(_clickOnAddCustomerButton);
    }

    //public void d1(){driver.switchTo().alert()}
    public String verifyGetText() {
        return getTextFromAlert();
    }

    public void alertAccept1() {
        driver.switchTo().alert().accept();
    }

    /*popup display
    verify message "Customer added successfully"
    click on "ok" button on popup.
    public void contextRightClickAction(By by){
        WebElement button =driver.findElement(by);
        Actions act = new Actions(driver);
        // act.contextClick(button).build().perform();
        act.contextClick(button).perform();
    }
     */

}
