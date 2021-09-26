package exercise28.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.Scanner;

public class Solution28 {
    Scanner input = new Scanner(System.in);

    /*
     * Write a program that prompts the user for five numbers and computes the total of the numbers.
     *
     * Example Output
     * Enter a number: 1
     * Enter a number: 2
     * Enter a number: 3
     * Enter a number: 4
     * Enter a number: 5
     * The total is 15.
     *
     * Constraints
     * -The prompting must use repetition, such as a counted loop, not three separate prompts.
     */

    public static void main(String[] args) {
        Solution28 add = new Solution28();

        //put inputs into an array
        String[] numbers = add.scanInputs("Enter a number: ");

        //add numbers together and print
        System.out.printf("The total is %d.%n", add.getTotal(numbers));

    }

    public String[] scanInputs(String prompt){
        //prompt user to "Enter a number" five times using for loop and scan into a String array
        String[] numbers = new String[5];

        //for i <= 4 prompt user to enter number and scan into a numbers String array
    }

    public int getTotal(String[] numbers){
        int total = 0;
        //parse strings to integers and add numbers together using a for loop.
    }
}

