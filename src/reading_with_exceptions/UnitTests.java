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

    @Test
    public void extractNumbers() throws IOException {
        String expected = "123";
        String actual = Reading_With_Exceptions.extractAllTheNumbersOfTheFile("src/testfile1.txt");
        assertEquals(expected, actual);
    }

    @Test
    public void extractNumbersFromfiletxt() throws IOException {
        String expected = "2220 1 4 5 7 8 9 10 11 12 13 1445 46 47 48 49 50 511 2 3 4 5 6 7 8 9 77 88 99 23 3456 99 88 77 66 55 44 33 22 11";
        String actual = Reading_With_Exceptions.extractAllTheNumbersOfTheFile("src/file.txt");
        assertEquals(expected, actual);
    }

}
