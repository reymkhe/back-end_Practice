package it.sevenbits;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.mockito.Mockito.*;

/**
 * Tests for class Example
 */
public class ExampleTest {

    FileReader mockReader = mock(FileReader.class);
    Example example = new Example();

    /**
     * Simple positive test for getLongestLineCharsCount function
     * @throws IOException when file is not found or line could not be read
     */
    @Test
    public void simplePositiveTest() throws IOException {
        when(mockReader.hasMoreLines()).thenReturn(true, true, false);
        when(mockReader.readLine()).thenReturn("File.txt line 1: first string", "File.txt line 2: second string");
        Assert.assertEquals(30, example.getLongestLineCharsCount(mockReader));
        verify(mockReader, times(2)).readLine();
    }

    /**
     * Exception test for getLongestLineCharsCount function
     * @throws IOException when file is not found or line could not be read
     */
    @Test(expected = IOException.class)
    public void canNotReadLineExceptionTest() throws IOException {
        when(mockReader.hasMoreLines()).thenReturn(true, false);
        doThrow(IOException.class).when(mockReader).readLine();
        example.getLongestLineCharsCount(mockReader);
    }
}

