package edu.pdx.cs410J.pkaran;

import java.util.Arrays;
import java.util.List;

public class DiamondKata {

    private static final List<Character> ALPHABET_LIST = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public static void main(String[] args) {
        final char letter = 'Z';
        printPyramid(Character.toLowerCase(letter));
    }

    private static void printPyramid(char letter) {

        final int maxWidth = ALPHABET_LIST.indexOf(letter) + (ALPHABET_LIST.indexOf(letter) + 1);
        final int maxlength = (ALPHABET_LIST.indexOf(letter) * 2) + 1;
        final int midPoint = (int) Math.ceil(maxWidth / 2);

        assert maxWidth % 2 != 0;

        System.out.println(String.format("maxWidth = %d, maxLength = %d", maxWidth, maxlength));

        // loop through all letters
        for (int i = 0; i <= ALPHABET_LIST.indexOf(letter); i++) {
            if(i == 0) {
                char[] whiteSpace = getWhiteSpace(maxWidth);
                whiteSpace[midPoint] = ALPHABET_LIST.get(i);
                System.out.println(new String(whiteSpace));
                continue;
            }

            char[] whiteSpace = getWhiteSpace(maxWidth);
            whiteSpace[midPoint - i] = ALPHABET_LIST.get(i);
            whiteSpace[midPoint + i] = ALPHABET_LIST.get(i);
            System.out.println(new String(whiteSpace));
        }
    }

    private static char[] getWhiteSpace(int length) {
        char[] charsArray = new char[length];
        Arrays.fill(charsArray, ' ');
        return charsArray;
    }
}