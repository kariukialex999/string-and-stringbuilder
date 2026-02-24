package org.kariioke;

import java.util.Scanner;

public class Palindrome2 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        String name = scanner.next();

        System.out.println(isPalindorome(name));
    }

    static boolean isPalindorome(String name) {
        StringBuilder builder = new StringBuilder();

        for (int i = name.length() - 1; i >= 0; i--) {
            char c = name.charAt(i);
            builder.append(c);
        }
        System.out.println(builder);
        if (builder.toString().equals(name)) {
            return true;
        }
        return false;
    }
}
