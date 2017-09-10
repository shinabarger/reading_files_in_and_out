package reading_with_exceptions;

import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 9/10/17.
 */

public class UnitTests {

    @Test
    public void firstTest() throws IOException {
        String expected = "something.txt";
        String actual = Reading_With_Exceptions.extractTheTitleOfTheFile("src/testfile1.txt");
        assertEquals(expected, actual);
    }

}
