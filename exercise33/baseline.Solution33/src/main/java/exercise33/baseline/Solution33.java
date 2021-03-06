package exercise33.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.security.SecureRandom;
import java.util.*;

public class Solution33 {
    Scanner input = new Scanner(System.in);

    /*
     * Create a Magic 8 Ball game that prompts for a question and
     *      then displays either "Yes," "No," "Maybe," or "Ask again later."
     *
     * Example Output
     * What's your question?
     * > Will I be rich and famous?
     * 
     * Ask again later.
     *
     * Constraint
     * -The value should be chosen randomly using a pseudo random number generator.
     *      Store the possible choices in a list and select one at random.
     */

    public static void main(String[] args) {
        Solution33 app = new Solution33();

        //prompt user "What's your question?"
        String question = app.scanInput("What's your question?\n> ");

        //get pseudo random number
        int randomNumber = app.getRandomNumber();

        //print getResponse
        System.out.println("\n" + app.getResponse(randomNumber));

    }

    public String scanInput (String prompt){
        //Scan input and return
        System.out.print(prompt);
        return input.nextLine();
    }

    public int getRandomNumber (){
        //get random number with .nextInt(4) and return
        Random num = new SecureRandom();
        return num.nextInt(4);
    }

    public String getResponse (int randomNum){
        //create list
        List<String> response = new ArrayList<>();

        //add responses to the list
        response.add("Yes.");
        response.add("No.");
        response.add("Maybe.");
        response.add("Ask again later.");

        //return response based off random number selected
        return response.get(randomNum);
    }
}
