package tests;

import org.testng.annotations.Test;
import pages.CustomerPage;
import pages.LoginPage;

public class CustomerTest extends BaseTest{

    @Test
    public void testCustomerCanMakeDeposit(){
        logger.info("############## Test Case: Make Deposit as customer");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerPage customer = new CustomerPage(driver);
        customer.clickDepositButton();
        textExists("Deposit Successful");
    }

    @Test
    public void testCustomerCanWithdraw() {
        logger.info("####### Test Case: Withdraw from account");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerPage account = new CustomerPage(driver);
        CustomerPage customer = new CustomerPage(driver);
        customer.clickWithdrawlButton();
        textExists("Transaction Failed. You can not withdraw amount more than the balance.");
    }

    @Test
    public void testCustomerViewTransactions(){
        logger.info("############## Test Case: View Transactions as Customer");
        LoginPage login = new LoginPage(driver);
        login.customerLogin();
        CustomerPage customer = new CustomerPage(driver);
        customer.clickTransactionsButton();
        textExists("Amount");
    }
}
