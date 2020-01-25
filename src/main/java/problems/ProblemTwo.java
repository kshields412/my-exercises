package problems;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ProblemTwo {
    public Integer getNumberOfCommonStrings(String[] fileAStrings, String[] fileBStrings) {
        int count = 0;
        for (int i = 0; i < fileAStrings.length; i++) {
            for (int j = 0; j < fileBStrings.length; j++) {
                if (fileAStrings[i] == fileBStrings[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    public String[] addValue(String[] fileAStrings, String valueToAdd) {
        String[] arr = new String[fileAStrings.length + 1];

        for (int i = 0; i < fileAStrings.length; i++) {
            arr[i] = fileAStrings[i];
        }
        arr[arr.length - 1] = valueToAdd;

        return arr;
    }

    public String[] getStringsFromFile(String name) throws FileNotFoundException {
        String[] resultStringArr = new String[0];

        Scanner fileStrings = new Scanner(new File(name)).useDelimiter(",\\s*");

        while (fileStrings.hasNext()) {
        // find next line
            resultStringArr = this.addValue(resultStringArr, fileStrings.nextLine());
        }

        return resultStringArr;
    }

    /* I would definitely change my approach to this problem if I had one billion strings added to the file.
    I think that even with a million strings, it is definitely not the most efficient way to compare the
    strings in this way. The amount of time and space that would be needed to process this algorithm with an
    input so large would end up being something that is inefficient overall. With an input size so large, it
    would be more efficient to convert this solution into one with the capabilities to find what it needs in
    a constant time rather than being dependent on the input size. */
}