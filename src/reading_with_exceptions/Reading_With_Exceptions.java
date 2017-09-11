package reading_with_exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Made by David Shinabarge for an assignment for a class.
 *
 * NOTE: Some of this code is copypasta from the assignment.
 *
 *
 */

public class Reading_With_Exceptions {
    // The following routine is called to complete the job of copying integers read all to
    // the output file:
    // scan - a Scanner object to copy integers from
    // ps - A PrintStream to write the integers to
    // numIntsToRead - number of integers to read. A value of -1 ==>
    // For the last step, we Copy the contents of the file to the screen integers

    public static void main(String[] args) throws IOException {
        Reading_With_Exceptions readingWithExceptions = new Reading_With_Exceptions();

        for (int i = 0; i < args.length; i++) {
            System.out.println("\n\n=========== Processing " + args[i] + " ==========\n");
            readingWithExceptions.process(args[i]);
        }



    }

    void process(String inputFilename) throws IOException {
        // Here is where your work goes ... Steps that you will need to do:

        // 1.) Create a Scanner from the inputFilename. Catch exceptions from errors.
        File file = new File(inputFilename);
        Scanner scan = new Scanner(file);

        // 2.) Read the first String from the file and use it
        // to create a PrintStream catching appropriate exceptions
        PrintStream printStreamOut = new PrintStream(file);

        String outputTitleName = extractTheTitleOfTheFile(inputFilename);

        writeToFile(inputFilename, outputTitleName);

        // 3.) Using hasNextInt and nextInt, carefully read the count integer.

        // I recommend -1 for a count value if it is bad to indicate reading ALL
        // 4.) Use copyNumbers method described below to complete the job
        // 5.) Close Scanner and PrintStream objects
        // 6.) Call printToScreen to copy the output file to the screen
    }

    static String extractTheTitleOfTheFile(String inputFileName) throws IOException {
        String title = "";

        String fileName = inputFileName;

        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);

        String currentLine;
        bufferedReader.mark(1);
        title = bufferedReader.readLine();

        bufferedReader.reset();
        while ((currentLine = bufferedReader.readLine()) != null) {
            System.out.println(currentLine);

        }
        int locationOftxt = (title.indexOf(".txt") + 4);
        title = title.substring(0, locationOftxt);

        return title;
    }

    static String extractAllTheNumbersOfTheFile(String inputFileName) throws IOException {

        String fileName = inputFileName;

        BufferedReader bufferedReader = null;
        FileReader fileReader = null;

        fileReader = new FileReader(fileName);
        bufferedReader = new BufferedReader(fileReader);

        String currentLine = "";
        StringBuilder stringBuilder = new StringBuilder();

        while(currentLine != null) {
            stringBuilder.append(currentLine);
            currentLine = bufferedReader.readLine();
        }
        String numberToPrintOut = stringBuilder.toString();
        int indexOftxt = (numberToPrintOut.indexOf(".txt") + 5);
        numberToPrintOut = numberToPrintOut.substring(indexOftxt);
        return  numberToPrintOut;
    }

    static int[] turnTheNumbersIntoAProperList(String numbers) {

        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();

        String[] numberArray = numbers.split(" ");
        int[] numbersArray = new int[numberArray.length];

        for (int i = 0; i < numberArray.length; i++) {
            int number = Integer.parseInt(numberArray[i]);
            numbersArray[i] = number;

        }
        return numbersArray;

    }

    static String writeToFile(String inputFilename, String outputTitleName) throws IOException {

        BufferedWriter bufferedWriter = null;
        FileWriter fileWriter = null;

        String content = null;
        try {
            String numbers = extractAllTheNumbersOfTheFile(inputFilename);
            int[] numbersToPrintArray = turnTheNumbersIntoAProperList(numbers);
            String numbersToPrintOut = Arrays.toString(numbersToPrintArray);
            content = (outputTitleName + " " + numbersToPrintOut);

            fileWriter = new FileWriter(outputTitleName);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(content);
            System.out.println("Done printing.");

        } catch (IOException e) {
            e.printStackTrace();
        }

        finally {

            try {

                if (bufferedWriter != null)
                    bufferedWriter.close();

                if (fileWriter != null)
                    fileWriter.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }
        return content;
    }
    void copyNumbers(Scanner scan, PrintStream ps, int
            numIntsToRead) {
        // hasNext() can be used to see if the scan object still has data
        // Note that hasNextInt() can be used to see if an integer is present
        // nextInt() will read an integer
        // next() can be used to skip over bad integers
    }

    private void printToScreen(String filename) {
        Scanner scan = null;
        try {
            FileInputStream fis = new FileInputStream(filename);
            scan = new Scanner(fis);
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("printToScreen: can't open: " + filename);
        } finally {
            if (scan != null)
                scan.close();
        }
    }
}