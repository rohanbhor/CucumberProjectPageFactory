package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.MedidataHomePage;
import managers.PageObjectManager;

public class Step {

	WebDriver driver;
    MedidataHomePage medidataHomePage;
    PageObjectManager pageObjectManager;
	
	@Given("I navigate to the  Home Page {string} of Medidata website")
	public void i_navigate_to_the_Home_Page_of_Medidata_website(String string) {
		System.setProperty("webdriver.chrome.driver","D:\\\\UE7_Medidata_Training\\\\downloads\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		pageObjectManager = new PageObjectManager(driver);
		medidataHomePage = pageObjectManager.getMedidataHomePage();
		
		driver.get(string);
	}

	@Given("I move to Products Services Menu")
	public void i_move_to_Products_Services_Menu() {	    
		medidataHomePage.productsAndServicesLink.click();
	}

	@Given("click on {string} link")
	public void click_on_link(String string) {
		medidataHomePage.eConsentLink.click();
		
	}

	@Then("I should see eConsent page")
	public void i_should_see_eConsent_page() throws InterruptedException {    
		Thread.sleep(5000);
		String actual = driver.getTitle();
		String expected = "Rave eConsent | Medidata Solutions";
		org.junit.Assert.assertEquals("Assert Failed", expected, actual);
	}
	
	//////////////////////////////////////////////////////////////////////////////////

	@Given("I click on watch eConsent Webinar link")
	public void i_click_on_watch_eConsent_Webinar_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should see Webinar registation page")
	public void i_should_see_Webinar_registation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I click on watch the webcast button")
	public void i_click_on_watch_the_webcast_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I should see error message.")
	public void i_should_see_error_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I am on webinar registration page")
	public void i_am_on_webinar_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I enter First Name {string}")
	public void i_enter_First_Name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I enter Last Name {string}")
	public void i_enter_Last_Name(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I enter Business Email {string}")
	public void i_enter_Business_Email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I enter Phone Number {string}")
	public void i_enter_Phone_Number(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I enter Title {string}")
	public void i_enter_Title(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I select Level {string}")
	public void i_select_Level(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I select Functional Area {string}")
	public void i_select_Functional_Area(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I enter Company {string}")
	public void i_enter_Company(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I select Country {string}")
	public void i_select_Country(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I select the policy acceptance checkboxs")
	public void i_select_the_policy_acceptance_checkboxs() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
