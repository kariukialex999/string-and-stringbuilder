package org.kariioke;

import java.util.Arrays;

public class Output {
    static void main() {
        System.out.println(56);
        System.out.println("Alex");
        System.out.println(new int[]{2, 3, 4, 5}); //this spits out the hashcode
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5}));

        //java overrides the toString method of println and uses the one in Arrays class
        //we can also create our own toString methods
    }
}
