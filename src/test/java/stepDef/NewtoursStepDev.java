package stepDef;

import base.BaseUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.NewtoursFlightFinderPage;
import pages.NewtoursHomePage;
import pages.NewtoursRegisterConfirmationPage;
import pages.NewtoursRegisterPage;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class NewtoursStepDev extends BaseUtil {
    private BaseUtil base;
    public NewtoursStepDev(BaseUtil base){
        this.base = base;
    }

    @Given("I am on the Newtours Home page")
    public void i_am_on_the_newtours_home_page() {
        base.driver.manage().window().maximize();
        base.driver.get("https://demo.guru99.com/selenium/newtours\n");
    }
    @When("I click on the Flights link on the left side menu")
    public void i_click_on_the_flights_link_on_the_left_side_menu() {
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.ClickOnFlightsLink();
    }
    @Then("The Flight Finder Page should be displayed")
    public void the_flight_finder_page_should_be_displayed() {
        NewtoursFlightFinderPage newtoursFlightFinderPage = new NewtoursFlightFinderPage(base.driver);
        assertThat(newtoursFlightFinderPage.IsFlightDetailsPageDisplayed(), equalTo(true));
    }
    @Then("“One Way” Flight details type is selected by default")
    public void one_way_flight_details_type_is_selected_by_default() {
        NewtoursFlightFinderPage newtoursFlightFinderPage = new NewtoursFlightFinderPage(base.driver);
        assertThat(newtoursFlightFinderPage.IsRoundTripSelected(), equalTo(true));
    }
    @Then("“January {int}” should be displayed by default for On and returning")
    public void january_should_be_displayed_by_default_for_on_and_returning(int int1) {
        NewtoursFlightFinderPage newtoursFlightFinderPage = new NewtoursFlightFinderPage(base.driver);
        assertThat(newtoursFlightFinderPage.GetDefaultFromMonth(), equalTo("July"));
        assertThat(newtoursFlightFinderPage.GetDefaultFromDay(), equalTo("12"));
    }
    @Then("“Economy Class” should be selected as default for the Service class")
    public void economy_class_should_be_selected_as_default_for_the_service_class() {
        NewtoursFlightFinderPage newtoursFlightFinderPage = new NewtoursFlightFinderPage(base.driver);
        assertThat(newtoursFlightFinderPage.IsEconomyClassSeelctedByDefault(), equalTo(true));
    }

    @When("I click on the Register link")
    public void i_click_on_the_register_link() {
        NewtoursHomePage newtoursHomePage = new NewtoursHomePage(base.driver);
        newtoursHomePage.ClickOnRegisterLink();

    }
    @When("I enter {string}, password and confirm as {string}")
    public void i_enter_password_and_confirm_as(String username, String password) {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.enterUserName(username);
        newtoursRegisterPage.enterPassword(password);
        newtoursRegisterPage.enterConfirmPassword(password);

    }
    @When("enter {string}")
    public void enter(String countryName) {
       NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
       newtoursRegisterPage.selectCountry(countryName);
    }
    @When("I click submit button")
    public void i_click_submit_button() {
        NewtoursRegisterPage newtoursRegisterPage = new NewtoursRegisterPage(base.driver);
        newtoursRegisterPage.clickOnSubmitButton();
    }
    @Then("confirmation page is displayed with my {string}")
    public void confirmation_page_is_displayed_with_my(String username) {
        NewtoursRegisterConfirmationPage newtoursRegisterConfirmationPage = new NewtoursRegisterConfirmationPage(base.driver);
        System.out.println(newtoursRegisterConfirmationPage.getNoteMsg());
        assertThat(newtoursRegisterConfirmationPage.getNoteMsg().contains(username),equalTo(true ));
    }


}
