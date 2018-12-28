/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package replaceinfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.apache.commons.lang.RandomStringUtils;

/**
 *
 * @author elvis
 */
public class ReplaceInFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // The name of the file to open.
        String fileName = "/home/elvis/workspace/tgi-form-manager/scripts/for_db_mysql/form_2700423947572533922.xml";
        String FILENAME = "/tmp/newform.xml";

        BufferedWriter bw = null;
        FileWriter fw = null;

        // This will reference one line at a time
        String line = null;

        try {
            fw = new FileWriter(FILENAME);
            bw = new BufferedWriter(fw);

            // FileReader reads text files in the default encoding.
            FileReader fileReader = new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                //System.out.println(line);

                String replaced = line.replaceAll("COPY", randonSting()).concat("\n");

                //System.out.println(replaced);
                //writeUsingFiles(replaced);
                bw.write(replaced);
            }

            // Always close files.
            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reading file '" + fileName + "'");
        } finally {

            try {

                if (bw != null) {
                    bw.close();
                }

                if (fw != null) {
                    fw.close();
                }

            } catch (IOException ex) {

                ex.printStackTrace();

            }

        }
    }

    public static String randonSting() {
        String generatedString = RandomStringUtils.randomAlphabetic(4);

        //System.out.println(generatedString);
        return generatedString.toUpperCase();
    }

    private static void writeUsingFiles(String data) {
        try {
            Files.write(Paths.get("/tmp/newform.xml"), data.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
