// Practice with writing a methods in a seperate file.
// Name: Aisha Qureshi Date: 02/05/2023
// JDK: 17.0.1

import java.util.Scanner;

public class RandomCalculations {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Would you like to add, subract, multiply, or divide?");
        String choice = input.next();
        System.out.println("Pick an integer number: ");
        int n1= input.nextInt();
        System.out.println("Pick an integer number");
        int n2 = input.nextInt();

        int r1 = Calculations.generateRandomNum(n1,n2);
        int r2 = Calculations.generateRandomNum(n1,n2);
        System.out.println("Random number 1: " + r1 + "\nRandom number 2: " +r2);


    }
}
