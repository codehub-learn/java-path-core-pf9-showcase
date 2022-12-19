package gr.codelearn.util;

import java.io.BufferedReader;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static List<String> readFile(String fileLocation){
        List<String> fileLines = new ArrayList<>();
        try (java.io.FileReader fileReader = new java.io.FileReader(new File(fileLocation))){
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){
                fileLines.add(line);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        return fileLines;
    }
}
