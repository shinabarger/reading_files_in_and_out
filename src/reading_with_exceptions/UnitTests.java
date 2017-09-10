package reading_with_exceptions;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/10/17.
 */

public class UnitTests {

    @Test
    public void testFirstTitle() throws IOException {
        String expected = "something.txt";
        String actual = Reading_With_Exceptions.extractTheTitleOfTheFile("src/testfile1.txt");
        assertEquals(expected, actual);
    }

    @Test
    public void testTitleExtractionUsingfiletxt() throws IOException {
        String expected = "MyOutput1.txt";
        String actual = Reading_With_Exceptions.extractTheTitleOfTheFile("src/file.txt");
        assertEquals(expected, actual);
    }

    @Test
    public void testTitleExtractionUsingfile2txt() throws IOException {
        String expected = "niceJob.txt";
        String actual = Reading_With_Exceptions.extractTheTitleOfTheFile("src/file2.txt");
        assertEquals(expected, actual);
    }

    @Test
    public void testTitleExtractionUsingfile3txt() throws IOException {
        String expected = "OneLastOutput.txt";
        String actual = Reading_With_Exceptions.extractTheTitleOfTheFile("src/file3.txt");
        assertEquals(expected, actual);
    }

}
