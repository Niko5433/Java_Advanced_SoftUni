package StreamsFilesAndDirectoriesExercises;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\input.txt";

        List<String> allLines = Files.readAllLines(Path.of(path));
        int sumVowels =0;
        int sumOtherSymbols = 0;
        int sumPunctuation = 0;

        Set<Character> vowels = getVowels();
        Set<Character> punctuationMarks = getPunctuationMarks();

        for (String line: allLines) {
            for (int i = 0; i < line.length(); i++) {
                char currentSymbol = line.charAt(i);
                if (currentSymbol == ' '){
                    continue;
                }
                if (vowels.contains(currentSymbol)){
                    sumVowels++;
                } else if (punctuationMarks.contains(currentSymbol)){
                    sumPunctuation++;
                } else {
                    sumOtherSymbols++;
                }
            }
        }
        BufferedWriter writer = new BufferedWriter(new FileWriter("output_task_4.txt"));
        writer.write("Vowels: " + sumVowels);
        writer.newLine();
        writer.write("Other symbols: " + sumOtherSymbols);
        writer.newLine();
        writer.write("Punctuation: " + sumPunctuation);
        writer.close();

    }

    private static Set<Character> getPunctuationMarks() {
        Set<Character> marks = new HashSet<>();
        marks.add('!');
        marks.add(',');
        marks.add('.');
        marks.add('?');
        return marks;
    }

    private static Set<Character> getVowels() {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        return vowels;
    }
}
