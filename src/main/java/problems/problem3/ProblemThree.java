package problems.problem3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProblemThree {

    public String[] getCSVFileDataAt(String fileName) {
        String[] returnArr = new String[0];
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {

            while ((line = br.readLine()) != null) {
                // use comma as separator
                String[] num = line.split(cvsSplitBy);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return returnArr;
    }

    public Integer getCountOfMissingNumbers(String[] csvFileData){
        return getColumnAMissingNum(convertToIntegerArray(csvFileData));
    }

    public Integer getMissingNumFromAB(){
        return null;
    }


    public Integer getColumnAMissingNum(Integer[] numArr) { //Part C
        int missingNum = 0;
        for (Integer i : numArr) {
            //bit
            missingNum = missingNum ^ i;
        }
        return missingNum;
    }

    public Integer[] convertToIntegerArray(String[] csvFileData) {
        Integer[] result = new Integer[csvFileData.length];
        for (int i = 0; i < csvFileData.length; i++) {
            String csvFileDatum = csvFileData[i];
            result[i] =  Integer.parseInt(csvFileDatum);
        }
        return result;
    }
    /* this implementation would change the auxiliary space because it is manipulating bits
    to do the comparisons of each index but it would not change time from O(n) because there
    is still a linear comparision happening when iterating through the array.
    This however would require for the parsed original file to be parsed into Integers so it
    could sort the bits. I would have to research further to see if time would be able to be
    lessened in any way. Possibly by using a HashMap and searching by memory addresses? */
}



