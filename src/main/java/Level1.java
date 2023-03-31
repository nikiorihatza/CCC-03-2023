import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedList;
import java.util.List;

/**
 * Created: 31.03.23
 */

public class Level1 {
    public static void main(String[] args) throws IOException {
        List<String> lines = new LinkedList<>();
        try {
            lines = Files.readAllLines(Path.of("/Users/michele/Documents/Niki/Schule/POS - 3AHIFw/CCC-03-2023/src/main/resources/level1_5.in"));
        } catch (IOException e) {
            System.out.println("Funkt nd");
        }

        int counter = 0;

        for (String line : lines) {
            for (String s : line.split("-")) {
                if (s.equals("O") || s.equals("0")) {
                    counter++;
                }
            }
        }

        System.out.println(lines);
        Files.writeString(Path.of("/Users/michele/Documents/Niki/Schule/POS - 3AHIFw/CCC-03-2023/src/main/resources/level1_5.out"), String.valueOf(counter));
    }
}
