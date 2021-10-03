package exercise38.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution38 {

    /*
     * Create a program that prompts for a list of numbers, separated by spaces.
     * Have the program print out a new list containing only the even numbers.
     *
     * Example Output
     * Enter a list of numbers, separated by spaces: 1 2 3 4 5 6 7 8
     * The even numbers are 2 4 6 8.
     *
     * Constraints
     * Convert the input to an array. Many languages can easily convert strings to arrays with a built-in function
     *      that splits apart a string based on a specified delimiter.
     * Write your own algorithm—don’t rely on the language’s built-in filter or similar enumeration feature.
     * Use a function called filterEvenNumbers to encapsulate the logic for this.
     *      The function takes in the original array and returns the new array.
     */

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution38 app = new Solution38();

        //prompt user "Enter a list of numbers, separated by spaces:"
        //scan into string, check if numeric
        String numStr = app.checkNumeric(app.scanInput());

        //print new array of even numbers from 'filterEvenNumbers()'
        System.out.print("The even numbers are: ");
        app.printEvenNumbers(numStr);
        System.out.println("");
    }

    private String scanInput() {
        //prompt and return input
        System.out.print("Enter a list of numbers, separated by spaces: ");
        return input.nextLine();
    }

    public String checkNumeric(String inputString) {
        //do-while input is not numeric
        //remove white space from string
        //try input is a numeric, catch if not, set to false.
        //while false prompt user for integers only and rescan.

        boolean numeric;

        do {
            numeric = true;
            try {
                Long.parseLong(inputString.replaceAll("\\s", ""));
            } catch (NumberFormatException e) {
                numeric = false;
                System.out.print("Please answer with Integers only: ");
                inputString = input.nextLine();
            }
        }while(!numeric);

        //return inputString
        return inputString;
    }

    public int[] convertStrToIntArray (String numStr){
        //delimit string into a string array
        String[] strArr = numStr.split(" ");

        //initialize int array with length of strArr length
        int[] intArr = new int[strArr.length];

        //convert string array to int array
        //for length of string array, parse to int array
        for (int i = 0; i < strArr.length; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        //return int array
        return intArr;
    }


    public int[] filterEvenNumbers (int[] numArr){
        //find size of array for even number
        //for length of array check for even numbers
        //if even increase evenSize by 1
        int evenSize = 0;
        for (int value : numArr) {
            if (value % 2 == 0) {
                evenSize++;
            }
        }
        //initialize new string array output
        //for loop scanning length of array for even numbers
        //if input[i]%2 == 0
        //output[i] = numArr[i]

        int[] evenNumbers = new int[evenSize];
        int k = 0;

        for (int i : numArr) {
            if (i % 2 == 0) {
                evenNumbers[k++] = i;
            }
        }

        //return string conversion of array
        return evenNumbers;
    }

    public void printEvenNumbers (String numStr){
        //get length for print loop
        int evenNumbers = filterEvenNumbers(convertStrToIntArray(numStr)).length;

        //sort the array
        int[] sorted = filterEvenNumbers(convertStrToIntArray(numStr));
        Arrays.sort(sorted);

        //for length of evenNumbers array print the numbers.
        for (int i = 0; i < evenNumbers; i++) {
            System.out.print(sorted[i] + " ");
        }
    }
}