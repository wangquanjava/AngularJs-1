package com.harishkannarao.angularjs.webapp.step;

import com.harishkannarao.angularjs.webapp.page.UserDetailsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.testng.Assert.*;

@ApplicationScoped
public class UserDetailsPageSteps {

    @Inject
    private UserDetailsPage userDetailsPage;

    @And("^I go to user details page$")
    public void iGoToUserDetailsPage() throws Throwable {
        userDetailsPage.navigate();
    }

    @Then("^I should be on user details page$")
    public void iShouldBeOnUserDetailsPage() throws Throwable {
        assertTrue(userDetailsPage.isOnValidPage(), "Is not on User Details page");
    }

    @And("^I should see Username as \"([^\"]*)\"$")
    public void iShouldSeeUsernameAs(String userName) throws Throwable {
        assertEquals(userDetailsPage.getUserName(), userName);
    }

    @And("^I should see some auth token$")
    public void iShouldSeeSomeAuthToken() throws Throwable {
        String authToken = userDetailsPage.getAuthToken();
        assertNotNull(authToken);
        assertFalse(authToken.trim().isEmpty());
    }

    @And("^I should see roles as \"([^\"]*)\"$")
    public void iShouldSeeRolesAs(String expectedRoles) throws Throwable {
        List<String> expectedRoleList = Arrays.asList(expectedRoles.split(","));
        List<String> sortedExpectedRoleList = expectedRoleList.stream().sorted().collect(Collectors.toList());
        List<String> actualRoleList = userDetailsPage.getRoles();
        List<String> sortedActualRoleList = actualRoleList.stream().sorted().collect(Collectors.toList());
        assertEquals(sortedActualRoleList, sortedExpectedRoleList);
    }
}
