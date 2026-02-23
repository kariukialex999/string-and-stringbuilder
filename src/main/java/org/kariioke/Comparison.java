package org.kariioke;

public class Comparison {
    static void main() {
        String a = "Kunal";
        String b = "Kunal";

        System.out.println( a == b); // the == comparator checks if the object variables are equal


        //so how can we create different objects with the same value
        //we use the new keyword

        String c = new String("Alex");
        String d = new String("Alex");

        System.out.println(c == d);// gives false since the object variables c and d are different
        // using the new keyword creates an object that are stored in the heap memory and not the string pool
        //to check the value and not the object variable we use the .equals method

        System.out.println(a.equals(b));

        //strings somehow work as an array of characters
        String name = "kariioke";
        System.out.println(name.charAt(5)); // character at index 5 is the sixth element which is o

    }
}
