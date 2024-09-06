package principal;

import entities.Monstruo;
import entities.user.User;
import utilities.ExcelReader;
import utilities.JsonReader;
import utilities.Logs;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo cruel");

        //Prueba de escritura en los Logs
        Logs.error("Esto es un error");
        Logs.info("Soy un paso a alto nivel");
        Logs.debug("Soy un paso técnico");
        Logs.trace("Soy un paso detallado");

        //Leemos los monstruos del excel y filtramos y mostramos los de tipo fuego
        final var listaMonstruos = ExcelReader.getListaMonstruos();
        final var listaMonstruosFuego = filtrarMonstruosFuego(listaMonstruos);
        System.out.printf("La lista de Monstruos de fuego es %s%n", listaMonstruosFuego);

        //Leemos el json de user y los datos deseados.
        final User user = JsonReader.getUser();
        final var name = user.getName();
        final var username = user.getUsername();
        final var lat = user.getAddress().getGeo().getLat();
        final var lng = user.getAddress().getGeo().getLng();
        final var catchPhrase = user.getCompany().getCatchPhrase();
        System.out.printf("El usuario %s %s tiene latitud: %.3f, longitud: %.3f y catchPhrase: %s",
                name, username, lat, lng, catchPhrase);


        System.out.println("Adios mundo cruel");


    }

    //Función que recibe una lista de monstruos y filtra aquellos que son de tipo FUEGO.
    public static List<Monstruo> filtrarMonstruosFuego(List<Monstruo> listaMonstruos) {
        final var listaMonstruosFuego = new ArrayList<Monstruo>();
        for (var monstruo : listaMonstruos) {
            if (monstruo.getTipo().equals("FUEGO")) {
                listaMonstruosFuego.add(monstruo);
            }
        }
        return listaMonstruosFuego;
    }
}
