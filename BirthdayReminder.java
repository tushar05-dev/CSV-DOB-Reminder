package com.costrategix.assignments;

import java.io.*;
import java.util.*;

public class BirthdayReminder {

    public static  void main(String[] args)  {

        HashMap<String, String> readFile = null;
        BufferedReader br = null;
        String str = null;
        String column[] = null;
        String attribute[] = null;
        int rows = 0;
        int count = 0;

        try {
            br = new BufferedReader(new FileReader("/home/costrategix/Downloads/10000Records.csv"));
            while((str=br.readLine()) != null){
                System.out.println("Splitting values : "+str);
                if(rows == 0){

                    column = str.split(" , ");
                }
                else{
                    attribute = str.split(" , ");
                }
                rows++;
            }

            readFile = new HashMap<String, String>();
            while(count > column.length){
                readFile.put(column[count], attribute[count]);
                count++;
            }

            for(String s : readFile.keySet()){
                System.out.println("Column Value from CSV : " + s + "Attribute value from CSV : " + readFile.get(s));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}