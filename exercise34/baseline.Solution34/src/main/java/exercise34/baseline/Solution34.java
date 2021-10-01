package exercise34.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution34 {
    Scanner input = new Scanner(System.in);
    List<String> names = new ArrayList<>();

    /*
     * Create a small program that contains a list of employee names.
     * Print out the list of names when the program runs the first time.
     * Prompt for an employee name and remove that specific name from the list of names.
     * Display the remaining employees, each on its own line.
     *
     * Example Output
     * There are 5 employees:
     * John Smith
     * Jackie Jackson
     * Chris Jones
     * Amanda Cullen
     * Jeremy Goodwin
     *
     * Enter an employee name to remove: Chris Jones
     *
     * There are 4 employees:
     * John Smith
     * Jackie Jackson
     * Amanda Cullen
     * Jeremy Goodwin
     *
     * Constraint
     * -Use an array or list to store the names
     */

    public static void main(String[] args) {
        Solution34 app = new Solution34();

        //declare list of names "Phoebe Buffay, Chandler Bing, Ross Geller, Monica Geller, Rachel Green, Joey Tribbiani.
        app.names.add("Ross Geller");
        app.names.add("Monica Geller");
        app.names.add("Rachel Green");
        app.names.add("Chandler Bing");
        app.names.add("Phoebe Buffay");
        app.names.add("Joey Tribbiani");

        //get and print "There are # employees."
        app.getListLength();
        //print list of names
        app.printNamesList();

        //prompt user "Enter an employee name to remove:"
        //scan name entered
        String nameToRemove = app.scanInput("\nEnter an employee name to remove: ");

        System.out.printf("%n"); //line space

        //Subtract name from list.
        app.subtractName(nameToRemove);

        //get and print "there are # of employees:"
        app.getListLength();
        //print list of names
        app.printNamesList();
    }

    public String scanInput(String prompt){
        //prompt and scan input
        System.out.print(prompt);
        return input.nextLine();
    }

    public void getListLength(){
        //print length of list
    }

    public void printNamesList(){
        //for the length of list, from element on new line
    }

    public void subtractName(String nameToRemove){
        //subtract name from list
    }
}
