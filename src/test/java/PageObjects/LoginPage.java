package PageObjects;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.apache.xpath.objects.XString;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelperTest;

public class LoginPage {

    public WebDriver Idriver;
    WaitHelperTest waitHelper;

    public LoginPage(WebDriver rdriver) {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    @FindBy(id = "adminlogin")
    @CacheLookup
    WebElement TxtEmail;

    @FindBy(id = "password")
    @CacheLookup
    WebElement TxtPass;

    @FindBy(id = "submit")
    @CacheLookup
    WebElement BtnSubmit;

    @FindBy(xpath = "//*[@id=\"show_error\"]")
    @CacheLookup
    WebElement Invalidtxt;

    @FindBy (xpath = "//*[@id=\"forgot_password\"]/div[1]/div")
    @CacheLookup
    WebElement Forgottext1;

    @FindBy(xpath = "//*[@id=\"frm_login\"]/div[3]/div/span")
    @CacheLookup
    WebElement ForgotTxt;

    @FindBy(id = "email")
    @CacheLookup
    WebElement ForgotEmail;

    @FindBy(id = "show_success")
    @CacheLookup
    WebElement ForgotScuccessMsg;

    @FindBy(id= "submit_button")
    @CacheLookup
    WebElement ResetButton;


    public void SetTxtEmail(String email) {
        TxtEmail.clear();
        TxtEmail.sendKeys(email);
    }
    public void SetTxtPass(String pass) {
        TxtPass.clear();
        TxtPass.sendKeys(pass);
    }
    public void BtnSubmit()
    {
       // waitHelper.WaitForElement(BtnSubmit,30);
        this.BtnSubmit.click();
    }
    public String InvalidText()
    {
       return Invalidtxt.getText();
    }
    public void ForgotTxt()
    {
        ForgotTxt.click();
    }
    public void ForgotEmail(String email1) {
        ForgotEmail.clear();
        ForgotEmail.sendKeys(email1);
    }
    public String ForgotEmailtext()
    {
       return ForgotScuccessMsg.getText();
    }
    public void BtnResetSubmit()
    {
        ResetButton.click();
    }
    public String ErrorText(){
       return Forgottext1.getText();
    }
}
