package exercise37.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.security.SecureRandom;
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
        app.getRandomElements(chars, pw1, spCharNum);

        //add random elements for special numbers to pw list
        app.getRandomElements(nums, pw1, numbersNum);

        //add random elements for special characters to pw list
        app.getRandomElements(letters, pw1, letterNum);

        //print password
        System.out.printf("Your password is: %s%n", app.getAndShufflePassword(pw1));

    }

    public void setLists(List<Character> chars, List<Character> nums, List<Character> letters){
        //Declare strings for letters, numbers, and specials characters to be split into the character lists
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String spChars = "!@#$%^&*()?";

        //add characters to letters list
        for (char ch: alphabet.toCharArray()) {
            letters.add(ch);
        }

        //add characters to letters list
        for (char ch: numbers.toCharArray()) {
            nums.add(ch);
        }

        //add characters to letters list
        for (char ch: spChars.toCharArray()) {
            chars.add(ch);
        }
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
        return inputString;
    }

    public int checkMinLength (int min, int chars, int nums){
        //get length of chars plus nums
        int length = chars + nums;
        int lettersNum;

        //if length of chars and nums is less than the min.
        //Subtract length from min value.
        //this will be the amount of letters to select
        if (length < min){
            lettersNum = (min - length);
        }else{
            //else  letters = length
            //this will be the amount of letters to select
            lettersNum = length;
        }
        //return amount of letters to print
        return lettersNum;
    }

    public void getRandomElements(List<Character> listIn, List<Character> listOut, int num) {
        SecureRandom rand = new SecureRandom();

        //using a random number to select elements from list
        //for the length of the list, choose the number of elements chosen.
        //add the element to the new list
        //remove the element from the original list to prevent duplicate selections
        for (int i = num -1; i >= 0; i--) {
            int randomIndex = rand.nextInt(listIn.size());
            listOut.add(listIn.get(randomIndex));
            listIn.remove(randomIndex);
        }
    }

    public String getAndShufflePassword (List<Character> pwList){
        SecureRandom rand = new SecureRandom();
        StringBuilder output = new StringBuilder(pwList.size());

        //take pw list of chosen elements and shuffle them
        //using a random number to get random password
        while(!pwList.isEmpty()){
            int randPicker = rand.nextInt(pwList.size());
            output.append(pwList.remove(randPicker));
        }
        //return final password as string.
        return output.toString();
    }
}
