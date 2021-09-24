package exercise27.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Solution27 {
    Scanner input = new Scanner(System.in);

    /*
     * Write a program that prompts for a first name, last name, employee ID, and ZIP code.
     * Ensure that the input is valid according to these rules:
     *
     * The first name must be filled in.
     * The last name must be filled in.
     * The first and last names must be at least two characters long.
     * An employee ID is in the format AA-1234. So, two letters, a hyphen, and four numbers.
     * The ZIP code must be a number.
     * Display appropriate error messages on incorrect data.
     *
     * Example Output
     * Enter the first name: J
     * Enter the last name:
     * Enter the ZIP code: ABCDE
     * Enter the employee ID: A12-1234
     * The first name must be at least 2 characters long.
     * The last name must be at least 2 characters long.
     * The last name must be filled in.
     * The employee ID must be in the format of AA-1234.
     * The zipcode must be a 5 digit number.
     *
     * Or
     *
     * Enter the first name: John
     * Enter the last name: Johnson
     * Enter the ZIP code: 55555
     * Enter the employee ID: TK-4321
     * There were no errors found.
     *
     * Constraints
     * -Create a function for each validation rule. Then create a validateInput function that takes in all of the
     *      input data and invokes the specific validation functions.
     * -Use a single output statement to display the outputs.
     */

    public static void main(String[] args) {
        Solution27 data = new Solution27();

        //prompt user for first name and scan in
        String firstName = data.scanInput("Enter the first name: ");
        //prompt user for last name and scan in
        String lastName = data.scanInput("Enter the last name: ");
        //prompt user for zipcode and scan in
        String zipCode = data.scanInput("Enter the ZIP code: ");
        //prompt user for employee ID and scan in
        String employeeID = data.scanInput("Enter the employee ID: ");

        //invoke validations
        data.validateInput(firstName, lastName, zipCode, employeeID);

        //print results

    }

    private String scanInput(String prompt) {
        //print prompt and scan input
        System.out.print(prompt);
        return input.nextLine();
    }

    private String validateInput(String firstName, String lastName, String employeeID, String zipcode) {
        ArrayList<String> rule = new ArrayList<String>();

        //if no rules are broken
            //rule.add = "There were no errors found."

        //else
        isFilledIn(firstName);
        //if first name is not filled in
        //     rule.add = "The first name must be filled in."
        isLongEnough(firstName);
        //if first name is not at least 2 characters long
        //     rule.add = "The first name must be at least 2 characters long."

        isFilledIn(lastName);
        //if last name is not filled in
        //     rule.add = "The last name must be filled in."
        isLongEnough(lastName);
        //if last name is not at least 2 characters long
        //     rule.add = "The last name must be at least 2 characters long."

        isEmployeeID(employeeID);
        //if employee ID is not in the format AA-1234
        //     rule.add = "The employee ID must be in the format of AA-1234."

        isZIPCode(zipcode);
        //if zipcode is not a 5-digit number
        //     rule.add = "The zipcode must be a 5-digit number."

        //return rule
    }

    private boolean isFilledIn(String name) {
        //if name equals ""
        //  return false
        //else
        //  return true
    }

    private String isLongEnough(String name) {
        //if name length < 2 characters
        //  return false
        //else
        //  return true
    }

    private String isZIPCode(String zipcode) {
        //if zipcode is NOT numeric OR not 5-digits long
        //  return false
        //else
        //  return true
    }

    private String isEmployeeID(String employeeID) {
        //if employeeID does not follow the format AA-1234
        //  return false
        //else
        //  return true
    }
}
