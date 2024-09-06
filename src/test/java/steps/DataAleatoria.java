package steps;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class DataAleatoria {
    /*
    Creamos el Given de prueba para que reconozca la clase de steps y poder crear los steps desde la feature,
    una vez creados los eliminamos.
    @Given("")
    public void prueba() {
    }*/


    private int a;
    private int b;
    private final Faker faker = new Faker();
    private int suma;
    private int producto;
    private double raizCuadrada1;
    private double raizCuadrada2;

    @Given("Genero un par de numeros int aleatorios positivos")
    public void generoUnParDeNumerosIntAleatoriosPositivos() {
        a = faker.random().nextInt(1, 50);
        b = faker.random().nextInt(1, 50);
    }


    @When("Sumo los valores.")
    public void sumoLosValores() {
        suma = a + b;
    }

    @Then("Verifico que la suma sea positiva.")
    public void verificoQueLaSumaSeaPositiva() {
        Assertions.assertTrue(suma > 0);

    }


    @When("Multiplico los valores.")
    public void multiplicoLosValores() {
        producto = a * b;

    }

    @Then("Verifico que la multiplicación sea positiva.")
    public void verificoQueLaMultiplicaciónSeaPositiva() {
        Assertions.assertTrue(producto > 0);
    }

    @When("Calculo la raiz cuadrada de los valores.")
    public void calculoLaRaizCuadradaDeLosValores() {
        raizCuadrada1 = Math.sqrt(a);
        raizCuadrada2 = Math.sqrt(b);


    }

    @Then("Verifico que la raiz cuadrada de ambos sea positiva.")
    public void verificoQueLaRaizCuadradaDeAmbosSeaPositiva() {
        Assertions.assertAll(
                () -> Assertions.assertTrue(raizCuadrada1 > 0),
                () -> Assertions.assertTrue(raizCuadrada2 > 0)
        );
    }

    @And("Imprimo {string} en consola")
    public void imprimoEnConsola(String string) {
        System.out.printf("%s", string);
        throw new io.cucumber.java.PendingException();
    }
}
