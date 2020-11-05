package com.Arrays.Exercise;

import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) {

        //p. 854 from Java an introduction to problem solving
        ArrayList<String> aList = new ArrayList<String>(1);
        aList.add("This");
        aList.add("is");
        aList.add("a");
        aList.add("test");
        aList.add("Hello");
        System.out.println(aList.get(aList.size()-1));
        
    }
}
