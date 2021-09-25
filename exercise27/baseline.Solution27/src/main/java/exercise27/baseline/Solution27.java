package exercise27.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

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
        String zipcode = data.scanInput("Enter the ZIP code: ");
        //prompt user for employee ID and scan in
        String employeeID = data.scanInput("Enter the employee ID: ");

        //invoke validations and print
        System.out.print(data.validateInput(firstName, lastName, zipcode, employeeID));

    }

    private String scanInput(String prompt) {
        //print prompt and scan input
        System.out.print(prompt);
        return input.nextLine();
    }


    public String validateInput(String firstName, String lastName, String zipcode, String employeeID) {
         String output = "";
         int brokenRule = 0;

         //if true first name is not filled in add "The first name must be filled in." to output
         if (checkBlank(firstName)){
             output += "The first name must be filled in.\n";
             brokenRule = 1;
         }

        //if true first name is not at least 2 characters long add
        //  "The first name must be at least 2 characters long." to output
        if (checkLength(firstName)){
            output += "The first name must be at least 2 characters long.\n";
            brokenRule = 1;
        }

        //if true last name is not filled add "The last name must be filled in." to output
        if (checkBlank(lastName)){
            output += "The last name must be filled in.\n";
            brokenRule = 1;
        }

        //if true last name is not at least 2 characters long add
        //  "The last name must be at least 2 characters long." to output
        if (checkLength(lastName)){
            output += "The last name must be at least 2 characters long.\n";
            brokenRule = 1;
        }

        //if true employee ID is not in the format AA-1234 add
        //  "The employee ID must be in the format of AA-1234." to output
        if (checkNumeric(zipcode)){
            output += "The zipcode must be a 5 digit number.\n";
            brokenRule = 1;
        }

        //if true zipcode is not a 5-digit number add "The zipcode must be a 5-digit number." to output
        if (checkEmployeeID(employeeID)){
            output += "The employee ID must be in the format of AA-1234.\n";
            brokenRule = 1;
        }

        //if no rules are broken -> output = "There were no errors found."
        if (brokenRule == 0){
            output = "There were no errors found.\n";
        }

        //return output
        return output;
    }

    public boolean checkBlank(String name) {
        //if name equals ""
        //  return true
        //else
        //  return false

        return name.isEmpty();
    }

    public boolean checkLength(String name) {
        //if name length < 2 characters
        //  return true
        //else
        //  return false

        return name.length() < 2;
    }

    public boolean checkNumeric(String zipcode) {
        //boolean numeric = false
        boolean numeric = false;

        //if not 5-digits long -> return true
        if (zipcode.length() != 5) {
            numeric = true;
        } else {
            //try zipcode is a numeric, catch if not -> return true
            try {
                Double.parseDouble(zipcode);
            } catch (NumberFormatException e) {
                numeric = true;
            }
        }
        //return numeric
        return numeric;
    }

    public boolean checkEmployeeID(String employeeID) {
        //if employeeID does not follow the format AA-1234

        //break string into char Array and boolean check = false
        boolean check = false;
        char[] charID = employeeID.toCharArray();

        //if length is greater than 7 or less than 7 characters -> check = true
        if(employeeID.length() != 7){
            check = true;
        }

        //else if first or second chars are not a letter or third char is not '-' -> check = true
        else if (!Character.isLetter(charID[0]) || !Character.isLetter(charID[1]) || (charID[2] != '-')){
            check = true;
        }

        //else for the last four chars if they are not a digit -> check = true
        else{
            for (int i = 3; i < employeeID.length(); i++){
                if (!Character.isDigit(charID[i])){
                    check = true;
                }
            }
        }

        //return check
        return check;
    }

}