package problems.problem3;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartAB1 {
    private List<List<String>> columns;
    private Integer singularlyMissed;
    private Integer doublyMissed;

    public PartAB1(File csvFile) {
        try {
            CSVReader reader = new CSVReader(new FileReader(csvFile.getAbsolutePath()));
            this.columns = transpose(normalize(reader.readAll()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private List<List<String>> normalize(List<String[]> rows) {
        List<List<String>> result = new ArrayList<>();
        for(String[] row : rows) {
            result.add(Arrays.asList(row));
        }
        return result;
    }

    private <T> List<List<T>> transpose(List<List<T>> table) {
        List<List<T>> ret = new ArrayList<List<T>>();
        final int N = table.get(0).size();
        for (int i = 0; i < N; i++) {
            List<T> col = new ArrayList<T>();
            for (List<T> row : table) {
                col.add(row.get(i));
            }
            ret.add(col);
        }
        return ret;
    }

    public List<String> getColumnA() {
        return columns.get(0);
    }

    public List<String> getColumnB() {
        return columns.get(1);
    }

    public void setMissedValues() {
        List<String> columnA = columns.get(0);
        List<String> columnB = columns.get(1);

        for (int i = 0; i < columnA.size(); i++) {
            Integer currentExpectedValue = i + 1;
            Integer currentValueA = Integer.parseInt(columnA.get(i));
            Integer currentValueB = Integer.parseInt(columnB.get(i));
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

    public Integer getSingularlyMissed() {
        return singularlyMissed;
    }

    public Integer getDoublyMissed() {
        return doublyMissed;
    }
}

