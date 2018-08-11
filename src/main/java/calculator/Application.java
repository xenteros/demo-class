package calculator;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        Application application = new Application();
        List<String> history = application.getHistory();
    }

    private List<String> getHistory() {
        try {
            return Files.readAllLines(Paths.get(this.getClass().getClassLoader().getResource("historia.txt").toURI()));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }
}
