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
            byte[] bytes = new byte[];
            fis.read(bytes);
            // нужен цикл
            fos.write(bytes);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }


        String surname = "Reymkhe";
        byte[] surnameInBytes = surname.getBytes(StandardCharsets.UTF_8);
        fos.write (surnameInBytes);
        fos.close();

        System.out.println();
// вывести содержимое файла - через Read
    }
}
