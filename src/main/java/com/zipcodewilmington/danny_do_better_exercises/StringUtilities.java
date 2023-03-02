package com.zipcodewilmington.danny_do_better_exercises;

import org.w3c.dom.ls.LSOutput;

import java.nio.file.LinkPermission;

/**
 * Created by dan on 6/14/17.
 */
public class StringUtilities {
    /**
     * @return `Hello World` as a string
     */
    public static String getHelloWorld() {
        return "Hello World";
    }
    public static String concatenation(String firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }
    /**
     * @param firstSegment a string to be added to
     * @param secondSegment a string to add
     * @return the concatenation of an integer, `firstSegment`, and a String, `secondSegment`
     */
    public static String concatenation(int firstSegment, String secondSegment){
        return firstSegment + secondSegment;
    }
    /**
     * @param input a string to be manipulated
     * @return the first 3 characters of `input`
     */
    public static String getPrefix(String input){
        return input.substring(0,3);
    }
    /**
     * @param input a string to be manipulated
     * @return the last 3 characters of `input`
     */
    public static String getSuffix(String input){
        return input.substring(2,5);
    }
    public static boolean compareTwoStrings(String inputValue, String comparableValue){
        return inputValue.equals(comparableValue);
    }
    public static Character getMiddleCharacter(String inputValue){
        String str = inputValue;
        int length = str.length();
        if (length % 2 == 0) {
            char ch1 = str.charAt((length/2-1));
            return ch1;
        } else {
            char ch = str.charAt(length/2);
            return ch;
        }
    }
    /**
     * @param spaceDelimitedString a string, representative of a sentence, containing spaces
     * @return the first sequence of characters
     */
    public static String getFirstWord(String spaceDelimitedString){
        int i = spaceDelimitedString.indexOf(" ");
        String firstWord = spaceDelimitedString.substring(0, i);
        return firstWord;
        /*String arr[] = spaceDelimitedString.split(" ", 2);
        String firstWord = arr[0];
        return firstWord; */
    }
    public static String getSecondWord(String spaceDelimitedString){
        return spaceDelimitedString.split(" ") [1];
       /* String arr[] = spaceDelimitedString.split(" ", 2);
        String SecondWord = arr[1];
        return SecondWord;*/
    }
    /**
     * @param stringToReverse
     * @return an identical string with characters in reverse order.
     */
    public static String reverse(String stringToReverse){
        StringBuilder backwards = new StringBuilder(stringToReverse);
        backwards.reverse();
        return backwards.toString();
    }
}
