package com.cedaniel200.screenplay.questions;

import com.cedaniel200.screenplay.userinterface.FlightsFinderPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Flight finder page")
public class TheHomePage implements Question<Boolean> {

    public static TheHomePage isVisible() {
        return new TheHomePage();
    }

    @Override
    public Boolean answeredBy(Actor theActor) {
        return FlightsFinderPage.CONTINUE_BUTTON.resolveFor(theActor).isVisible();
    }
}
