package tests;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ManagerPage;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ManagerTest extends BaseTest {


//    @Test
//    public void testOpenAccount() {
//        logger.info("############# Test: Open Account #############");
//        LoginPage login = new LoginPage(driver);
//        login.managerLogin();
//        ManagerPage manager = new ManagerPage(driver);
//        manager.openAccount();
//        Alert alert = driver.switchTo().alert();
//        String alertMessage = alert.getText();
//        System.out.println(alertMessage);
//        Assert.assertTrue(alertMessage.contains("Account created successfully with account Number :1016"));
//        alert.accept();
//    }

    @Test
    public void testViewCustomers(){
        logger.info("############# Test: Find customer #############");
        LoginPage login = new LoginPage(driver);
        ManagerPage manager = new ManagerPage(driver);
        login.managerLogin();
        manager.viewCustomers();
        textExists("1007");
    }

    @Test
    public void testAddCustomer() {
        logger.info("############# Test: Add customer #############");
        LoginPage login = new LoginPage(driver);
        ManagerPage manager = new ManagerPage(driver);
        login.managerLogin();
        manager.addCustomer();
        Alert alert = driver.switchTo().alert();
        String alertMessage = alert.getText();
        System.out.println(alertMessage);
        Assert.assertTrue(alertMessage.contains("Customer added successfully"));
        alert.accept();
    }

    }
