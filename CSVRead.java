package com.costrategix.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVRead {

    public static void main(String[] args) {

        BufferedReader csv = null;

        try {
            String csvLine;
            csv = new BufferedReader(new FileReader("/home/costrategix/Downloads/10000Records.csv"));

            while ((csvLine = csv.readLine()) != null) {
                System.out.println("Raw CSV data: " + csvLine);
                System.out.println("CSV to ArrayList data: " + CSVReader(csvLine) + "\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (csv != null) csv.close();
            } catch (IOException CSVException) {
                CSVException.printStackTrace();
            }
        }
    }

    public static ArrayList<String> CSVReader(String csv) {
        ArrayList<String> csvResult = new ArrayList<String>();

        if (csv != null) {
            String[] splitData = csv.split(" , ");
            for (int i = 0; i < splitData.length; i++) {
                if (!(splitData[i] == null) || !(splitData[i].length() == 0)) {
                    csvResult.add(splitData[i].trim());
                }
            }
        }

        return csvResult;
    }

}

