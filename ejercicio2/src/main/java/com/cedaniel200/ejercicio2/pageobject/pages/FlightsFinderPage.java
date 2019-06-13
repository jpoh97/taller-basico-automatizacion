package com.cedaniel200.ejercicio2.pageobject.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FlightsFinderPage extends PageObject {

    @FindBy(name = "findFlights")
    private WebElement continueButton;

    @Step("Validate button visible")
    public boolean isContinueButtonVisible() {
        return continueButton.isDisplayed();
    }
}
