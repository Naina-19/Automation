package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private By txt_username= By.id("username");
    private By txt_password= By.id("password");
    private By btn_login= By.id("submit");
    private By btn_logout= By.linkText("Log out");

            public LoginPage(WebDriver driver){
        this.driver=driver;
        if(!driver.getTitle().toLowerCase().contains("login")){
            throw new IllegalStateException("This is not Login page.The current page is " +driver.getCurrentUrl());
        }
    }
    public void enterUsername(String username){
                driver.findElement(txt_username).sendKeys(username);
            }

            public void enterPassword(String password){
                driver.findElement(txt_password).sendKeys(password);
            }
            public void clickLogin(){
                driver.findElement(btn_login).click();
            }
            public boolean checkLogoutIsDisplayed(){
                return driver.findElement(btn_logout).isDisplayed();
            }
            public void loginValidUser(String username,String password){
                driver.findElement(txt_username).sendKeys(username);
                driver.findElement(txt_password).sendKeys(password);
                clickLogin();

            }
}
