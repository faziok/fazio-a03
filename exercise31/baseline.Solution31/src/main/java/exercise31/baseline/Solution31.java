package exercise31.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.Scanner;

public class Solution31 {
    Scanner input = new Scanner(System.in);

    /*
     * When getting into a fitness program, you may want to figure out your target heart rate
     * so you don’t overexert yourself. The Karvonen heart rate formula is one method you can use to determine
     * your rate. Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula
     * to determine the target heart rate based on a range of intensities from 55% to 95%. Generate a table with
     * the results as shown in the example output. The formula is:
     *
     * TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR
     *
     * Constraints
     * -Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
     * -Ensure that the heart rate and age are entered as numbers.
     *      Don’t allow the user to continue without entering valid inputs.
     * -Display the results in a tabular format.
     */


    public static void main(String[] args) {
        Solution31 hr = new Solution31();

        //prompt user for resting heart rate and scan in String and verify input is numeric.
        //prompt user for age and scan in String and verify input is numeric.
        int restingHR = Integer.parseInt(hr.scanInput("What is your resting pulse? "));
        int age = Integer.parseInt(hr.scanInput("What is your age? "));

        //pass input through TargetHeartRate class.
        TargetHeartRate rate = new TargetHeartRate(restingHR, age);

        //get and print targetHeartRate.
        rate.printTable();
    }

    public String scanInput (String prompt){
        //prompt user and scan input
        System.out.print(prompt);
        String userInput = input.nextLine();

        //while checkNumeric is false prompt user and rescan input.
        while (!checkNumeric(userInput)){
            System.out.print("Please answer with whole numbers only.\n" + prompt);
            userInput = input.nextLine();
        }

        //return user input
        return userInput;
    }

    public boolean checkNumeric(String inputString) {
        boolean check = true;

        //try input is a numeric, catch if not, set to false
        try {
            Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            check = false;
        }
        //return check result
        return check;
    }
}
