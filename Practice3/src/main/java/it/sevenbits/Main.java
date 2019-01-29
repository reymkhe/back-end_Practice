package it.sevenbits;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Main application entry point
 */
public class Main {
    /**
     * Main function for app
     * @param args - console arguments
     * @throws IOException when file not found
     */
    public static void main(final String[] args) throws IOException {
        File fileFrom = new File("Homework3.txt");
        File fileTo = new File("MyHomework.txt");
        fileTo.createNewFile();

        FileInputStream fis = new FileInputStream("Homework3.txt");
        FileOutputStream fos = new FileOutputStream("MyHomework.txt");
        try {
            byte[] bytes = new byte[(int) fileFrom.length()];
            fis.read(bytes);
            fos.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String surname = "Reymkhe";
        byte[] surnameInBytes = surname.getBytes(StandardCharsets.UTF_8);
        fos.write(surnameInBytes);
        fos.close();
    }
}

