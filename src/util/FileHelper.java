package util;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class FileHelper {

    static List<String> slurp(String filepath) {
        List<String> lines = null;
        try {
            Path inputPath = Paths.get(filepath);
            lines = Files.readAllLines(inputPath);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return lines;
    }

    void spit (String filename, List<String> contents, boolean append) {
//        File file = new File(filename);
        Path path = Paths.get(filename);
        String pathString = path.toString();

        if (Files.exists(path)) {
            slurp(pathString);
        } else {
            try {
                Files.createFile(path);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {

    }

}
