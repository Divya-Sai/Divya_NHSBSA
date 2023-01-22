package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DOBPages {

    WebDriver driver;

    //WebElements
    @FindBy(id="dob-day")
    public WebElement Day;

    @FindBy(id="dob-month")
    public WebElement Month;

    @FindBy(id="dob-year")
    public WebElement Year;

    public DOBPages(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void getDay(int day){
        Day.sendKeys(String.valueOf(day));
    }

    public void getMonth(int month){
        Month.sendKeys(String.valueOf(month));
    }
    public void getYear(int year){
        Year.sendKeys(String.valueOf(year));
    }

}
