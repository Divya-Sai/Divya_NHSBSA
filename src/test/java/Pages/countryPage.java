package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class countryPage {

    WebDriver driver;

    //Country Page WebElement
    @FindBy(id="radio-england")
    public WebElement radioEngland;

    @FindBy(id="radio-scotland")
    public WebElement radioScotland;

    @FindBy(id="radio-wales")
    public WebElement radioWales;

    @FindBy(id="radio-nire")
    public WebElement radioNIreland;

    @FindBy(id="radio-not-registered")
    public WebElement radionotRegistered;

    public countryPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnCountry(String countryName){
        if (countryName.equalsIgnoreCase("England")){
            radioEngland.click();
        } else if (countryName.equalsIgnoreCase("Scotland")) {
            radioScotland.click();
        } else if (countryName.equalsIgnoreCase("Wales")) {
            radioWales.click();
        } else if (countryName.equalsIgnoreCase("Northern Ireland")) {
            radioNIreland.click();
        } else if (countryName.equalsIgnoreCase("I am not registered with a dental practice")) {
            radionotRegistered.click();
        }

    }


}
