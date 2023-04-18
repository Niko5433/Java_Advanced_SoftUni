package StreamsFilesAndDirectoriesLab;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String[] args) throws IOException {
        String basePath = "C:\\Users\\nikol\\Desktop\\04. Java-Advanced-Files-and-Streams-Lab-Resources";
        String pathInput = basePath + "\\input.txt";
        String pathOutput = basePath + "\\output.txt";

        List<Character> punctuation = Arrays.asList(',', '.', '!', '?');

        OutputStream outputStream = new FileOutputStream(pathOutput);

        try (InputStream inputStream = new FileInputStream(pathInput)) {
            int readByte = inputStream.read();
            while (readByte >= 0) {

                if (!punctuation.contains((char)readByte)) {
                    outputStream.write(readByte);
                }

                readByte = inputStream.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        outputStream.close();
    }
}
