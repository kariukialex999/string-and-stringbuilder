package org.kariioke;

import java.util.ArrayList;

public class Operators {
    static void main() {
        //adding of characters adds their Unicode values
        System.out.println('a' + 'b');

        //adding string values puts them right next to each other(concatenation)
        System.out.println("a" + "b");

        System.out.println('a' + 3); // adds the Unicode of the character to three
        System.out.println((char)('a' + 3)); //prints the character in placed three steps from char a

        System.out.println("a" + 1);
        // adding strings to an integer leads to concatenation
        //the integer int will be converted to the Integer wrapper class that calls toString

        System.out.println("Kunal " + new ArrayList<>());

        //we can only use the + operator with primitives and any object but
        //one of the objects has to be a string
        //so given

        System.out.println(new Integer(56) + " " + new ArrayList<>()); //gives an error

        //what about adding a string and a character? will they concatenate?
        System.out.println("A" + 'a');
    }
}
