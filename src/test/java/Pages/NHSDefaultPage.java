package Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NHSDefaultPage {

    WebDriver driver;

    //WebElements
    @FindBy(id="nhsuk-cookie-banner__link_accept_analytics")
    private WebElement btnAcceptCookies;

    @FindBy(xpath="//input[@id='next-button']")
    public WebElement btnStart;

    @FindBy(id="next-button")
    public WebElement btnNext;

    public NHSDefaultPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnCookie(){
        btnAcceptCookies.click();
    }

    public void scrollIntoView(WebElement WebElement)  {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    //This will scroll the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", WebElement);
    }

    public void clickOnStartbtn(){
        btnStart.click();
    }

    public void clickonNext(){
        btnNext.click();
    }


}
