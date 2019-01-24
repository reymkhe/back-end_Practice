package it.sevenbits;

import java.io.File;
import java.io.Reader;

public class FileReader {
    Reader reader;
    FileReader (String filePath) {
        reader = new java.io.FileReader(new File(filePath));
    }

    public String readLine() {

    }

}
