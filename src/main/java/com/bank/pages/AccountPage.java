package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[@ng-click='deposit()']")
    WebElement _clickOnDepositTab;

    @CacheLookup
            @FindBy (xpath="//input[@ng-model='amount']")//1000
            WebElement _enteramount1;
    @CacheLookup
            @FindBy (xpath="//button[@class='btn btn-default']")
    WebElement _clickOnDepositButton;
    @CacheLookup
    @FindBy (xpath="//span[text()='Deposit Successful']")
    WebElement _verifymessageDepositSuccessful;

    @CacheLookup
    @FindBy (xpath="//button[@ng-class='btnClass3']")
    WebElement _ClickWithdrawlTab;

    @CacheLookup
    @FindBy (xpath="//input[@type='number']")
    WebElement _enteramount2;

    @CacheLookup
    @FindBy (xpath="//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement _clickWithdrawbutton;

    @CacheLookup
    @FindBy (xpath="//span[@class='error ng-binding']")
    WebElement _verifymessageTransactionSuccessful;
    //By.xpath("//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/span[contains(text(),'Transaction successful')]")
   public void set_clickOnDepositTab() {
       Reporter.log("click om deposite tab" + _clickOnDepositTab.toString());
               clickOnElement(_clickOnDepositTab); }

    public void set_enteramount1() {
       Reporter.log("Enter amount" + 1000 + "to amount field" +_enteramount1.toString());
       sendTextToElement(_enteramount1, "1000");}

    public void set_clickOnDepositButton(){
       Reporter.log("click on deposit button" + _clickOnDepositButton.toString());
       clickOnElement(_clickOnDepositButton);}
    public void set_verifymessageDepositSuccessful(){
       Reporter.log("verify message" + _verifymessageDepositSuccessful.toString());
       clickOnElement(_verifymessageDepositSuccessful);}
    public void set_ClickWithdrawlTab(){
        Reporter.log("click on Withdraw" + _ClickWithdrawlTab.toString());
       clickOnElement(_ClickWithdrawlTab);}

    public void set_enteramount2(){
       Reporter.log("eneter amount" + 50 +"to amount field" + _enteramount2);
       sendTextToElement(_enteramount2,"50");}
    public void set_verifymessageTransactionSuccessful(){
        Reporter.log("verify message" + _verifymessageTransactionSuccessful.toString());
       clickOnElement(_verifymessageTransactionSuccessful);}
    public void set_clickWithdrawbutton(){
        Reporter.log("verify message" + _clickWithdrawbutton.toString());
       clickOnElement(_clickWithdrawbutton);
    }
}