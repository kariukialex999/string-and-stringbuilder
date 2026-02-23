package org.kariioke;

public class StringBuilderr {
    static void main() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char c = (char)('a' + i);
            builder.append(c);
        }
        System.out.println(builder);

        builder.reverse();
        System.out.println(builder);
    }
}
