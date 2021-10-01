package exercise35.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */


import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Solution35 {
    Scanner input = new Scanner(System.in);
    List<String> names = new ArrayList<>();

    /*
     * Create a program that picks a winner for a contest or prize drawing.
     * Prompt for names of contestants until the user leaves the entry blank. Then randomly select a winner.
     *
     * Example Output
     * Enter a name: Homer
     * Enter a name: Bart
     * Enter a name: Maggie
     * Enter a name: Lisa
     * Enter a name: Moe
     * Enter a name:
     * The winner is... Maggie.
     *
     * Constraints
     * Use a loop to capture user input into an array.
     * Use a random number generator to pluck a value from the array.
     * Don’t include a blank entry in the array
     * Some languages require that you define the length of the array ahead of time.
     * You may need to find another data structure, like an ArrayList.
     */

    public static void main(String[] args) {
        Solution35 app = new Solution35();

        //How to finish entry
        System.out.println("*Leave entry blank when finished*");

        //prompt to "Enter a name: "
        app.scanInput("Enter a name: ", app.names);

        //choose a random winner.
        String randomWinner = app.getWinner(app.getRandomNumber());

        //print winner
        System.out.printf("The Winner is...%s!%n", randomWinner);

    }

    public void scanInput (String prompt, List<String> entry){
        //while the input is not empty
        //print the prompt and scan to list
        String name;
        do{
            System.out.print(prompt);
            name = input.nextLine();
            entry.add(name);
        }while(!name.isEmpty());
    }

    public int getRandomNumber (){
        //get random number within 0 - length of list - 1
        Random num = new SecureRandom();
        return num.nextInt(names.size()-1);
    }

    public String getWinner (int ranNum){
        //get name from list using random number
        return names.get(ranNum);
    }
}
