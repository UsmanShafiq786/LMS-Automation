package Packagefiles;

import PageObjects.Addlead;
import PageObjects.LoginPage;
import PageObjects.Smokesuit;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddleadDefination {
    public WebDriver driver;
    public Addlead Al;
    public LoginPage lp;

    public Smokesuit SS;


    @Then("User click on Create lead option")
    public void user_click_on_create_lead_option() {

        Al.setAddleadOption();
    }

    @Then("User click on plus icon from header on dashboard url {string}")
    public void userClickOnPlusIconFromHeader(String url) {
        Al.Addleadxtxt();

    }



    @When("User is successfully logged in with email {string} & password as {string} on {string}")
    public void user_enter_the_email_as_password_as(String email1, String pass1, String url) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E://Software/driver/chromedriver.exe");
        driver = new ChromeDriver();

        lp = new LoginPage(driver);
        Al = new Addlead(driver);
        SS = new Smokesuit(driver);

        driver.get(url);
        driver.manage().window().maximize();
        Actions at = new Actions(driver);
        at.sendKeys(Keys.PAGE_DOWN).build().perform();

        lp.SetTxtEmail(email1);
        lp.SetTxtPass(pass1);
        lp.BtnSubmit();
        Thread.sleep(2000);
    }

    @And("Click on Department icon")
    public void clickOnDepartmentIcon() {
            SS.DepartmentText();

    }

    @Then("User click on CPML {string} Department")
    public void user_click_on_cpml_department(int index) throws InterruptedException {
     // String titleof =   SS.DepartmentText1(index).getText();
       // System.out.println("Title is: " +titleof);
            SS.DepartmentText1(index);
            Thread.sleep(5000);

    }
    @Then("User click on Project Advertising Department")
    public void userClickOnProjectAdvertisingDepartment() {
            SS.DepartmentText2();
    }
    @Then("User click on Partner Department")
    public void userClickOnPartnerDepartment()  {
             SS.DepartmentText3();
    }

    @Then("User click on Secondary Department")
    public void user_click_on_secondary_department()  {
            SS.DepartmentText4();
    }

    @Then("User click on Olx Department")
    public void user_click_on_olx_department()  {
            SS.DepartmentText5();
    }

    @Then("User click on OLX RE Department")
    public void userClickOnOLXREDepartment() {
            SS.DepartmentText6();
    }

    @Then("User click on OLX Auto Inspection Department")
    public void userClickOnOLXAutoInspectionDepartment() {
            SS.DepartmentText7();
    }
}
