import javax.swing.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        JFileChooser fileChooser = new JFileChooser();

        String line = "";
        String file = "";
        int wordCount = 0;
        int lineCount = 0;
        int charCount = 0;

        if (fileChooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
            File specificFile = fileChooser.getSelectedFile();

            try (BufferedReader reader = new BufferedReader(new FileReader(specificFile))){

                while ((line = reader.readLine()) != null){

                    lineCount++;
                    String[] words = line.split("\\s+");
                    wordCount += words.length;
                    charCount += line.length();

                }

                System.out.println("Name of file is: " + specificFile.getName());
                System.out.println("Number of lines: " + lineCount);
                System.out.println("Number of words: " + wordCount);
                System.out.println("Number of characters: " + charCount);



            } catch (IOException e){
                System.out.println("File reading error: " + e.getMessage());

            }

        }




    }
}
