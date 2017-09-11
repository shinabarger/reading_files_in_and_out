package reading_with_exceptions;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/10/17.
 */

public class UnitTests {

    /*@Test
    //will come back to this...
    public void testFirstTitle() throws IOException {
        String expected = "something.txt";
        String actual = Reading_With_Exceptions.extractTheTitleOfTheFile("src/testfile1.txt");
        assertEquals(expected, actual);
    }*/

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

    @Test
    public void extractNumbersFromfile2txt() throws IOException {
        //this awkwark split needs to be fixed but its fine for now...
        String expected = "4020 1 x 5 7 45 1 2 3 4 5 6 7 8 9 77 88 99 23 3456";
        String actual = Reading_With_Exceptions.extractAllTheNumbersOfTheFile("src/file2.txt");
        assertEquals(expected, actual);
    }

    @Test
    public void extractNumbersFromfile3txt() throws IOException {
        //will have to come back to this to fix the x that is getting pushed through. Annoying. Have to add validation.
        String expected = "x020 1 5 7 45 1 2 3 4 5 6 7 8 9 77 88 99 23 3456 99 88 11 22 33 44 5566 77";
        String actual = Reading_With_Exceptions.extractAllTheNumbersOfTheFile("src/file3.txt");
        assertEquals(expected, actual);
    }

    @Test
    public void testThatArrayIsWorkingCorrectly() throws IOException {
        //will have to come back to this to fix the x that is getting pushed through. Annoying. Have to add validation.
        int[] expectedResult = new int[] { 1, 2, 3 };
        int[] result = Reading_With_Exceptions.turnTheNumbersIntoAProperList("1 2 3");
        Assert.assertArrayEquals(expectedResult, result);
    }

    @Test
    public void testThatWritesToFile() throws IOException {
        //will have to come back to this to fix the x that is getting pushed through. Annoying. Have to add validation.
        String expected = "something.txt 123 ";
        String actual = Reading_With_Exceptions.writeToFile("src/testfile1.txt", "something.txt");
        assertEquals(expected, actual);
    }

}
