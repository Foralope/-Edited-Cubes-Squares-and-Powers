/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package squares.cubes.and.powers;
import java.util.Scanner;
/**
 *
 * @author wizwa9381
 */
public class SquaresCubesAndPowers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variables
        Scanner keyedInput = new Scanner(System.in);
        int userInput,inputToContinue;
        double userInput2,userInput3,answer;
        do {
            System.out.println("--Squares, Cubes and Powers Program--");
            System.out.println("Enter your choice.");
            System.out.println("1. Square a number.");
            System.out.println("2. Cube a number.");
            System.out.println("3. Put a number to the power of another number.");
            System.out.println("4. Exit the program.");
            //Time to count!!!
            System.out.println("-----------------------------------------------");
            userInput = keyedInput.nextInt();
            System.out.println("-----------------------------------------------");
            //1, 2, 3, 4 or whatever.
            switch (userInput) {
                case 1:
                    System.out.println("What number do you want to square?");
                    userInput2 = keyedInput.nextInt();
                    answer = Math.pow(userInput2, 2);
                    Math.round(answer);
                    System.out.println("Your answer is: " + answer);
                    System.out.println("Input a value to continue.");
                    inputToContinue = keyedInput.nextInt();
                break;
                case 2:
                    System.out.println("What number do you want to cube?");
                    userInput2 = keyedInput.nextInt();
                    answer = Math.pow(userInput2, 3);
                    Math.round(answer);
                    System.out.println("Your answer is: " + answer);
                    System.out.println("Input a value to continue.");
                    inputToContinue = keyedInput.nextInt();
                break;
                case 3:
                    System.out.println("What number do you want to put to the power of another number?");
                    userInput2 = keyedInput.nextInt();
                    System.out.println("What number do you want the exponenent to be?");
                    userInput3 = keyedInput.nextInt();
                    answer = Math.pow(userInput2, userInput3);
                    Math.round(answer);
                    System.out.println("Your answer is: " + answer);
                    System.out.println("Input a value to continue.");
                    inputToContinue = keyedInput.nextInt();
                break;
                case 4:
                    System.out.println("Thank you for using my program!");
                break;
                default:
                    System.out.println("That is not an option.");
                    System.out.println("Input a value to continue.");
                    inputToContinue = keyedInput.nextInt();
                break;
        }
    } while (userInput != 4);
    }
    
}
