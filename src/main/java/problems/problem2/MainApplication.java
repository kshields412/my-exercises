package problems.problem2;

import problems.problem2.PartA;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) throws FileNotFoundException {
        PartA partA = new PartA();
        Scanner scanner = new Scanner(System.in);
        String fileNameA = scanner.nextLine();
        String fileNameB = scanner.nextLine();
        String[] fileAStrings = partA.getStringsFromFile(fileNameA);
        String[] fileBStrings = partA.getStringsFromFile(fileNameB);

        Integer numberOfCommonStrings = partA.getNumberOfCommonStrings(fileAStrings, fileBStrings);

        System.out.println(numberOfCommonStrings);

    }
}