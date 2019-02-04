/*
Felicia Johnson
February 1st,2019
This program was design to get user input(an integer) and use that input to print out a set of Fibonnaci series of
numbers in the program based on the number the user has inputted. next the program is set to calculate the time it
takes for each method to run and print the results.

*/

//Imports Java Libraries//
import java.util.Scanner;
import java.lang.*;

//plublic class
public class Fibonacci {

    //main class//
    public static void main(String[] args) {

         //starts timer for program//
         long startTime=System.nanoTime();

        System.out.println("Enter an Integer: ");// gets input from user
        Scanner sc = new Scanner(System.in);//scanner function//
        int userInput = sc.nextInt();// waits on user input
        System.out.println(userInput);// prints out user input
        System.out.println("The Fibonacci Series up to " + userInput + " using Iteration is:");// prints of string
        //and user input//

        //Iteration
        //for loop used as a counter //
        // set i to 0, if i is less than userinput the systems increments byn1 until i is equal to user input//
        for (int i = 0; i <= userInput - 1; i++) {

            //once looping is complete, system prints out the fibo series using the Iteration Method//
            System.out.println(fiboSeriesIte(i) + "");

        }
        //ends timing for Iteration method//
        long endTime=System.nanoTime();

        //stores time in total time. takes the end time away from the start time//
        long totalTime=endTime-startTime;

        //prints out total nano time//
        System.out.println("The Total time in Nanoseconds For Iteration is: " + totalTime);

        //prints out total time in milliseconds//
        System.out.println("The Execution time in Milliseconds is: " +totalTime/1000000);

        //prints out string along with user input
        System.out.println("The Fibonacci Series up to " + userInput + " using Recursion is :");

        //recursion
        //for loop counter for userinput
        for (int i = 0; i <= userInput - 1; i++) {

            //prints out foboseriesrec of i along with numbers//
            System.out.println(fiboSeriesRec(i) + "");


        }
        //grabs system end time for recursion method//
        endTime = System.nanoTime();

        //end time is taken away from start time to retrieve total time for recursion//
        totalTime = endTime - startTime;

        //prints out total nano seconds for recursion//
        System.out.println("The Execution time in Nanoseconds for Recursion is: " + totalTime);

        //prints out total milliseconds for recursion//
        System.out.println("The Execution time in Milliseconds is: " +totalTime/1000000);

    }





    //Recursion Method. takes integer parameter
    public static int fiboSeriesRec(int userInput) {


        if (userInput == 0 || userInput == 1) {// base numbers, if user enter 0 or 1 program spits out userinput
            return userInput;
        } else
            //else program takes the user input away from 1 and 2 to retrieve fibo series of numbers. returns numbers to
            //memory
            return fiboSeriesRec(userInput - 1) + fiboSeriesRec(userInput - 2);


    }




    //Iteration Program, takes integer parameter
    public static int fiboSeriesIte(int userInput) {


        //if statement
        if (userInput == 0 || userInput == 1) {// base numbers
            return userInput;
        }
        //declaring and initializes variables
        int num1 = 0, num2 = 1, results = 1;

        //for loop to iterate through every number in the program until A condition is met or until i is equal to user input//
        for (int i = 2; i <= userInput; i++) {

            //results is equal to the sum of num 1 and num 2
            results = num1 + num2;

            //num 1 becomes num 2
            num1 = num2;

            //num 2 then becomes results and the process starts again from the method until the condition is met, or
            //i is equal to userinput//
            num2 = results;

        }
        //return results
        return results;
//


    }



}

