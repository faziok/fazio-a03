package exercise40.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.*;

public class Solution40 {

    /*
     * Exercise 40 - Filtering Records
     *  Given the following data set create a program that lets a user locate all records that match the
     *      search string by comparing the search string to the first or last name field.
     *
     * Constraint
     * -Store the data using a list of maps.
     */

    Scanner input = new Scanner(System.in);

    //declare strings for map values
    String fName = "First Name";
    String lName = "Last Name";
    String position = "Position";
    String separationDate = "Separation Date";

    public static void main(String[] args) {
        Solution40 app = new Solution40();

        //prompt user for string to search for
        String searchTerm = app.scanInput("Enter a search string: ");

        //create list of maps and sort by last name
        List<Map<String, String>> employeeList = new ArrayList<>(app.sortList(app.createEmployeeList()));

        //print table of employees
        app.printTable(app.searchList(employeeList, searchTerm));
    }

    private String scanInput(String prompt) {
        //prompt and return input
        System.out.print(prompt);
        return input.nextLine();
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

    //Filter list by user input string
    public List<Map<String, String>> searchList(List<Map<String, String>> employeeList, String searchTerm){

        //create new lists. NewList so not to alter the original list and a filtered list to add matching maps too
        List<Map<String, String>> newEmployeeList = new ArrayList<>(employeeList);
        List<Map<String, String>> filteredList = new ArrayList<>();

        //for each index of the list
        //for each value of the map
        //if value contains the searchTerm (convert both strings to lowercase to ignore upper/lower case)
        //add current map to filtered list
        //break out of current for-loop to prevent repeat maps
        for (Map<String, String> map : newEmployeeList) {
            for (String value : map.values()){
                if (value.toLowerCase().contains(searchTerm.toLowerCase())){
                    filteredList.add(map);
                    break;
                }
            }
        }

        //return filtered list
        return filteredList;
    }


    public void printTable(List<Map<String, String>> filteredList){

        //if filtered is not empty, print table
        if (!filteredList.isEmpty()){
            System.out.print("\nResults:\n\n");

            //print table header
            System.out.printf("Name                |Position           |Separation Dates%n" +
                    "--------------------|-------------------|----------------%n");

            //for each map in the list, print the map values
            for (Map<String, String> map : filteredList) {
                String first = map.get(fName);
                String last = map.get(lName);
                String name = first + " " + last;
                String pos = map.get(position);
                String sepDate = map.get(separationDate);
                System.out.format("%-20s| %-18s| %-16s%n", name, pos, sepDate);
            }
            //else print no matching results.
        } else{
            System.out.println("\nResults: No matches!");
        }
    }
}