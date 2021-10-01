package baseline;
/*
 *  UCF COP3330 Fall 2021 Assignment 3 Solutions
 *  Copyright 2021 Gabriel Telleria
 */

import java.util.Arrays;
import java.util.Scanner;

public class Solution24 {
    private static final Scanner input = new Scanner(System.in);
    //check if lengths are equal
    private static boolean checkLength(String word1, String word2){
        if(word1.length() == word2.length()){
            return true;
        }
        return false;
    }
    //    check if characters are equal
    private static boolean checkCharacters(String word1, String word2) {
        char[] first = new char[word1.length()];
        char[] second = new char[word2.length()];
        for (int i = 0; i < word1.length(); i++) {
            first[i] = word1.charAt(i);
            second[i] = word2.charAt(i);
        }
        //sort <word1>
        Arrays.sort(first);
        //sort <word2>
        Arrays.sort(second);
        for (int i = 0; i < first.length; i++) {
            if(first[i] != second[i]){
                return false;
            }
        }
        return true;
    }
    // check if words are anagrams
    public static boolean isAnagram(String word1, String word2){
        return (checkLength(word1, word2) && checkCharacters(word1, word2));
    }

    public static void main(String[] args) {
        //Print "Enter two strings, and I'll tell you if they are anagrams:"
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        //Prompt "Enter the first string: "
        //    save input into <word1>
        System.out.print("Enter the first string: ");
        String word1 = input.nextLine();
        //Prompt "Enter the second string: "
        //    save input into <word2>
        System.out.print("Enter the second string: ");
        String word2 = input.nextLine();
        // if <word1> and <word2> are anagrams
        //    Print "<word1> and <word2> are anagrams."
        if(isAnagram(word1, word2)){
            System.out.printf("\"%s\" and \"%s\" are anagrams.", word1, word2);
        }
        //    else
        //    "<word1> and <word2> are  not anagrams."
        else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", word1, word2);
        }
    }
}
