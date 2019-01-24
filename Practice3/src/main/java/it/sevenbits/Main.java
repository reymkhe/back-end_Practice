package it.sevenbits;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("MyHomework.txt");
        file.createNewFile();

        FileInputStream fis = new FileInputStream("Homework3.txt");
        FileOutputStream fos = new FileOutputStream("MyHomework.txt");
        try {
            byte[] bytes = new byte[(int) file.length()];
            fis.read(bytes);
            fos.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        String surname = "Reymkhe";
        byte[] surnameInBytes = surname.getBytes(StandardCharsets.UTF_8);
        fos.write (surnameInBytes);
        fos.close();
    }
}
