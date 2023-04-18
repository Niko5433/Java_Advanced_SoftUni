package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class SumBytes {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> reader = Files.readAllLines(Path.of(path));

        long sum = 0;

        for (String line: reader) {
            for (char symbol: line.toCharArray()) {
                sum += (int) symbol;
            }
        }
        System.out.println(sum);

    }
}
