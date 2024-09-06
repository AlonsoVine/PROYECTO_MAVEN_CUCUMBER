package steps;

import entities.user.User;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import utilities.JsonReader;

public class LecturaJson {
    /*
    @Given("")
    public void prueba() {
    }*/
    private User user;

    @Given("Leo el Json de User.")
    public void leoElJsonDeUser() {
        user = JsonReader.getUser();
    }

    @Then("Verifico que el id sea positivo.")
    public void verificoQueElIdSeaPositivo() {
        Assertions.assertTrue(user.getId() > 0);
    }

    @Then("Verifico que la longitud sea de {double}.")
    public void verificoQueLaLongitudSeaDe(double longitudDeseada) {
        Assertions.assertEquals(user.getAddress().getGeo().getLng(), longitudDeseada);

    }

    @Then("Verifico que la longitud de company.bs sea de {int}.")
    public void verificoQueLaLongitudDeCompanyBsSeaDe(double longitudDeseada) {
        Assertions.assertEquals(user.getCompany().getBs().length(), longitudDeseada);
    }
}
