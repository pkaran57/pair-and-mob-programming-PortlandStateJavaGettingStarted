package edu.pdx.cs410J.pkaran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiamondKata {

    private static final List<Character> ALPHABET_LIST = Arrays.asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z');

    public static void main(String[] args) {
        final char letter = args[0].charAt(0);
        printDiamond(letter);
    }

    private static void printDiamond(char letter) {
        letter = Character.toLowerCase(letter);

        final int maxWidth = ALPHABET_LIST.indexOf(letter) + (ALPHABET_LIST.indexOf(letter) + 1);
        assert maxWidth % 2 != 0;

        final int midPoint = (int) Math.ceil(maxWidth / 2);

        List<String> lines = new ArrayList<>();

        // loop through all letters
        for (int i = 0; i <= ALPHABET_LIST.indexOf(letter); i++) {
            if(i == 0) {
                char[] whiteSpace = getWhiteSpace(maxWidth);
                whiteSpace[midPoint] = ALPHABET_LIST.get(i);
                lines.add(new String(whiteSpace));
                continue;
            }

            char[] whiteSpace = getWhiteSpace(maxWidth);
            whiteSpace[midPoint - i] = ALPHABET_LIST.get(i);
            whiteSpace[midPoint + i] = ALPHABET_LIST.get(i);
            lines.add(new String(whiteSpace));
        }

        for(String line: lines) {
            System.out.println(line);
        }

        for(int i = lines.size() - 2; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }

    private static char[] getWhiteSpace(int length) {
        char[] charsArray = new char[length];
        Arrays.fill(charsArray, ' ');
        return charsArray;
    }
}