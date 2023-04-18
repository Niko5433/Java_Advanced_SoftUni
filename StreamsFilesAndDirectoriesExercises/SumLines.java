package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumLines {
    public static void main(String[] args) throws IOException {

        String path ="C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> reader = Files.readAllLines(Path.of(path));

        for (String line : reader) {
            int sum = 0;
            for (char symbol: line.toCharArray()) {
                sum += (int) symbol;
            }
            System.out.println(sum);
        }

    }
}
