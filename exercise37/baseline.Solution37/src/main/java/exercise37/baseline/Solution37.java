package exercise37.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.*;

public class Solution37 {

    /*
     * Create a program that generates a secure password. Prompt the user for the minimum length,
     * the number of special characters, and the number of numbers.
     * Then generate a password for the user using those inputs.
     *
     * Example Output
     * What's the minimum length? 8
     * How many special characters? 2
     * How many numbers? 2
     * Your password is aurn2$1s#
     *
     * Constraints
     * -Use lists to store the characters you’ll use to generate the passwords.
     * -Ensure that the generated password is random.
     * -Ensure that there are at least as many letters as there are special characters and numbers.
     */

    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Solution37 app = new Solution37();

        //declare lists:
        List<Character> chars = new ArrayList<>();
        List<Character> nums = new ArrayList<>();
        List<Character> letters = new ArrayList<>();
        List<Character> pw1 = new ArrayList<>();

        //Set lists
        app.setLists(chars, nums, letters);


        //Prompt user "What's the minimum length?" and scan
        int lengthMin = Integer.parseInt(app.checkNumeric(app.scanInput("What's the minimum length? ")));

        //Prompt user "How many special characters?" and scan
        int spCharNum = Integer.parseInt(app.checkNumeric(app.scanInput("How many special characters? ")));

        //Prompt user "How many numbers?" and scan
        int numbersNum = Integer.parseInt(app.checkNumeric(app.scanInput("How many numbers? ")));

        //check minimum length and get number of letters
        int letterNum = app.checkMinLength(lengthMin, spCharNum, numbersNum);

        //add random elements for special characters to pw list


        //add random elements for special numbers to pw list


        //add random elements for special characters to pw list


        //print password


    }

    public void setLists(List<Character> chars, List<Character> nums, List<Character> letters){
        //Declare strings for letters, numbers, and specials characters to be split into the character lists
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String spChars = "!@#$%^&*()?";

    }

    private String scanInput(String prompt) {
        //prompt and return input
        System.out.print(prompt);
        return input.nextLine();
    }

    public String checkNumeric(String inputString) {
        //try input is a numeric, catch if not, set to false.
        //while false prompt user for integers only and rescan.
        try {
            Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            boolean numeric = false;
            while (!numeric){
                System.out.print("Please answer with integers only: ");
                numeric = input.hasNextInt();
                inputString = input.nextLine();
            }
        }
        //return inputString

    }

    public int checkMinLength (int min, int chars, int nums){


        //get length of chars plus nums


        //if length of chars and nums is less than the min.
        //Subtract length from min value. choose a random number between 0-2 for variation.
        //this will be the amount of letters to select


        //return amount of letters to print

    }

    public void getRandomElements(List<Character> listIn, List<Character> listOut, int num) {


        //using a random number to select elements from list
        //for the length of the list, choose the number of elements chosen.
        //add the element to the new list
        //remove the element from the original list to prevent duplicate selections

    }

    public String getAndShufflePassword (List<Character> pwList){


        //take pw list of chosen elements and shuffle them
        //using a random number to get random password

        //return final password as string.
    }
}
