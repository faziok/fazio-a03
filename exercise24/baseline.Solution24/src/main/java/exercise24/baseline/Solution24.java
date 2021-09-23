package exercise24.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

public class Solution24 {

    /*
    * Create a program that compares two strings and determines if the two strings are anagrams.
    * The program should prompt for both input strings and display the output.
    */

    public static void main(String[] args) {
        Solution24 anagram = new Solution24();

        //prompt user "Enter two strings and I'll tell you if they are anagrams."
        //prompt user "Enter the first string: "
        //scan in string response using scanInput

        //prompt user "Enter the second string: "
        //scan in string response using scanInput

        //test string using isAnagram

        //print output using getOutput

    }

    public String scanInput(String prompt){
        //scan in string response
    }

    public boolean isAnagram(String one, String two){
        /*
        -boolean anagram

        -clean up whitespace using .replaceAll("\\s", "") on both strings
        -compare string lengths using .length()
        if false
        -anagram = false
        else
        -make char arrays and sort using .sort
        -anagram = check if arrays are equal using .equalsIgnoreCase()

        -return anagram
         */
    }

    public void printOutput(String one, String two, boolean anagram){
        /*print output
        if (anagram){
        printf "'one' and 'two' are anagrams."
        else
        printf "'one' and 'two' are NOT anagrams."
         */
    }
}
