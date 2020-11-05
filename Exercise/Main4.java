package com.Arrays.Exercise;

import java.util.Scanner;
import java.util.ArrayList;

public class Main4 {
    
    private static Scanner scanner = new Scanner(System.in);
    private static int total;

    public static void main(String[] args) {
        //average

        //make arraylist

        ArrayList<Integer> intList = new ArrayList<Integer>(1);
        //loop for input
        boolean check = true;
        
        while (check) {
            //receive int
            System.out.println("Please enter an integer to include in the average: ");
            int newNumber = scanner.nextInt();
            
            intList.add(newNumber);
            //receive string
            System.out.println("Would you like to enter another number?: (Y)es or (N)o: ");
            scanner.nextLine();
            String decision = scanner.nextLine();

            if (decision.equals("N") || decision.equals("n")) {
                check = false;
            }

        }

        //calculate average

        for (int i = 0; i < intList.size(); i++) {
            total += intList.get(i);
        }

        //output
        double average = (double) total / intList.size();

        System.out.println("The average is: " + average);
    }
}
