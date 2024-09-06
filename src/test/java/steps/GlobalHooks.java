package steps;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import utilities.Logs;

public class GlobalHooks {

    @BeforeAll
    public static void masterSetup() {
        Logs.info("before all");
    }

    @AfterAll
    public static void masterTearDown() {
        Logs.info("after all");
    }
}
