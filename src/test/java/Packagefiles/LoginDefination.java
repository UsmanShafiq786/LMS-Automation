package Packagefiles;

import PageObjects.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDefination {

    public WebDriver driver;

    public LoginPage lp;

    @Given("user launch Chrome browser")
    public void user_launch_chrome_browser() {
        System.setProperty("webdriver.chrome.driver", "E://Software/driver/chromedriver.exe");
        driver = new ChromeDriver();
        lp = new LoginPage(driver);

    }
    @When("User open the URL {string}")
    public void user_open_the_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();

    }
    @When("User enter the email as  {string} & password as {string}")
        public void user_enter_the_email_as_password_as(String email1, String pass1) {
        lp.SetTxtEmail(email1);
        lp.SetTxtPass(pass1);

    }
    @When("User click on login button")
    public void user_click_on_login_button() {
        lp.BtnSubmit();

    }

    @Then("user should be redirected to url {string}")
    public void userShouldBeRedirectedToUrl(String url1) {
        driver.get(url1);

    }

    @Then("Verify the Title should be {string}")
    public void verifyTheTitleShouldBe(String InvalidTxt12) {

        String ActualText = lp.InvalidText();
        System.out.println("Actual Text: " + ActualText);
        Assert.assertEquals(InvalidTxt12, ActualText);
        driver.close();

    }

    @And("User click on the forgot password link")
    public void userClickOnTheForgotPasswordLink() {
        lp.ForgotTxt();
    }

    @And("User click on Forgot password link")
    public void userClickOnForgotPasswordLink() {
        lp.ForgotTxt();

    }

    @Then("User redirected to the url {string}")
    public void userRedirectedToTheUrl(String url2) {
        driver.get(url2);
    }

    @And("User enter an email as {string}")
    public void userEnterAnWrongEmailAs(String Fgtemail) {
        lp.ForgotEmail(Fgtemail);
    }
    @And("User click on Reset Password button")
    public void userClickOnResetPasswordButton() {
        lp.BtnResetSubmit();
    }

    @Then("Verify the Success message {string}")
    public void verifyTheSuccessMessage(String SuccessMessage) {
        String SuccessText = lp.ForgotEmailtext();
        System.out.println("Current Text: " +SuccessText);
        Assert.assertEquals(SuccessMessage,SuccessText);

    }
    @Then("Close the browser")
    public void close_the_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.quit();
    }


    @Then("Verify the Title is {string}")
    public void verifyTheTitleIs(String ErrorText12) {
        String SuccessText1 = lp.ErrorText();
        System.out.println("Current Text: " +SuccessText1);
        Assert.assertEquals(ErrorText12,SuccessText1);
    }
}
