package exercise29.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.text.DecimalFormat;
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
     * Constraints
     * -Don’t allow the user to enter 0.
     * -Don’t allow non-numeric values.
     * -Use a loop to trap bad input, so you can ensure that the user enters valid values.
     */

    public static void main(String[] args) {
        Solution29 invest = new Solution29();
        String yearsInvested;

        //prompt user "What is the rate of return (as a percentage)?"
        //scan input
        String rateOfReturn = invest.scanInput("What is the rate of return (as a percentage)? ");

        //Check if input is numeric and not 0.
        //while rate of return is not numeric  OR rate of return is 0
            //prompt user "Sorry. That's not a valid input. What is the rate of return (as a percentage)? "
            //scan input
        while (!invest.checkNumeric(rateOfReturn) || invest.checkIfZero(rateOfReturn)){
            rateOfReturn = invest.scanInput("Sorry. That's not a valid input.\n" +
                    "What is the rate of return (as a percentage)? ");
        }

        //get years of investment with correct input
        yearsInvested = invest.getYearsInvested(rateOfReturn);

        //print output "It will take 'yearsInvested' years to double your initial investment."
        System.out.printf("It will take %s years to double your initial investment.%n", yearsInvested);
    }

    public String scanInput (String prompt){
        //prompt user
        System.out.print(prompt);
        //return user input
        return input.nextLine();
    }

    public boolean checkNumeric(String inputString) {
        boolean check = true;

        //try input is a numeric, catch if not, set to false
        try {
            Double.parseDouble(inputString);
        } catch (NumberFormatException e) {
            check = false;
        }
        //return check result
        return check;
    }

    public boolean checkIfZero(String inputString){
        //if input is == to 0, set to true
        return inputString.equals("0");
    }

    public String getYearsInvested (String rateOfReturn){
        //convert rateOfReturn in integer
        //divide 72 by rate of return.
        //round to one decimal place.
        //return years

        DecimalFormat df = new DecimalFormat("####.#");
        return df.format(72/(Double.parseDouble(rateOfReturn)));
    }
}
