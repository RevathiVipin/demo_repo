package stepdefinition;

import init.Intialize;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Basepage;
import pages.login_page;

public class Loginstepss {

	@Given("Launch Facebook on browser")
	public void launch_facebook_on_browser() {
		Intialize init = new Intialize();
		init.BrowserIntialize();
	}

	@When("validate page title")
	public void validate_page_title() {
	
	}

	@Then("validate page content")
	public void validate_page_content() {
	    
	}
	@Then("validate placeholder")
	public void validate_placeholder() {
	    
	}

	@When("Enter username as {string} and password as {string}")
	public void loginCredentials(String username , String password) {
		login_page loginpage = new login_page();
		loginpage.login_credentials(username, password);
	    
	}

	@Then("Click on login button")
	public void click_on_login_button() {
		login_page loginpage = new login_page();
		loginpage.submit();
	}

	@Then("Terminate browser")
	public void terminate_browser() {
	}


}
