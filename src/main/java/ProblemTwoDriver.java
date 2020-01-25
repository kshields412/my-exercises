import problems.ProblemTwo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemTwoDriver {

    public static void main(String[] args) throws FileNotFoundException {
        ProblemTwo problemTwo = new ProblemTwo();
        Scanner scanner = new Scanner(System.in);
        String fileNameA = scanner.nextLine();
        String fileNameB = scanner.nextLine();
        String[] fileAStrings = problemTwo.getStringsFromFile(fileNameA);
        String[] fileBStrings = problemTwo.getStringsFromFile(fileNameB);

        Integer numberOfCommonStrings = problemTwo.getNumberOfCommonStrings(fileAStrings, fileBStrings);

        System.out.println(numberOfCommonStrings);

    }
}