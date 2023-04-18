package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MergeTwoFiles {
    public static void main(String[] args) throws IOException {
        String pathFileOne = "C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputOne.txt";
        String pathFileTwo = "C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\inputTwo.txt";

        PrintWriter writer = new PrintWriter("merge_output.txt");

        List<String> filesOne = Files.readAllLines(Path.of(pathFileOne));
        filesOne.forEach(line -> writer.println(line));
        List<String> filesTwo = Files.readAllLines(Path.of(pathFileTwo));
        filesTwo.forEach(line -> writer.println(line));

        writer.close();


    }
}
