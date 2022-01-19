package com.mindtree.stepDefination;

import org.apache.log4j.Logger;

import com.mindtree.manager.PageObjectManager;
import com.mindtree.pageobject.LoginPage;
import com.mindtree.pageobject.SitemapPage;
import com.mindtree.utility.Logs;
import com.relevantcodes.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SitemapStepdefinition {
	 ExtentTest test;
	PageObjectManager pageManager = new PageObjectManager();
	LoginPage loginpage;
	Logs loggerUtil;
	Logger log;
	SitemapPage sitemap = new SitemapPage();
	
	@Given("User lands on homepage and click on sitemap under get in touch")
	public void user_lands_on_homepage_and_click_on_sitemap_under_get_in_touch() {
		sitemap.site();
	}

	@Then("click on cabtype")
	public void click_on_cabtype() {
	    sitemap.cabtype();
	}

	@Then("click on tataindica")
	public void click_on_tataindica() {
		sitemap.tatindica();
	}

	@Then("validate heading of the page")
	public void validate_heading_of_the_page() {
		sitemap.heading();
	}

}
