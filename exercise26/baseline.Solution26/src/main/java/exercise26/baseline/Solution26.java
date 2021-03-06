package exercise26.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.Scanner;

public class Solution26 {
    Scanner input = new Scanner(System.in);

    /*
     * Write a program that will help you determine how many months it will take to pay off a credit card balance.
     * The program should ask the user to enter the balance of a credit card,
     * the APR of the card, and their monthly payment.
     * The program should then return the number of months needed (rounded up to the next integer value).
     *
     * The formula for this is
     * n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
     *
     * where
     * n is the number of months.
     * i is the daily rate (APR divided by 365).
     * b is the balance.
     * p is the monthly payment.
     *
     * Example Output
     * What is your balance? 5000
     * What is the APR on the card (as a percent)? 12
     * What is the monthly payment you can make? 100
     * It will take you 70 months to pay off this card.
     *
     * Constraints
     * -Prompt for the card’s APR. Do the division internally.
     * -Prompt for the APR as a percentage, not a decimal.
     * -Use a class called PaymentCalculator with a public method called calculateMonthsUntilPaidOff,
     *      which takes no parameters and returns the number of months.
     * -Round fractions of a cent up to the next cent for internal calculations
     */

    public static void main(String[] args) {
        Solution26 cardPayOff = new Solution26();

        //prompt and scan userInput to "What is your balance", parse to Double
        double currentBalance = Double.parseDouble(cardPayOff.scanInput("What is your balance? "));

        //prompt and scan userInput to "What is the APR on the card (as a percent)?", parse to Double
        double aprPercentage = Double.parseDouble(cardPayOff.scanInput("What is the APR on the card (as a percent)? "));

        //prompt and scan userInput to "What is the monthly payment you can make?", parse to Double
        double monthlyPayment = Double.parseDouble(cardPayOff.scanInput("What is the monthly payment you can make? "));

        // Pass input through PaymentCalculator class
        PaymentCalculator calculator1 = new PaymentCalculator(currentBalance, aprPercentage, monthlyPayment);

        //print "It will take you 'months' months to pay off this card."
        System.out.printf("It will take you %d months to pay off this card.%n", calculator1.calculateMonthsUntilPaidOff());

    }

    public String scanInput (String prompt){
        //print prompt
        //scan in user input

        System.out.print(prompt);
        return input.nextLine();
    }
}
