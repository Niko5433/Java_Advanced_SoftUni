package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class LineNumbers {
    public static void main(String[] args) throws IOException {

        String path = "C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputLineNumbers.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));

        PrintWriter writer = new PrintWriter("output_line_numbers.txt");

        int lineCounter = 1;
        for (String line:allLines) {
            writer.println(lineCounter + ". " + line);
            lineCounter++;
        }
        writer.close();

    }
}
