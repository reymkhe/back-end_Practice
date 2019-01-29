package it.sevenbits;

import java.io.*;

/**
 * FileReader class with readLine function and hasMoreLine function
 */
public class FileReader {
    private String filePath;
    private BufferedReader bufferedReader;
    private String prevLine;
    private int lineNumber;

    /**
     * FileReader constructor. When FileReader is created, the first line from file is read
     * @param filePath - path to file for reading
     * @throws IOException when file is not found
     */
    public FileReader(final String filePath) throws IOException {
        this.filePath = filePath;
        File file = new File(filePath);
        Reader reader = new java.io.FileReader(file);
        this.bufferedReader = new BufferedReader(reader);
        prevLine = bufferedReader.readLine();
        lineNumber = 1;
    }

    /**
     * ReadLine function read one line from file for one using
     * @return string with file name, number of line and line
     * @throws IOException when file is not found or line could not be read
     */
    public String readLine() throws IOException {
        String finalLine = null;
        if (hasMoreLines()) {
            finalLine = filePath + " line " + lineNumber + ": " + prevLine;
            prevLine = bufferedReader.readLine();
            lineNumber = lineNumber ++;
            if (!hasMoreLines()) {
               bufferedReader.close();
            }
        }
        return finalLine;
    }

    /**
     * HasMoreLines function
     * @return true when file has more line or false when it doesn`t
     */
    public boolean hasMoreLines() {
        return prevLine != null;
    }
}
