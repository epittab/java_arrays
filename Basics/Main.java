package com.Arrays.Basics;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    
    // instantiate scanner for input
    public static Scanner scanner = new Scanner(System.in);

    public static void main (String[] args) {


        //get integers
        int[] myArray = getIntegers();
        printArray(sortIntegers(myArray));
        printArray(myArray);
    }
    
    public static int[] getIntegers(){
        //prompt user input
        System.out.println("Please enter how the length of the list: " + "\r");
        //open scanner for input
        int arrLen = scanner.nextInt();
        // create array
        int[] myTempArr = new int[arrLen];
        //loop add one digit at a time
        for (int i = 0; i < arrLen; i++) {
            //prompt user input
            System.out.println("Please enter an integer to include : ");
            //open scanner for input
            int newInt = scanner.nextInt();
            //assign integer
            myTempArr[i] = newInt;
        }

        return myTempArr;
    }

    public static void printArray(int[] array){
        //code
        System.out.println("Your array includes: " + "\r");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + (i + 1) + " is: " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        //code
        
        //copy array

        int[] myTempArr = Arrays.copyOf(array, array.length);
        // sort algo
        for (int i = 0; i < myTempArr.length; i++) {
            for (int j = (i + 1); j < myTempArr.length; j++) {
                if (myTempArr[j] > myTempArr[i]) {
                    int temp = myTempArr[i];
                    myTempArr[i] = myTempArr[j];
                    myTempArr[j] = temp;
                }
            }
        }
        return myTempArr;
    }
}
