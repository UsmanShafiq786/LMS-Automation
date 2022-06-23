package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.security.cert.X509Certificate;
import java.util.List;

public class Smokesuit {
    public WebDriver IDriver;

    public Smokesuit (WebDriver rdriver){
        IDriver = rdriver;
        PageFactory.initElements(rdriver,this);
    }

    @FindBy(xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']//i[@class='fa fa-database']")
    @CacheLookup
    WebElement Department;

    @FindBy (className = "//ul[@class='sub-menu department-submenu']")
    @CacheLookup
    List<WebElement> Department1;

//    @FindBy (xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']/li/ul/li[1]/a[@href='javascript:void(0);']")
//    @CacheLookup
//    WebElement Department1;

    @FindBy (xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']/li/ul/li[2]/a[@href='javascript:void(0);']/span[@class='title']")

    @CacheLookup
    WebElement Department2;

    @FindBy(xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']/li/ul/li[3]/a[@href='javascript:void(0);']/span[@class='title']")
    @CacheLookup
    WebElement Department3;

    @FindBy(xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']/li/ul/li[4]/a[@href='javascript:void(0);']/span[@class='title']")
    @CacheLookup
    WebElement Department4;

    @FindBy(xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']/li/ul/li[5]/a[@href='javascript:void(0);']/span[@class='title']")
    @CacheLookup
    WebElement Department5;

    @FindBy(xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']/li/ul/li[6]/a[@href='javascript:void(0);']/span[@class='title']")
    @CacheLookup
    WebElement Department6;

    @FindBy(xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']/li/ul/li[6]/a[@href='javascript:void(0);']/span[@class='title']")
    @CacheLookup
    WebElement Department7;

    @FindBy(xpath = "//div[@id='main-menu-wrapper']/ul[@class='department-menu']/li/ul/li[6]/a[@href='javascript:void(0);']/span[@class='title']")
    @CacheLookup
    List<WebElement>  Abc;




    public void DepartmentText(){
        Department.click();
    }
 public void DepartmentText1(int index1) throws InterruptedException {

        Thread.sleep(3000);
        WebElement title = Department1.get(index1);
     System.out.println("Title is: " +title.getText());
        title.click();
 }
 public void DepartmentText2(){
         Department2.click();
    }
 public void DepartmentText3(){
        Department3.click();
    }
 public void DepartmentText4(){
        Department4.click();
    }
 public void DepartmentText5(){
        Department5.click();
    }
 public void DepartmentText6(){
        Department6.click();
    }
 public void DepartmentText7(){
        Department7.click();
    }
}
