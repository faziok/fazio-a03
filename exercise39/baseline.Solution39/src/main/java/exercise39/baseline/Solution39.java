package exercise39.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.*;

public class Solution39 {

    /*
     * Ex 39: Sorting Records
     * Given the following data set, create a program that sorts all employees by last name
     *  and prints them to the screen in a tabular format.
     *
     * Constraint
     * -Store the data using a list of maps.
     */

    //declare strings for map values
    String fName = "First Name";
    String lName = "Last Name";
    String position = "Position";
    String separationDate = "Separation Date";

    public static void main(String[] args) {
        Solution39 app = new Solution39();

        //create list of maps and sort by last name
        List<Map<String, String>> employeeList = new ArrayList<>(app.sortList(app.createEmployeeList()));

        //print table of employees
        app.printTable(employeeList);
    }

    public List<Map<String, String>> createEmployeeList(){
        //employee1 map
        Map<String,String> employee1 = new LinkedHashMap<>();
        employee1.put(fName, "John");
        employee1.put(lName, "Johnson");
        employee1.put(position, "Manager");
        employee1.put(separationDate, "2016-12-31");

        //employee2 map
        Map<String,String> employee2 = new LinkedHashMap<>();
        employee2.put(fName, "Tou");
        employee2.put(lName, "Xiong");
        employee2.put(position, "Software Engineer");
        employee2.put(separationDate, "2016-10-5");

        //employee3 map
        Map<String,String> employee3 = new LinkedHashMap<>();
        employee3.put(fName, "Michaela");
        employee3.put(lName, "Michaelson");
        employee3.put(position, "District Manager");
        employee3.put(separationDate, "2015-12-19");

        //employee4 map
        Map<String,String> employee4 = new LinkedHashMap<>();
        employee4.put(fName, "Jake");
        employee4.put(lName, "Jacobson");
        employee4.put(position, "Programmer");
        employee4.put(separationDate, "");

        //employee5 map
        Map<String,String> employee5 = new LinkedHashMap<>();
        employee5.put(fName, "Jacquelyn");
        employee5.put(lName, "Jackson");
        employee5.put(position, "DBA");
        employee5.put(separationDate, "");

        //employee6 map
        Map<String,String> employee6 = new LinkedHashMap<>();
        employee6.put(fName, "Sally");
        employee6.put(lName, "Webber");
        employee6.put(position, "Web Developer");
        employee6.put(separationDate, "2015-12-18");

        //create a list that holds all the maps
        List<Map<String, String>> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        //return employee list
        return employeeList;
    }

    //Create comparator for maps
    public List<Map<String, String>> sortList(List<Map<String, String>> list){
        list.sort(Comparator.comparing(m -> (m.get(lName))));
        return list;
    }

    public void printTable(List<Map<String, String>> employeeList){
        //print table header
        System.out.printf("Name                |Position           |Separation Dates%n" +
                "--------------------|-------------------|----------------%n");

        //for each map in the list, print the map values
        for (Map<String, String> map : employeeList) {
            String first = map.get(fName);
            String last = map.get(lName);
            String name = first + " " + last;
            String pos = map.get(position);
            String sepDate = map.get(separationDate);
            System.out.format("%-20s| %-18s| %-16s%n", name, pos, sepDate);
        }
    }

}
