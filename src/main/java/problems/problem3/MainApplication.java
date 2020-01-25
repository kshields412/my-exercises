package problems.problem3;

import problems.problem3.PartC;

import java.io.File;
import java.util.Arrays;

//import problems.problem3.ProblemThree;
//
public class MainApplication {

    public static void main(String[] args) {
        partAB();
//        partAB1();
    }

    private static void partAB() {
        String currentDirectory = System.getProperty("user.dir");
        String resourceDirectory = "/src/main/resources/";
        String fileName = "numberData.csv";
        String filePath = currentDirectory + resourceDirectory + fileName;
        File csvFile = new File(filePath);
        PartAB partAB = new PartAB(csvFile);
        partAB.setMissedValues();
        Integer doublyMissed = partAB.getDoublyMissed();
        Integer singlyMissed = partAB.getSingularlyMissed();

        System.out.println("Column A = " + Arrays.toString(partAB.getColumnA()));
        System.out.println("Column B = " + Arrays.toString(partAB.getColumnB()));
        System.out.println("Doubly missed value = " + doublyMissed);
        System.out.println("Singly missed value = " + singlyMissed);
    }




    private static void partAB1() {
        String currentDirectory = System.getProperty("user.dir");
        String resourceDirectory = "/src/main/resources/";
        String fileName = "numberData.csv";
        String filePath = currentDirectory + resourceDirectory + fileName;
        File csvFile = new File(filePath);
        PartAB1 partAB = new PartAB1(csvFile);
        partAB.setMissedValues();
        Integer doublyMissed = partAB.getDoublyMissed();
        Integer singlyMissed = partAB.getSingularlyMissed();

        System.out.println("Column A = " + partAB.getColumnA());
        System.out.println("Column B = " + partAB.getColumnB());
        System.out.println("Doubly missed value = " + doublyMissed);
        System.out.println("Singly missed value = " + singlyMissed);
    }


}
