package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
    WebDriver driver;
    public loginPage(WebDriver driver)//constructor
    {
        this.driver=driver;
    }
    public void enterUserName(String userName)
    {
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
    }
    public void enterPassword(String password){
        driver.findElement(By.id("txtPassword")).sendKeys(password);
    }
    public void clicksignIn(){
        driver.findElement(By.id("btnLogin")).click();
    }
}
