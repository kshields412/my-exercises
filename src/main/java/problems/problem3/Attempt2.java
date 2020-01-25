package problems.problem3;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Attempt2 {
    private List<String[]> columns;
    private Integer singularlyMissed;
    private Integer doublyMissed;

    public Attempt2(File csvFile) {
        try {
            CSVReader reader = new CSVReader(new FileReader(csvFile.getAbsolutePath()));
            this.columns = reader.readAll();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setMissedValues() {
        String[] columnA = columns.get(0);
        String[] columnB = columns.get(1);

        for (int i = 0; i < columnA.length; i++) {
            Integer currentExpectedValue = i + 1;
            Integer currentValueA = Integer.parseInt(columnA[i]);
            Integer currentValueB = Integer.parseInt(columnB[i]);
            Boolean aIsMissing = !currentExpectedValue.equals(currentValueA);
            Boolean bIsMissing = !currentExpectedValue.equals(currentValueB);
            Boolean bothAreMissing = aIsMissing && bIsMissing;
            if (bothAreMissing) {
                this.doublyMissed = currentExpectedValue;
            } else if (aIsMissing || bIsMissing) {
                this.singularlyMissed = currentExpectedValue;
            }
        }
    }
}
