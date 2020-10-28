package com.Arrays.Advanced;

import java.util.Scanner;

public class Main {
    
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args){
        //code
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your chioce: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                default:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("0 - Print Instructions");
        System.out.println("1 - Print Grocery List");
        System.out.println("2 - Add an item to the list.");
        System.out.println("3 - Modify an item in the list.");
        System.out.println("4 - Delete an item from the list.");
        System.out.println("5 - Search for an item.");
        System.out.println("6 - Quit.");
    }


    public static void printGroceryList(){
        groceryList.printGroceryList();
    }

    public static void addItem(){
        System.out.print(" Please enter the grocery item: ");
        String newItem = scanner.nextLine();
        groceryList.addGroceryItem(newItem);
    }
    
    public static void modifyItem(){
        System.out.print(" Please enter the item number: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print(" Please enter the new grocery item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber-1, newItem);

    }
 
    public static void removeItem(){
        System.out.print(" Please enter the item number to remove: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNumber-1);
    }

    public static void searchForItem(){

        System.out.print(" Please enter the item name: ");
        String itemName = scanner.nextLine();
        scanner.nextLine();
        System.out.println(groceryList.findItem(itemName));
    }
}
