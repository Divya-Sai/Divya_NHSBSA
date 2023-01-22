package stepDefinitions;

import Pages.DOBPages;
import Pages.NHSDefaultPage;
import Pages.YesOrNoRadio;
import Pages.countryPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class steps {

    WebDriver driver;

    NHSDefaultPage nhsdefaultPage;

    countryPage country;
    YesOrNoRadio yesorno;
    DOBPages dbPages;

    WebDriverWait wait;


    @Given("User launch {string} driver")
    public void user_launch_driver(String browsername) {
        if (browsername.equalsIgnoreCase("Chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        else if (browsername.equalsIgnoreCase("Firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.manage().window().maximize();
        }
        else if (browsername.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
        }

    }

    @When("User enter NHS Paying Cost {string}")
    public void user_enter_NHS_Paying_Cost(String url) throws InterruptedException {
        driver.get(url);
        Thread.sleep(2000);
    }

    @Then("User click on Accept Cookies")
    public void user_click_on_Accept_Cookies() throws InterruptedException {
        nhsdefaultPage = new NHSDefaultPage(driver);
        nhsdefaultPage.clickOnCookie();
        Thread.sleep(2000);
    }

    @Then("User click on start Now button")
    public void user_click_on_start_Now_button() throws InterruptedException {
        nhsdefaultPage.scrollIntoView(nhsdefaultPage.btnStart);
        nhsdefaultPage.clickOnStartbtn();
        Thread.sleep(2000);
    }

    @Then("User landed on Country Page and selects {string} as Country")
    public void user_landed_on_Country_Page_and_selects_as_Country(String CName) {
        country = new countryPage(driver);
        country.clickOnCountry(CName);
    }

    @Then("User click on Next")
    public void user_click_on_Next() throws InterruptedException  {
        nhsdefaultPage.scrollIntoView(nhsdefaultPage.btnNext);
        Thread.sleep(2000);
        nhsdefaultPage.clickonNext();
    }

    @Then("User landed on GP Practise Page and slects {string}")
    public void user_landed_on_GP_Practise_Page_and_slects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("User clicks on dental practise country and selects {string}")
    public void user_clicks_on_dental_practise_country_and_selects(String dentalCountryName) {
        country = new countryPage(driver);
        country.clickOnCountry(dentalCountryName);
    }

    @Then("User enter DOB enter day {int}")
    public void user_enter_DOB_enter_day(Integer int1) throws InterruptedException {
        dbPages = new DOBPages(driver);
        dbPages.getDay(int1);
    }
    @Then("User enter DOB enter month {int}")
    public void user_enter_DOB_enter_month(Integer int2) {
        dbPages = new DOBPages(driver);
        dbPages.getMonth(int2);
    }

    @Then("User enter DOB enter Year {int}")
    public void user_enter_DOB_enter_Year(Integer int3) throws InterruptedException {
        dbPages = new DOBPages(driver);
        Thread.sleep(2000);
        dbPages.getYear(int3);
    }

    @Then("User landed on partner page and select {string}")
    public void user_landed_on_partner_page_and_select(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("User landed on tax credits page and selects {string}")
    public void user_landed_on_tax_credits_page_and_selects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("User landed on pregnant page and selects {string}")
    public void user_landed_on_pregnant_page_and_selects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("User landed on injury or illness page and selects {string}")
    public void user_landed_on_injury_or_illness_page_and_selects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("User landed on Diabetes and selects {string}")
    public void user_landed_on_Diabetes_and_selects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("User landed on affected conditions and selects {string}")
    public void user_landed_on_affected_conditions_and_selects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("User landed on glaucoma Page and selects {string}")
    public void user_landed_on_glaucoma_Page_and_selects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("user is on carhome Page and selects {string}")
    public void user_is_on_carhome_Page_and_selects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("user is on saving,investment Page and selects {string}")
    public void user_is_on_saving_investment_Page_and_selects(String message) {
        yesorno = new YesOrNoRadio(driver);
        yesorno.clickOnRadio(message);
    }

    @Then("User gets result for NHS cost")
    public void user_gets_result_for_NHS_cost() {
      driver.getPageSource();
    }

    @Then("Close the browser")
    public void close_the_browser() {
        driver.quit();
    }
}
