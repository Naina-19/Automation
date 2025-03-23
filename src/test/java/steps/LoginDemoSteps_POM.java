package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import page.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginDemoSteps_POM {
    WebDriver driver=null;
    LoginPage login;
    WebDriverWait wait;

    @Given("Browser is open")
    public void browserIsOpen() {
        System.out.println(" === I am inside browser_is_open ===");
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @And("user is on login page")
    public void userIsOnLoginPage() {
        driver.navigate().to("https://practicetestautomation.com/practice-test-login/");

    }

    @When("User enters {string} and {string}")
    public void userEntersAnd(String username, String password) throws InterruptedException {
        login= new LoginPage(driver);
        login.enterUsername(username);
        login.enterPassword(password);
        Thread.sleep(2000);
    }

    @And("user clicks on login")
    public void userClicksOnLogin() {
        login.clickLogin();
    }

   /* @Then("user is navigated to the home page")
    public void userIsNavigatedToTheHomePage() throws InterruptedException {
        Assert.assertTrue(login.checkLogoutIsDisplayed());
        Thread.sleep(2000);
        driver.close();*/
        @Then("user is navigated to the home page")  // Ensure exact match
        public void userIsNavigatedToTheHomePage() throws InterruptedException {
            if (login == null) {
                login = new LoginPage(driver);
            }

            Assert.assertTrue("Login failed! Logout button not displayed.", login.checkLogoutIsDisplayed());
            Thread.sleep(2000);
            driver.close();
        }
    }

