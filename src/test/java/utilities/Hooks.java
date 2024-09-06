package utilities;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

public class Hooks {

    @BeforeAll
    public static void beforeAllHook() {
        Logs.info("Yo me ejecuto al principio del todo");
    }

    @Before
    public static void beforeHook() {
        Logs.info("Yo me ejecuto al principio de cada escenario");
    }

    @After
    public static void afterHook(Scenario scenario) {
        Logs.info("Yo me ejecuto al final, el resultado es %s.", scenario.getStatus());
    }

    @AfterAll
    public static void afterAllHook() {
        Logs.info("Yo me ejecuto al final del todo");
    }
}
