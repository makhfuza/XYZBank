package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ManagerPage extends BasePage{

//    By openAccountButton = By.xpath("//button[contains(text(), 'Open Account')]");
//    By customerNameDrowdown = By.className("form-control");
//    By currencyDropdown = By.className("form-control");
//    By submitButton = By.xpath("//button[text()='Process']");

    By viewCustomersButton = By.xpath("//button[contains(text(), 'Customers')]");
    By searchCustomerInput = By.cssSelector("[placeholder='Search Customer']");
    By addCustomerButton = By.xpath("//button[contains(text(), 'Add Customer')]");
    By firstNameInput = By.cssSelector("[placeholder='First Name']");
    By lastNameInput = By.cssSelector("[placeholder='Last Name']");
    By postCodeInput = By.cssSelector("[placeholder='Post Code']");
    By addCustomerButton2 = By.xpath("//button[text()='Add Customer']");

    public ManagerPage(WebDriver driver){
        this.driver = driver;
    }

//    public void openAccount(){
//        driver.findElement(openAccountButton).click();
//        Select select = new Select(driver.findElement(customerNameDrowdown));
//        select.selectByVisibleText("Ron Weasly");
//        Select dropdown = new Select(driver.findElement(currencyDropdown));
//        dropdown.selectByIndex(0);
//        driver.findElement(submitButton).click();
//    }

    public void viewCustomers(){
        driver.findElement(viewCustomersButton).click();
        driver.findElement(searchCustomerInput).sendKeys("Ron");
    }

    public void addCustomer(){
        driver.findElement(addCustomerButton).click();
        driver.findElement(firstNameInput).sendKeys("Tom");
        driver.findElement(lastNameInput).sendKeys("Bruno");
        driver.findElement(postCodeInput).sendKeys("12345");
        driver.findElement(addCustomerButton2).click();
    }

}


