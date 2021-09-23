package exercise25.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.Scanner;

public class Solution25 {
    Scanner input = new Scanner(System.in);

    /*
     *Create a program that determines the complexity of a given password based on these rules:
     * A very weak password contains only numbers and is fewer than eight characters.
     * A weak password contains only letters and is fewer than eight characters.
     * A strong password contains letters and at least one number and is at least eight characters.
     * A very strong password contains letters, numbers, and special characters and is at least eight characters.
     * If a password does not meet any of these rules, then report it as a password of unknown strength.

     * Constraints
     * -Create a passwordValidator function that takes in the password as its argument and returns a numeric value
     *      you can evaluate to determine the password strength.
     * -Use a single output statement.
     */

    public static void main(String[] args) {
        Solution25 pw = new Solution25();
        /*
        prompt user "Please enter your password: "
        String userPW = scanned input

        pass userPW through passwordValidator

        pass value returned by passwordValidator through determineStrength

        print response "The password 'userPW' is 'strength' password."
         */

    }

    public String scanInput(String prompt){
        //scan and return input
    }

    public int passwordValidator(String password){
        /*
        change password to a char array
        if password length < 8
            if password is only numbers
                return 1
            else if password is only letters
                return 2
            else
                return 0
         else
            if password contains letters and at least one number
                return 3
            else if password contains letters, numbers, and specials characters
                return 4
            else
                return 0
         */
    }

    public String determineStrength(int pwValue){
        /*
        //Get strength output
        String strength

        Switch pwValue
            case 1: strength = "a very weak"
            case 2: strength = "a weak"
            case 3: strength = "a strong"
            case 4: strength = "a very strong"
            default: strength = "an unknown strength"

        return strength
         */
    }
}
