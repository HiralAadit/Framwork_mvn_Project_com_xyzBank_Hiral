package com.bank.testsuite;

import com.bank.customlisteners.CustomListners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListners.class)
public class BankTest extends BaseTest {
    AccountPage accountPage;
    AddCustomerPage addCustomerPage;
    BankManagerLoginPage bankManagerLoginPage;
    CustomerLoginPage customerLoginPage;
    CustomersPage customersPage;
    HomePage homePage;
    OpenAccountPage openAccountPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        addCustomerPage = new AddCustomerPage();
        accountPage = new AccountPage();
        customerLoginPage = new CustomerLoginPage();
        openAccountPage = new OpenAccountPage();
    }

    @Test(groups = {"smoke","regression"})
    public void bankManagerShouldAddCustomerSuccessfully() {

        addCustomerPage.set_ClickOnBankManagerLogin();
        addCustomerPage.set_clickOnAddCustomerTab();
        addCustomerPage.set_enterFirstName("Harry");
        addCustomerPage.set_enterLastName("Potter");
        addCustomerPage.set_enterPostCode("010101");
        addCustomerPage.set_clickOnAddCustomerButton();
        String expectedMessage = "Customer added successfully with customer id :6";
        Assert.assertEquals(addCustomerPage.verifyGetText(), expectedMessage, "Message is not displayed");
        addCustomerPage.alertAccept1();
    }

    @Test(groups = {"sanity","regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        addCustomerPage.set_ClickOnBankManagerLogin();
        openAccountPage.set_clickOnOpenAccountTab();
        openAccountPage.set_SearchCustomer();
        openAccountPage.set_SelectCurrency();
        openAccountPage.set_clickOnProcessButton();
//openAccountPage.
        String expectedMessage2 = "Account created successfully with account Number :1016";
        Assert.assertEquals(openAccountPage.verifyGetText1(), expectedMessage2, "Message is not displayed");
        openAccountPage.alertAccept1();
        // click on "ok" button on popup.
        openAccountPage.alertAccept1();
    }

    @Test(groups = {"regression"})
    public void customerShouldLoginAndLogoutSuceessfully() {
        customerLoginPage.set_clickOnCustomerLogin();
        customerLoginPage.set_serchCreateCustomer();
        customerLoginPage.set_clickOnLoginButton();
        customerLoginPage.set_verifyLogoutTab();

    }

    @Test(groups = {"regression"})
    public void customerShouldDepositMoneySuccessfully() {
        customerLoginPage.set_clickOnCustomerLogin();
        customerLoginPage.set_serchCreateCustomer();
        customerLoginPage.set_clickOnLoginButton();
        accountPage.set_clickOnDepositTab();
        accountPage.set_enteramount1();
        accountPage.set_clickOnDepositButton();
        accountPage.set_verifymessageDepositSuccessful();
    }

    @Test(groups = {"regression"})
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        customerLoginPage.set_clickOnCustomerLogin();
        customerLoginPage.set_serchCreateCustomer();
        customerLoginPage.set_clickOnLoginButton();
        accountPage.set_ClickWithdrawlTab();
        accountPage.set_enteramount2();
        accountPage.set_clickWithdrawbutton();
        Thread.sleep(1000);
        accountPage.set_verifymessageTransactionSuccessful();

    }
}
