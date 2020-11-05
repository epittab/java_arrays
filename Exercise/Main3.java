package com.Arrays.Exercise;

import java.util.ArrayList;

public class Main3 {
    
    public static void main(String[] args) {
        // p. 856 from Java an introduction to problem solving

        ArrayList<String> aList = new ArrayList<String>(20);

        aList.add("This ");
        aList.add("is ");
        aList.add("a ");
        aList.add("String ");
        aList.add("test ");
        aList.add("just ");
        aList.add("to ");
        aList.add("prove ");
        aList.add("that ");
        aList.add("I ");
        aList.add("know ");
        aList.add("how ");
        aList.add("to ");
        aList.add("work ");
        aList.add("with ");
        aList.add("this ");
        aList.add("type. ");

        for (int i = 0; i < aList.size(); i++) {
            System.out.print(aList.get(i));
        }

    }
}
