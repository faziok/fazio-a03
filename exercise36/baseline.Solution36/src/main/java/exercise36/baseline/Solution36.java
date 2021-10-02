package exercise36.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution36 {

    /*
     * Statistics is important in our field. When measuring response times or rendering times,
     * it’s helpful to collect data so you can easily spot abnormalities.
     * For example, the standard deviation helps you determine which values are outliers
     * and which values are within normal ranges.
     *
     * Write a program that prompts for response times from a website in milliseconds.
     * It should keep asking for values until the user enters done.
     *
     * The program should print the average time (mean), the minimum time, the maximum time,
     * and the population standard deviation.
     *
     * Example Output
     * Enter a number: 100
     * Enter a number: 200
     * Enter a number: 1000
     * Enter a number: 300
     * Enter a number: done
     * Numbers: 100, 200, 1000, 300
     * The average is 400.0
     * The minimum is 100
     * The maximum is 1000
     * The standard deviation is 353.55
     *
     * Constraints
     * -Create functions called average, max, min, and std, which take in a list of numbers and return the results.
     * -Use loops and arrays to perform the input and mathematical operations.
     * -Be sure to exclude the "done" entry from the inputs.
     * -Be sure to properly ignore any invalid inputs.
     * -Keep the input separate from the processing and the output.
     */

    //create scanner
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution36 app = new Solution36();
        List<String> listNumbers = new ArrayList<>();
        List<Integer> listIntegers;

        //Print "Enter response times in milli-seconds. When finished, type 'done'."
        System.out.println("Enter response times in milli-seconds. When finished, type 'done'.");

        //Prompt user to enter a number and scan into list inputNumbers (ignore invalid input)
        app.scanInput("Enter a number: ", listNumbers);

        //print the list of numbers.
        app.printNumberList(listNumbers);

        //convert String list to Integer list.


        //print average, min, max, standard deviation
        app.printResults(listIntegers);
    }

    public void scanInput (String prompt, List<String> entry){
        //while the input does not equal "done"
        //print the prompt and scan to string
        //if input is numeric, add to list (if not it is ignored)
    }

    public boolean checkNumeric(String inputString) {
        //try input is a numeric, catch if not, set to false.
        //return numeric

    }

    public void printNumberList(List<String> entry){
        //print "Numbers: "
        //comma separate the list to a string
        //print the comma separated string

    }

    public double average(List<Integer> list){
        double sum = 0;
        for (Integer num : list) {
            sum += num;
        }
        return Math.round((sum/list.size()) * 10) / 10.0;
    }

    public int min(List<Integer> list){
        // initialize `min` to some max value
        int min = Integer.MAX_VALUE;

        // loop through every element in the list and
        // compare the minimum with the current value

        //return min

    }

    public int max(List<Integer> list){
        // initialize `max` to min value
        int max = Integer.MIN_VALUE;

        // loop through every element in the list and
        // compare the minimum with the current value

        //return max

    }

    public double std(List<Integer> list){
        //std equation sqruare root [(((list(i) - average)^2) / (n-10))]
        // initialize variance variables and n for list length
        double variance1 =0;
        double variance2;
        int n = list.size();

        //loop through all elements into the equation for the numerator

        //divide numerator by (n-1)

        //square root the variance and return deviation

    }

    public void printResults(List<Integer> list){
        //print final outputs.
        System.out.printf("The average is: %.1f%nThe minimum is: %d%nThe maximum is: %d%n" +
                "The standard deviation is: %.1f%n", average(list), min(list), max(list), std(list));
    }
}
