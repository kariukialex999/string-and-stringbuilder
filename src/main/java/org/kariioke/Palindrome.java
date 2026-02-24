package org.kariioke;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        //palindrome
        //a word is spelled the same read from the front and from the back

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your word: ");
        String name = scanner.next();

        System.out.println(isPalindrome(name));
    }

    static boolean isPalindrome(String name) {
        StringBuilder builder = new StringBuilder();
        boolean isPalindrome = false;
        for(int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            builder.append(c);
        }
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        if (name.equals(builder)) {
            isPalindrome = true;
        }
        return isPalindrome;
    }
}
