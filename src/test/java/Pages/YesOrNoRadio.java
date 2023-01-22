package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YesOrNoRadio {

    WebDriver driver;

    //WebElements
    @FindBy(id="radio-yes")
    public WebElement radioYes;

    @FindBy(id="radio-no")
    public WebElement radioNo;

    public YesOrNoRadio(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnRadio(String radiobutton){
        if (radiobutton.equalsIgnoreCase("Yes")){
            radioYes.click();
        } else if (radiobutton.equalsIgnoreCase("No")) {
            radioNo.click();
        }
    }
}
