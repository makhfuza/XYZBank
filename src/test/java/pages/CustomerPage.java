package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v100.input.Input;
import org.openqa.selenium.support.ui.Select;

public class CustomerPage extends BasePage {

    By depositButton = By.xpath("//button[contains(text(), 'Deposit')]");
    By inputBox = By.className("form-control");

    By submitButton = By.xpath("//button[text()='Deposit']");

    By withdrawlButton = By.xpath("//button[contains(text(), 'Withdrawl')]");

    By submit2Button = By.xpath("//button[text()='Withdraw']");
    By transactionsButton = By.xpath("//button[contains(text(), 'Transactions')]");


    public CustomerPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDepositButton() {
        driver.findElement(depositButton).click();
        driver.findElement(inputBox).sendKeys("50");
        driver.findElement(submitButton).click();
    }

    public void clickWithdrawlButton() {
        driver.findElement(withdrawlButton).click();
        driver.findElement(inputBox).sendKeys("100");
        driver.findElement(submit2Button).click();
    }

    public void clickTransactionsButton(){
        driver.findElement(transactionsButton).click();
    }


}
