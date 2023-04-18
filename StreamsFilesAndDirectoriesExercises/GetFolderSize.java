package StreamsFilesAndDirectoriesExercises;

import java.io.File;

public class GetFolderSize {
    public static void main(String[] args) {
        String path = "C:\\Users\\nikol\\Desktop\\JavaAdvanced\\04. Java-Advanced-Files-and-Streams-Exercises-Resources\\Exercises Resources";

        File folder = new File(path);

        File[] allFiles = folder.listFiles();

        int sizeFolder = 0;

        for (File file: allFiles) {
            sizeFolder += file.length();
        }
        System.out.println("Folder size: " + sizeFolder);
    }
}
