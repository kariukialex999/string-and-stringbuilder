package org.kariioke;

public class Performance {
    static void main() {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            series += c;
        }
        System.out.println(series);


        //here, the function creates a new object with every iteration
        //we can use string builder to minimize the number of operations by creating one mutable object
    }
}
