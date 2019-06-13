package com.cedaniel200.ejercicio2.pageobject.task;

import com.cedaniel200.ejercicio2.pageobject.model.User;
import com.cedaniel200.ejercicio2.pageobject.pages.SignonPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class Signon {

    @Steps
    private SignonPage signonPage;

    @Step("Try sign in an user")
    public void trySignon(User user) {
        signonPage.enterIntoUsername(user.getUsername());
        signonPage.enterIntoPassword(user.getPassword());
        signonPage.clickOnSignonButton();
    }

}
