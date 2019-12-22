package com.stepdef;

import org.testng.Assert;

import com.common.Base23;
import com.ee.page.MyhomePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Searchdef extends Base23 {
	MyhomePage  hp;
	
	
	
	
	@Given("^user on the home page of ebay$")
	public void user_on_the_home_page_of_ebay() throws Throwable {
		
		
		driver=getDriver();
	
	}

	@When("^user type books$")
	public void user_type_books() throws Throwable {
		hp= new MyhomePage(driver);
		hp.type().sendKeys("books");

	}

	@When("^user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		hp.cl().click();

	}

	@When("^user click on paperback$")
	public void user_click_on_paperback() throws Throwable {
		hp.pb().click();

	}

	@When("^user click on southern keto$")
	public void user_click_on_southern_keto() throws Throwable {
		hp.sl().click();

	}

	@When("^user click on add to watchlist$")
	public void user_click_on_add_to_watchlist() throws Throwable {
hp.wl().click();
	}

	@Then("^user should be successful$")
	public void user_should_be_successful() throws Throwable {
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
