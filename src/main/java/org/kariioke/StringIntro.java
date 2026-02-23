package org.kariioke;

public class StringIntro {
    static void main() {
        // string is the most used class in java
        // every string creates a type object
        String name = "Alex";

        //String = datatype
        //name = reference variable
        //"Alex" = object initialization, this is the actual object
        //a string are stored in the string pool
        //string objects are immutable once created for security reasons

        String a = "Kunal";
        System.out.println(a);

        a = "Kushwaha";
        System.out.println(a); //java creates a new string object and the previous initialization is taken care by the garbage collection


        System.out.println(name);


    }
}
