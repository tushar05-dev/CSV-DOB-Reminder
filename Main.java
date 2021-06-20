package com.costrategix.assignments;

import java.io.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Employee> list = new LinkedList<>();

    public static  void main(String[] args)  {

        Scanner sc = new Scanner(System.in);

        String line = " ";

        try {

            BufferedReader br = new BufferedReader(new FileReader("/home/costrategix/Downloads/10000Records.csv"));

            while ((line = br.readLine()) != null) {

                String[] column = line.split(" , ");
                Employee employee = new Employee();
                String a = employee.getFirstName(column[2]);
                String b = employee.getLastName(column[4]);
                String c = employee.getCity(column[31]);
                String d = employee.getDateOfBirth(column[10]);
                String empDateOfBirth = sc.nextLine();
                String empCity = sc.nextLine();

                for (Employee emp : list) {
                    if (d.substring(0, 2).equals(empDateOfBirth) && c.equals(empCity)) {
                        System.out.println("Employee" + a + " " + b + ", " + c + " Have the birthday please wish him on " +d);

                    }

                }}} catch (IOException e) {
            e.printStackTrace();
        }
        finally {

        }
    }
}