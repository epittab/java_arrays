package com.Arrays.Advanced;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i=0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    } 

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Item " + (position+1) + " modified!");   
    }
    
    public void removeGroceryItem(int position){
        String deletedItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Item " + deletedItem + " removed!");   
    } 
    
    public String findItem(String searchItem){
        boolean exists = groceryList.contains(searchItem);
        if (exists) {
            int position = groceryList.indexOf(searchItem);
            return "Found " + groceryList.get(position);
        } else {
            return "Item not found!";
        }
    }
}
