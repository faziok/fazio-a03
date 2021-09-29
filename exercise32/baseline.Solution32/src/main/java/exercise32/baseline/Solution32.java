package exercise32.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.security.SecureRandom;
import java.util.Scanner;

public class Solution32 {
    Scanner input = new Scanner(System.in);
    int guessCount; //total guess count for game
    int max; //max range based off difficulty

    /*
     * GUESS THE NUMBER GAME:
     * Write a Guess the Number game that has three levels of difficulty.
     * The first level of difficulty would be a number between 1 and 10.
     * The second difficulty set would be between 1 and 100.
     * The third difficulty set would be between 1 and 1000.
     *
     * Prompt for the difficulty level, and then start the game.
     * The computer picks a random number in that range and prompts the player to guess that number.
     * Each time the player guesses, the computer should give the player a hint as to whether the number
     * is too high or too low. The computer should also keep track of the number of guesses.
     * Once the player guesses the correct number, the computer should present the number of guesses and
     * ask if the player would like to play again.
     *
     * Constraints
     * -Don’t allow any non-numeric data entry.
     * -During the game, count non-numeric entries as wrong guesses.
     */

    public static void main(String[] args) {
        Solution32 game = new Solution32();
        boolean playAgain;

        //play the game
        do {
            game.guessCount = 1; //set guest count for start of game
            //Print Intro "Let's play Guess The Number!"
            System.out.println("Let's play Guess The Number!");

            //Prompt user "Enter the difficulty level (1, 2, or 3):"
            //scan input, verify it's numeric, assign to int difficulty
            int difficulty = Integer.parseInt(game.check123(game.checkNumeric(game.scanInput
                    ("Enter the difficulty level (1, 2, or 3): "))));

            //Randomly select number in the range of the difficulty
            int randomNumber = game.getRandomNumber(difficulty);

            //Print "I have my number. What's your guess?"
            //scan in guess, verify it's numeric, check if guess equals randomNumber
            int guessCount = game.checkGuessCount(randomNumber, Integer.parseInt(game.checkGuessNumeric(game.scanInput
                    ("I have my number between 1-" + game.max + ". What is your guess? "))));

            //When number is guess correctly print "You got it in 'numGuesses' guesses!"
            System.out.printf("You got it in %d guesses!%n", guessCount);

            //prompt user if they want to play again
            String answer = game.scanInput("Do you wish to play again (Y/N)? ");
            //check if they want to play again
            playAgain = game.checkPlayAgain(answer);

        }while (playAgain); //if true replay game.

        //exit program
        System.out.println("Thanks for playing!");
        System.exit(0);
    }

    public boolean checkPlayAgain (String answer){
        //while answer is not y, n, yes, or no
        //prompt user "Please answer 'Y' or 'N'"
        //scan input
        while(!answer.equalsIgnoreCase("yes") && !answer.equalsIgnoreCase("y")
                && !answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("n")){
            answer = scanInput("Please answer 'Y' or 'N': ");
        }

        //if answer does not equal to 'no' or 'n' return true else return false
        System.out.println("");
        return !answer.equalsIgnoreCase("no") && !answer.equalsIgnoreCase("n");
    }


    public int getRandomNumber(int difficulty){
        //using secureRandom
        SecureRandom random = new SecureRandom();

        //if difficulty == 1
        //min == 1 and max == 10
        if (difficulty == 1){
            max = 10;
            return 1 + random.nextInt(10);
        }
        //else if difficulty == 2
        //min == 1 and max == 100
        else if (difficulty == 2){
            max = 100;
            return 1 + random.nextInt(100);
        }
        //else
        //min == 1 and max == 1000
        else{
            max = 1000;
            return 1 + random.nextInt(1000);
        }
    }

    public int checkGuessCount (int randomNumber, int guess){
        //while input != random number
        while(guess != randomNumber){
            //if guess > max range OR < 1
            //increase guessCount + 1
            //prompt user "Out of range. Guess again:"
            if (guess > max || guess < 1){
                guessCount++;
                guess = Integer.parseInt(checkGuessNumeric(scanInput("Out of range. Guess again: ")));
            }
            //else if guess < randomNumber
            //increase guessCount  + 1
            //prompt user "To low! Guess again:"
            else if (guess < randomNumber) {
                guessCount++;
                guess = Integer.parseInt(checkGuessNumeric(scanInput("To low! Guess again: ")));
            }
            //else
            //increase guess count + 1
            //prompt user "To high! Guess again:"
            else {
                guessCount++;
                guess = Integer.parseInt(checkGuessNumeric(scanInput("To high! Guess again: ")));
            }
        }
        //return guessCount
        return guessCount;
    }

    public String checkGuessNumeric(String inputString) {
        //try input is a numeric, catch if not, set to false.
        try {
            Integer.parseInt(inputString);
        } catch (NumberFormatException e) {
            boolean numeric = false;
            //while false prompt user for integers only and rescan.
            //increase guestCount for each guess
            while (!numeric){
                guessCount++;
                System.out.print("Please answer with integers only: ");
                numeric = input.hasNextInt();
                inputString = input.nextLine();
            }
        }
        //return inputString
        return inputString;
    }

    public String check123 (String inputString){
        //while inputString is not 1, 2, or 3.
        //Prompt user "Please answer with 1, 2, or 3:" and rescan input (check if numeric)
        while (!inputString.equals("1") && !inputString.equals("2") && !inputString.equals("3")) {
            System.out.print("Please answer with 1, 2, or 3: ");
            inputString = checkNumeric(input.nextLine());
        }
        //return inputString
        return inputString;
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

    public String scanInput(String prompt){
        //print prompt and return user input
        System.out.print(prompt);
        return input.nextLine();
    }
}
