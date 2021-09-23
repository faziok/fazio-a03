package exercise24.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {

    Scanner input = new Scanner(System.in);

    /*
    * Create a program that compares two strings and determines if the two strings are anagrams.
    * The program should prompt for both input strings and display the output.
    */

    public static void main(String[] args) {
        Solution24 anagram = new Solution24();

        //prompt user "Enter the first string: "
        //scan in string response using scanInput
        //prompt user "Enter the second string: "
        //scan in string response using scanInput

        System.out.println("Enter two strings and I'll tell you if they are anagrams.");
        String firstString = anagram.scanInput("Enter the first string: ");
        String secondString = anagram.scanInput("Enter the second string: ");

        //test string using isAnagram
        boolean answer = anagram.isAnagram(firstString, secondString);

        //print output using getOutput
        anagram.printOutput(firstString, secondString, answer);

    }

    public String scanInput(String prompt){
        System.out.print(prompt);
        return input.nextLine();
    }

    public boolean isAnagram(String firstString, String secondString){
        boolean answer;

        //clean up whitespace using .replaceAll("\\s", "") on both strings
        String copyStrOne = firstString.replaceAll("\\s", "");
        String copyStrTwo = secondString.replaceAll("\\s", "");

        /*compare string lengths using .length()
        if false
        -anagram = false
        else
        -make char arrays and sort using .sort
        -anagram = check if arrays are equal using .equalsIgnoreCase()
        */

        if(copyStrOne.length() != copyStrTwo.length()){
            answer = false;
        }else{
            char[] strOneArray = copyStrOne.toLowerCase().toCharArray();
            char[] strTwoArray = copyStrTwo.toLowerCase().toCharArray();
            Arrays.sort(strOneArray);
            Arrays.sort(strTwoArray);
            answer = Arrays.equals(strOneArray, strTwoArray);
        }

        //return answer
        return answer;
    }

    public void printOutput(String firstString, String secondString, boolean anagram){
        /*print output
        if anagram = true
        printf "'one' and 'two' are anagrams."
        else
        printf "'one' and 'two' are NOT anagrams."
         */

        if(anagram){
            System.out.printf("\"%s\" and \"%s\" are anagrams.%n", firstString, secondString);
        }else{
            System.out.printf("\"%s\" and \"%s\" are NOT anagrams.%n", firstString, secondString);
        }
    }
}
