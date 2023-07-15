package google.stepdefinitions;

import general.navigation.NavigateTo;
import google.search.GoogleForCFOInfo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import google.search.GoogleSearchResults;

public class GoogleSearchStepDefinitions {
    @Given("{actor} is searching for the CFO of a company on google.com")
    public void open_google(Actor actor) {
        actor.wasAbleTo(NavigateTo.theGoogleHomePage());
    }

    @When("{actor} look up CFO info for {string}")
    public void searches_for(Actor actor, String companyName) {
        actor.attemptsTo(
                GoogleForCFOInfo.about(companyName + " CFO"));
    }

    @Then("{actor} should see CFO info about {string}")
    public void should_see_information_about(Actor actor, String companyName) {
        actor.attemptsTo(
                Ensure.that(GoogleSearchResults.GENERAL_RESULT__DESCRIPTION).hasText(companyName));
    }
}
