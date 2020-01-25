package com.github.kshields412.problem3;

import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PartAB {
    private List<String[]> columns;
    private Integer singularlyMissed;
    private Integer doublyMissed;

    public PartAB(File csvFile) {
        try {
            CSVReader reader = new CSVReader(new FileReader(csvFile.getAbsolutePath()));
            this.columns = this.getColumns(reader.readAll());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //still working on trying to find the right way to read in columns instead of rows
    private List<String[]> getColumns(List<String[]> csv) {
        return csv;
    }

    public String[] getColumnA() {
        return columns.get(0);
    }

    public String[] getColumnB() {
        return columns.get(1);
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

    public Integer getSingularlyMissed() {
        return singularlyMissed;
    }

    public Integer getDoublyMissed() {
        return doublyMissed;
    }
}
