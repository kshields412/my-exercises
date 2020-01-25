package com.github.kshields412.problem3;

import org.junit.Test;
import com.github.kshields412.problem3.PartAB;

import java.io.File;
import java.util.Arrays;

public class PartABTest {

    @Test
    public void test() {
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
}
