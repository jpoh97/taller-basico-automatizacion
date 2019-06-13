package com.cedaniel200.screenplay.tasks;

import com.cedaniel200.screenplay.model.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.cedaniel200.screenplay.userinterface.LoginPage.PASSWORD;
import static com.cedaniel200.screenplay.userinterface.LoginPage.USERNAME;
import static com.cedaniel200.screenplay.userinterface.LoginPage.LOGIN_BUTTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Authenticate implements Task {

    private final User user;

    public Authenticate(User user) {
        this.user = user;
    }

    public static Authenticate the(User user) {
        return instrumented(Authenticate.class, user);
    }

    public static Authenticate an(User user) {
        return instrumented(Authenticate.class, user);
    }

    @Override
    public <T extends Actor> void performAs(T theActor) {
        theActor.attemptsTo(
                Enter.theValue(user.name()).into(USERNAME),
                Enter.theValue(user.password()).into(PASSWORD),
                Click.on(LOGIN_BUTTON)
        );
    }
}
