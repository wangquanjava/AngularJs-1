package com.harishkannarao.angularjs.webapp.step;

import com.harishkannarao.angularjs.webapp.page.PhoneCatalogueIndexPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import static org.testng.Assert.assertEquals;

@ApplicationScoped
public class IndexPageSteps {

    @Inject
    private PhoneCatalogueIndexPage indexPage;

    @Given("^I go to index page$")
    public void I_go_to_index_page() throws Throwable {
        indexPage.navigate();
    }

    @Then("^I should see total number of phones as (\\d+) on index page$")
    public void I_should_see_total_number_of_phones_as_on_index_page(int phoneCount) throws Throwable {
        assertEquals(indexPage.getPhoneCount(), phoneCount);
    }

    @When("^I enter query as (.*) on index page$")
    public void I_enter_query_as_on_index_page(String query) throws Throwable {
        indexPage.enterQuery(query);
    }

    @Then("^I should see the name as (.*) on index page")
    public void I_should_see_the_name_as(String expectedName) throws Throwable {
        assertEquals(indexPage.getName(), expectedName);
    }

    @Then("^I should see the title as (.*) on index page$")
    public void I_should_see_the_title_as_on_index_page(String expectedTitle) throws Throwable {
        assertEquals(indexPage.getTitle(), expectedTitle);
    }
}
