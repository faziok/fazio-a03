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
        */

        String userPW = pw.scanInput("Please enter your password: ");

        //pass userPW through passwordValidator
        int pwValue = pw.passwordValidator(userPW);

        //pass value returned by passwordValidator through determineStrength
        String strength = pw.determineStrength(pwValue);

        //print response "The password 'userPW' is 'strength' password.
        System.out.printf("The password '%s' is %s password.", userPW, strength);

    }

    public String scanInput(String prompt){
        //scan and return input
        System.out.print(prompt);
        return input.nextLine();
    }

    public int passwordValidator(String password){
        /*
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

        if (password.length() < 8){
            if (password.matches("[0-9]+")){
                return 1;
            }
            else if (password.matches("[a-zA-Z]+") ){
                return 2;
            }
            else {
                return 0;
            }
        }
        else{
            if (password.matches(".*[a-zA-Z].*") && password.matches(".*[0-9].*" )) {
                if (password.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-].*")){
                    return 4;
                }else{
                    return 3;
                 }
            } else {
                return 0;
            }
        }
    }

    public String determineStrength(int pwValue) {
        /*
        Switch pwValue
            case 1: strength = "a very weak"
            case 2: strength = "a weak"
            case 3: strength = "a strong"
            case 4: strength = "a very strong"
            default: strength = "an unknown strength"

        return strength
         */
        return switch (pwValue) {
            case 1 -> "a very weak";
            case 2 -> "a weak";
            case 3 -> "a strong";
            case 4 -> "a very strong";
            default -> "an unknown strength";
        };
    }
}
