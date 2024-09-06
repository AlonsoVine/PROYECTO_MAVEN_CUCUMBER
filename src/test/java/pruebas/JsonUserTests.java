package pruebas;

import annotations.Regression;
import annotations.Smoke;
import entities.user.User;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import utilities.JsonReader;
import utilities.Logs;
import utilities.MainTest;

public class JsonUserTests extends MainTest {
    private User user;

    @BeforeEach
    public void setUp() {
        user = JsonReader.getUser();
    }

    @Test
    @Smoke
    @Description("Verificamos que el user.id sea > 0.")
    @Severity(SeverityLevel.TRIVIAL)
    public void primerTest() {
        Logs.info("Verificamos que el user.id sea > 0.");
        Assertions.assertTrue(user.getId() > 0);
        //System.out.printf("El id es: %s%n", user.getId());
    }

    @Test
    @Smoke
    @Description("verificamos que la longitud sea 71.7478")
    @Severity(SeverityLevel.MINOR)
    public void segundoTest() {
        Logs.info("verificamos que la longitud sea 71.7478");
        Assertions.assertEquals(71.7478, user.getAddress().getGeo().getLng());
        //System.out.printf("La longitud del usuario es %f%n", user.getAddress().getGeo().getLng());
    }

    @Test
    @Smoke
    @Description("verificamos que la longitud de company.bs sea > 10")
    @Severity(SeverityLevel.NORMAL)
    public void tercerTest() {
        Logs.info("verificamos que la longitud de company.bs sea > 10");
        Assertions.assertTrue(user.getCompany().getBs().length() > 10);
        //System.out.printf("El bs es: %s%n", user.getCompany().getCatchPhrase());
    }

    @Test
    @Regression
    @Description("Verificamos que los datos del Json son los esperados.")
    @Severity(SeverityLevel.BLOCKER)
    public void cuartoTest() {
        Logs.info("Verificamos que los datos del Json son los esperados.");
        Assertions.assertAll(
                () -> Assertions.assertEquals("Mrs. Dennis Schulist", user.getName()),
                () -> Assertions.assertEquals(6, user.getId()),
                () -> Assertions.assertEquals("Leopoldo_Corkery", user.getUsername()),
                () -> Assertions.assertEquals("Considine-Lockman", user.getCompany().getName())
        );
    }
}
