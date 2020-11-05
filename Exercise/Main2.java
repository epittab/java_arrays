package com.Arrays.Exercise;

import java.util.ArrayList;

public class Main2 {
    
    public static void main(String[] args) {
    
        //p. 856 from Java an introduction to problem solving
        ArrayList<String> instruction = new ArrayList<String>(0);
        instruction.add("Go");
        instruction.add("Stop");
        instruction.add("High");
        instruction.add("Low");
        instruction.add("Goodbye");
        instruction.add("Stop");
        System.out.println(instruction.get(5));
        // Change the element at index 5 to "Go"
        instruction.set(5, "Go");
        System.out.println(instruction.get(5));

    }
}
