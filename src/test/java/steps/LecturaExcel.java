package steps;

import entities.Monstruo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import utilities.ExcelReader;

import java.util.List;

public class LecturaExcel {
    /*@Given("")
    public void prueba(){
    }*/
    private List<Monstruo> listaMonstruos;
    private int tamanoLista;
    private Monstruo monstruoActual;


    @Given("Leo la lista de productos del Excel.")
    public void leoLaListaDeProductosDelExcel() {
        //listaMonstruos = Poiji.fromExcel(new File(excelPath), Monstruo.class);
        listaMonstruos = ExcelReader.getListaMonstruos();
    }

    @When("Obtengo el elemento con index {int}.")
    public void obtengoElElementoConIndex(int indice) {
        monstruoActual = listaMonstruos.get(indice);
    }

    @Then("Verifico que el nombre sea {string} y su nivel {int}.")
    public void verificoQueElNombreSeaYSuNivel(String nombreEsperado, int nivelEsperado) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(monstruoActual.getNombre(), nombreEsperado),
                () -> Assertions.assertEquals(monstruoActual.getNivel(), nivelEsperado)
        );
    }

    @When("Obtengo el último elemento.")
    public void obtengoElÚltimoElemento() {
        monstruoActual = listaMonstruos.getLast();
    }

    @Then("Verifico que sea de género {string}.")
    public void verificoQueSeaDeGénero(String generoEsperado) {
        Assertions.assertEquals(monstruoActual.getGenero(), generoEsperado);
    }

    @When("Obtengo el tamaño de la lista.")
    public void obtengoElTamañoDeLaLista() {
        tamanoLista = listaMonstruos.size();
    }

    @Then("Verifico que la longitud de la lista sea de {int}.")
    public void verificoQueLaLongitudDeLaListaSeaDe(int tamanoEsperado) {
        Assertions.assertEquals(tamanoLista, tamanoEsperado);
    }

    /*
    @When("Obtengo el elemento con indice <index>")
    public void obtengoElElementoConIndiceIndex(int index) {
        monstruoActual = listaMonstruos.get(index);
    }*/

    @Then("Verifico que tenga {string}, {int}")
    public void verificoQueTengaNombreNivel(String nombre, int nivel) {
        Assertions.assertAll(
                () -> Assertions.assertEquals(monstruoActual.getNombre(), nombre),
                () -> Assertions.assertEquals(monstruoActual.getNivel(), nivel)
        );
    }

    @When("Obtenemos el elemento con indice <index>")
    public void obtenemosElElementoConIndiceIndex(int index) {
        monstruoActual = listaMonstruos.get(index);
    }

}
