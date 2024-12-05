package OtherProjects.hust.soict.globalict.garbage.GarbageText;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
        String path = "src/bigText.txt";
        String res = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                res += line + "\n";
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return;
        }

        System.out.println("File length: " + res.length());
    }
}
