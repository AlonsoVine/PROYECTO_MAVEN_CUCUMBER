package utilities;

import com.fasterxml.jackson.databind.ObjectMapper;
import entities.user.User;

import java.io.File;
import java.io.IOException;

public class JsonReader {
    private static final String jsonPath = "src/main/resources/data/user.json";

    public static User getUser() {
        final var objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(new File(jsonPath), User.class);
        } catch (IOException ioException) {
            Logs.error("IOException: %s", ioException.getLocalizedMessage());
            throw new RuntimeException();   //Tira la app, ya que no se leyó el Json.
        }
    }
}
