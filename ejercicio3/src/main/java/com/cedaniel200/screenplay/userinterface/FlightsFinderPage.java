package com.cedaniel200.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class FlightsFinderPage {

    private FlightsFinderPage() { }

    public static final Target CONTINUE_BUTTON = the("Continue button")
            .located(By.name("findFlights"));
}
