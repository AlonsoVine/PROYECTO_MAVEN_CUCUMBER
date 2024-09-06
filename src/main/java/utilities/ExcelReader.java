package utilities;

import com.poiji.bind.Poiji;
import entities.Monstruo;

import java.io.File;
import java.util.List;

public class ExcelReader {
    private static final String excelPath = "src/main/resources/data/dataExcel.xlsx";

    public static List<Monstruo> getListaMonstruos() {
        Logs.debug("Obteniendo la lista e monstruos del excel");
        return Poiji.fromExcel(new File(excelPath), Monstruo.class);
    }
}
