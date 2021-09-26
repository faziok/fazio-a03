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
     * Constraints
     * -The prompting must use repetition, such as a counted loop, not three separate prompts.
     */

    public static void main(String[] args) {
        Solution28 add = new Solution28();

        //put inputs into an array
        String[] numbers = add.scanInputs("Enter a number: ");

        //add numbers together and print
        System.out.printf("The total is %.2f.%n", add.getTotal(numbers));

    }

    public String[] scanInputs(String prompt){
        //prompt user to "Enter a number" five times using for loop and scan into a String array
        String[] numbers = new String[5];

        //for i <= 4 prompt user to enter number and scan into a numbers String array
        for(int i = 0; i <= 4; i++){
            System.out.print(prompt);
            numbers[i] = input.nextLine();
        }
        return numbers;
    }

    public double getTotal(String[] numbers){
        double total = 0;

        //parse strings to integers and add numbers together using a for loop.
        for(int i = 0; i <= 4; i++){
            total += Double.parseDouble(numbers[i]);
        }
        return total;
    }
}

