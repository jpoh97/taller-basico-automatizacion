package com.cedaniel200.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.targets.Target.the;

public class LoginPage {

    private LoginPage() { }

    public static final Target USERNAME = the("username field").located(By.name("userName"));
    public static final Target PASSWORD = the("password field").located(By.name("password"));
    public static final Target LOGIN_BUTTON = the("username field").located(By.name("login"));

}
