package org.kariioke;

public class PrettyPrinting {
    static void main() {
        //printing in an easy way

        float a = 453.1234f;
//        System.out.printf("Formatted number is %.2f", a);

        System.out.println(Math.PI);
        System.out.printf("Formated pi: %.3f", Math.PI);
        System.out.println(" ");

        String name = "Alex";
        System.out.printf("Hello %s and i am %s years old", name, 30);
    }
}
