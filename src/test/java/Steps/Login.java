package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;


public class Login {

    WebDriver driver = null;

    @Given("^I navigate to the login page$")
    public void loginPageNavigation () {
        driver = new ChromeDriver();
        driver.navigate().to("http://automationpractice.com");
    }

    @When("^I enter username and password$")
    public void enteringUserCredentials () {
        driver.findElement(By.xpath("//*[contains(@class, 'login')]")).click();
        driver.findElement(By.id("email")).sendKeys("automationtesting@yahoo.com");
        driver.findElement(By.id("passwd")).sendKeys("Password123");
    }


    @And("^I click login button$")
    public void clickingLoginButton () {
        driver.findElement(By.id("SubmitLogin")).click();
            System.out.println("Submit button has been clicked");

    }


    @Then("^User Login is successful$")
    public void successfulLogin() {
       // var pageTitle = driver.getTitle();
        driver.getTitle();
        if(driver.findElement(By.xpath("//a[@title='My Store']")).isDisplayed())
                System.out.print("My Store Page has been displayed");
            else
                System.out.println("Landing Page incorrect");

        if (driver.findElement(By.xpath(".//a[@href='http://automationpractice.com/index.php?controller=my-account']//span[contains(text(), 'Test User')]")).isDisplayed());
            System.out.print("Login Successful");
        driver.close();
    }
}
