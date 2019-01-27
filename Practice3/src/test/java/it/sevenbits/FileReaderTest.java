package it.sevenbits;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

/**
 * Tests for class FileReader
 */
public class FileReaderTest {

    /**
     * Simple positive test for readLine function
     * @throws IOException when file not found
     */
    @Test
    public void simplePositiveTest() throws IOException {
        FileReader fileReader = new FileReader("Homework3.txt");
        Assert.assertEquals("Homework3.txt line 1: .", fileReader.readLine());
    }

}

