package pruebas;

import annotations.Regression;
import annotations.Smoke;
import entities.Monstruo;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import utilities.ExcelReader;
import utilities.Logs;
import utilities.MainTest;

import java.util.List;

public class ExcelMonstruoTests extends MainTest {
    private List<Monstruo> listaMonstruos;

    @BeforeEach
    public void setUp() {
        listaMonstruos = ExcelReader.getListaMonstruos();
    }

    @Test
    @Smoke
    @Description("Verificamos que el primer nombre es TOLOSA.")
    @Severity(SeverityLevel.MINOR)
    public void primerTest() {
        Logs.info("Verificamos que el primer nombre es TOLOSA.");
        Assertions.assertEquals(listaMonstruos.getFirst().getNombre(), "TOLOSA");

    }

    @Test
    @Smoke
    @Description("Verificamos la longitud de la lista.")
    @Severity(SeverityLevel.NORMAL)
    public void segundoTest() {
        Logs.info("Verificamos la longitud de la lista.");
        Assertions.assertEquals(listaMonstruos.size(), 14);
        //System.out.printf("La longitud de la lista es de %d%n", listaMonstruos.size());
    }

    @Test
    @Smoke
    @Description("Verificamos que el tercer nivel sea de 22")
    @Severity(SeverityLevel.TRIVIAL)
    public void tercerTest() {
        Logs.info("Verificamos que el tercer nivel sea de 22");
        Assertions.assertEquals(listaMonstruos.get(2).getNivel(), 22);
        //System.out.printf("El tercer nivel es: %s%n", listaMonstruos.get(2).getNivel());
    }

    @Test
    @Smoke
    @Regression
    @Disabled("Este test está desactivado")
    @Description("Verificamos que el tercer tipo sea de FUEGO")
    @Severity(SeverityLevel.BLOCKER)
    public void cuartoTest() {
        Logs.info("Verificamos que el tercer tipo sea de FUEGO");
        Assertions.assertEquals(listaMonstruos.get(2).getTipo(), "FUEGO");
        //System.out.printf("El tercer tipo es: %s%n", listaMonstruos.get(2).getTipo());
    }

    @Test
    @Regression
    @Description("Verificamos que el último elemento tenga los datos deseados.")
    @Severity(SeverityLevel.NORMAL)
    public void quintoTest() {
        Logs.info("Verificamos que el último elemento tenga los datos deseados.");
        Assertions.assertAll(
                () -> Assertions.assertEquals("LUCENA", listaMonstruos.getLast().getNombre()),
                () -> Assertions.assertEquals(3, listaMonstruos.getLast().getEdad()),
                () -> Assertions.assertEquals(8.57, listaMonstruos.getLast().getPeso()),
                () -> Assertions.assertEquals("MACHO", listaMonstruos.getLast().getGenero()),
                () -> Assertions.assertEquals("PLANTA", listaMonstruos.getLast().getTipo()),
                () -> Assertions.assertEquals(36, listaMonstruos.getLast().getNivel())
        );
    }
}
