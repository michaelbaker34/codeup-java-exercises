package util;

import java.io.*;
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

    static void spit (String filename, List<String> contents, boolean append) {
//        Path path = Paths.get(filename);
//        String pathString = path.toString();
        Path testPath = Paths.get("src", "util", filename);

        if (!Files.exists(testPath)) {
            try {
                Files.createFile(testPath);
                spit(filename, contents, append);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            }
        } else {
            if (append) {
                try {
                    Files.write(testPath, contents, StandardOpenOption.APPEND);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            } else {
                try {
                    Files.write(testPath, contents);
                } catch (IOException e) {
                    e.printStackTrace();
                    System.exit(1);
                }
            }
        }
    }

    public static void main(String[] args) {
// append test
        List<String> testContents = new ArrayList<>();
        testContents.add("test contents and more test contents");
//        spit("testFile.txt", testContents, true);

// override test
        List<String> overrideTest = new ArrayList<>();
        overrideTest.add("test contents overridden");
//        spit("testFile.txt", overrideTest, false);

// read file test
        Path testPath = Paths.get("src", "util", "testFile.txt");
        String testPathString = testPath.toString();
//        System.out.println(slurp(testPathString));
    }

}
