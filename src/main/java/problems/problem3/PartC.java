package problems.problem3;

public class PartC {
    /* this implementation would change the auxiliary space because it is manipulating bits
    to do the comparisons of each index but it would not change time from O(n) because there
    is still a linear comparision happening when iterating through the array.
    This however would require for the parsed original file to be parsed into Integers so it
    could sort the bits. I would have to research further to see if time would be able to be
    lessened in any way. Possibly by using a HashMap and searching by memory addresses? */

    public Integer getColumnAMissingNum(Integer[] numArr) { //Part C
        int missingNum = 0;
        for (Integer i : numArr) {
            //bit
            missingNum = missingNum ^ i;
        }
        return missingNum;
    }

}



