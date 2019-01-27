package it.sevenbits;

import java.io.IOException;

/**
 * Example class with getLongestLineCharsCount function, use FileReader
 */
public class Example {

    /**
     * GetLongestLineCharsCount function
     * @param fileReader is object of FileReader class
     * @return the maximum length of lines from the file
     * @throws IOException when file is not found
     */
    public int getLongestLineCharsCount(final FileReader fileReader) throws IOException {

        String line;
        int maxLine = 0;

        while (fileReader.hasMoreLines()) {
            line = fileReader.readLine();
            if (line.length() > maxLine) {
                maxLine = line.length();
            }
        }
        return maxLine;
    }
}
