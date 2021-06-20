package com.costrategix.assignments;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StoreDataInArray {

    public static void main(String[] args) {

        List<List<String>> data = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader("/home/costrategix/Downloads/10000Records.csv"));
            String line;
            while((line = br.readLine()) != null){

                String[] values = line.split(" , ");
                data.add(Arrays.asList(values));


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
