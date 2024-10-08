package HW6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        cutGmails();
    }

    public static void cutGmails() {
        Path sourcePath = Paths.get("D:/kurs/Java/src/HW6/emails.txt");
        Path targetPath = Paths.get("res.txt");

        try (
                BufferedReader reader = Files.newBufferedReader(sourcePath);
                BufferedWriter writer = Files.newBufferedWriter(targetPath);
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.endsWith("gmail.com")) {
                    String[] split = line.split("\\s+");
                    writer.write(split[split.length - 1]);
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

