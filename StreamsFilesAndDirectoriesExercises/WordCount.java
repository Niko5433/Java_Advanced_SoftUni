package StreamsFilesAndDirectoriesExercises;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) throws IOException {

        String wordPath = "C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\words.txt";
        List<String> allLines = Files.readAllLines(Path.of(wordPath));

        Map<String, Integer> wordsCounter = new HashMap<>();

        for (String line: allLines) {
            String[] words = line.split("\\s+");
            Arrays.stream(words).forEach(word -> wordsCounter.put(word, 0));
        }

        String textPath = "C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\text.txt";
        List<String> textLines = Files.readAllLines(Path.of(textPath));

        for (String line: textLines) {
            String[] currentWord = line.split("\\s+");

            for (String word: currentWord) {
                if(wordsCounter.containsKey(word)){
                    wordsCounter.put(word, wordsCounter.get(word) + 1);
                }
            }
        }
        PrintWriter writer = new PrintWriter("results.txt");

        wordsCounter.entrySet().stream().sorted((e1, e2) -> e2.getValue().compareTo(e1.getValue())).
                forEach(entry -> writer.println(entry.getKey() + " - " + entry.getValue()));

        writer.close();

    }
}
