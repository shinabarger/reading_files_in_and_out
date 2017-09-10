package reading_with_exceptions;

import java.io.File;

/**
 * Created by davidshinabarger on 9/10/17.
 */

public class Reading_With_Exceptions {

    public static void process(String inputFileName) {

        File inputFile = new File(inputFileName);
        System.out.println(inputFileName);

    }

    public static String returnsString(String inputFileName) {
        return inputFileName;

    }
}
