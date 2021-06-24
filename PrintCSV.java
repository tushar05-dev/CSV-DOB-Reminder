package com.costrategix.assignments;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


public class PrintCSV{

    public static List<Employees> list = new ArrayList<>();

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Provide Month");

        int birthMonth = sc.nextInt();
        sc.nextLine();

        if (birthMonth > 12) {
            System.out.println(" Invalid Month");
            System.exit(0);
        }
        System.out.println("Provide Employee's city");
        String empCity = sc.nextLine().toLowerCase();

        String path = "/home/costrategix/Downloads/10000Records.csv";
        String Line = "";
        String firstName = null;

         String names = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
         BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(path));

            while ((Line = br.readLine()) != null) {

                String[] employee = Line.split(",");
                firstName = employee[2];

                if (firstName != null) {

                    Employees gixers  = new Employees();
                    gixers.setFirstName(employee[2]);
                    gixers.setLastName(employee[4]);
                    gixers.setDateOfBirth(employee[10]);
                    gixers.setCity(employee[31]);

                    if (names.indexOf(firstName.toUpperCase().charAt(0)) != -1) {
                        list.add(gixers);

                    }
                }

            }
            for (Employees emp : list) {

                String month = null;
                String str = emp.getDateOfBirth().trim();

                if (str.length() <= 9) {
                    month = str.substring(0, 1);
                } else {
                    month = str.substring(0, 2);
                }

                if (!month.trim().equals("Da")) {

                    if ((birthMonth == Integer.parseInt(month)) || (emp.getCity().toLowerCase().equals(empCity))) {

                        System.out.println("Employee :" + " " + emp.getFirstName()
                                + " " + emp.getLastName() + "->" + " Belongs to the City : "
                                + emp.getCity() + " , " + " Wishing him/her the Warm happy Birthday "
                                + emp.getDateOfBirth());
                    }
                }

            }
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("!!!...No More GIXERS...!!! ");

        }
     }
}
