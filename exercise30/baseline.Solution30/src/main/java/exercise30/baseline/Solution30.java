package exercise30.baseline;

/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Keven Fazio
 */

import java.util.Arrays;

public class Solution30 {

    /*
     * Create a program that generates a multiplication table for the numbers 1 through 12 (inclusive).
     *
     * Constraint
     * -Use a nested loop to complete this program.
     * -Align each column within the table without using the tab character.
     */

    public static void main(String[] args) {
        Solution30 table = new Solution30();

        //create and print multiplication table
        table.printArray(table.getMultiplicationTable());
    }

    public int[][] getMultiplicationTable(){
        //create a 12x12 multiplication 2d array using nested for loops
        int [][] arrTable = new int[12][12];

        //for row = 1, row < length, row++
        for (int row = 0; row < arrTable.length ; row++)
        {
            //for column = 1, column < row.length, column++
            for (int column = 0; column < arrTable[row].length; column++)
            {
                //multiply row+1 by column+1
                arrTable[row][column] = (row + 1)*(column + 1);
            }
        }

        return arrTable;
    }

    public void printArray(int[][] table){
        //print array in nested for loops

        //for row = 0, row < length, row++
        for (int row=0; row < table.length; row++)
        {
            //for column = 0, column < row.length, column++
            for (int column=0; column < table[row].length; column++)
            {
                //print table
                System.out.printf("%4d", table[row][column]);
            }
            //print new line
            System.out.println();
        }
    }
}
