package com.cedaniel200.screenplay.stepdefinitions;

import com.cedaniel200.screenplay.questions.TheHomePage;
import com.cedaniel200.screenplay.tasks.Authenticate;
import com.cedaniel200.screenplay.tasks.Register;
import com.cedaniel200.screenplay.userinterface.HomePage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static com.cedaniel200.screenplay.model.UserBuilder.userDefault;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AuthenticateStepDefinitions {

    private static final String CESAR = "Cesar";
    private HomePage homePage;

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Cesar is in mercury tours$")
    public void iAmInMercuryTours() {
        theActorCalled(CESAR).wasAbleTo(
                Open.browserOn(homePage),
                Register.the(userDefault())
        );
    }

    @When("^Cesar is authenticated$")
    public void iAuthenticate() {
        theActorInTheSpotlight().attemptsTo(
                Authenticate.the(userDefault())
        );
    }

    @Then("^Cesar should see the home page$")
    public void iShouldSeeTheHomePage() {
        theActorInTheSpotlight().should(seeThat(TheHomePage.isVisible()));
    }
}
