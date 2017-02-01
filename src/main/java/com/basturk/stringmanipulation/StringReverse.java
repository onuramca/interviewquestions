package main.java.com.basturk.stringmanipulation;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by: onur
 * Date: 2/1/17
 */
public class StringReverse {

    public static void main(String args[]) throws FileNotFoundException, IOException {

        //original string
        String str = "Sony is going to introduce Internet TV soon";
        System.out.println("Original String: " + str);

        //reversed string using Stringbuffer
        String reverseStr = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse String in Java using StringBuffer: " + reverseStr);

        //iterative method to reverse String in Java
        reverseStr = reverse(str);
        System.out.println("Reverse String in Java using Iteration: " + reverseStr);

        //recursive method to reverse String in Java
        reverseStr = reverseRecursively(str);
        System.out.println("Reverse String in Java using Recursion: " + reverseStr);

    }

    public static String reverse(String str) {
        StringBuilder strBuilder = new StringBuilder();
        char[] strChars = str.toCharArray();

        for (int i = strChars.length - 1; i >= 0; i--) {
            strBuilder.append(strChars[i]);
        }

        return strBuilder.toString();
    }

    public static String reverseRecursively(String str) {

        //base case to handle one char string and empty string
        if (str.length() < 2) {
            return str;
        }

        return reverseRecursively(str.substring(1)) + str.charAt(0);

    }

    /* * Method to reverse words in String in Java */
    public static String reverseWords(String sentence) {
        List<String> words = Arrays.asList(sentence.split("\\s"));
        Collections.reverse(words);
        StringBuilder sb = new StringBuilder(sentence.length());
        for (int i = words.size() - 1; i >= 0; i--) {
            sb.append(words.get(i));
            sb.append(' ');
        }
        return sb.toString().trim();
    }

    public static String reverseString(String line) {
        if (line.trim().isEmpty()) {
            return line;
        }
        StringBuilder reverse = new StringBuilder();
        String[] sa = line.trim().split("\\s");
        for (int i = sa.length - 1; i >= 0; i--) {
            reverse.append(sa[i]);
            reverse.append(' ');
        }
        return reverse.toString().trim();
    }


}
