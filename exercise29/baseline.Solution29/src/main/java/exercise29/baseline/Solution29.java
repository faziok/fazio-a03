package exercise29.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.Scanner;

public class Solution29 {
    Scanner input = new Scanner(System.in);

    /*
     * Write a quick calculator that prompts for the rate of return on an investment
     *      and calculates how many years it will take to double your investment.
     *
     * The formula is:
     * years = 72 / r
     * where r is the stated rate of return.
     *
     * Example Output
     * What is the rate of return? 0
     * Sorry. That's not a valid input.
     * What is the rate of return? ABC
     * Sorry. That's not a valid input.
     * What is the rate of return? 4
     * It will take 18 years to double your initial investment.
     *
     * Constraints
     * -Don’t allow the user to enter 0.
     * -Don’t allow non-numeric values.
     * -Use a loop to trap bad input, so you can ensure that the user enters valid values.
     */


    public static void main(String[] args) {
        Solution29 invest = new Solution29();
        int yearsInvested;

        //prompt user "What is the rate of return (as a percentage)?"
        //scan input

        //Check if input is numeric and not 0.
        //while rate of return is not numeric  OR rate of return is 0
            //prompt user "Sorry. That's not a valid input. What is the rate of return (as a percentage)? "
            //scan input

        //get years of investment with correct input


        //print output "It will take 'yearsInvested' years to double your initial investment."
    }

    public String scanInput (String prompt){
        //prompt user
        //return user input
    }

    public boolean checkNumeric(String inputString) {
        //try input is a numeric, catch if not, set to false
    }

    public boolean checkIfZero(String inputString){
        //if input is == to 0, set to true
    }

    public int getYearsInvested (String rateOfReturn){
        //convert rateOfReturn in integer
        //divide 72 by rate of return
        //return years
    }
}
