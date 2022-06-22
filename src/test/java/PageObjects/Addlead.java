package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.WaitHelperTest;

public class Addlead {
    public WebDriver Idriver;

    public Addlead(WebDriver rdriver) {
        Idriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }
    @FindBy(xpath = "//a[@id='dLabel']/i")
    @CacheLookup
    WebElement AddleadHeadertxt;

    @FindBy(xpath = "//div[@id='new_button']/ul/li[1]/a[@href='javascript:void(0);']")
    @CacheLookup
    WebElement AddleadOption;

    @FindBy (xpath = "//div[@id='s2id_targeting_object_id']//span[@class='select2-chosen']")
    @CacheLookup
    WebElement SelectOption;

    public void Addleadxtxt() {
    this.AddleadHeadertxt.click();
     }
    public void setAddleadOption(){
    this.AddleadOption.click();
       }
    public void selecdropdown(){
        SelectOption.isSelected();
    }



}
