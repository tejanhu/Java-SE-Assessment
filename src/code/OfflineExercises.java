package code;

import java.util.ArrayList;

public class OfflineExercises {

    // Given a string, return a string where
    // for every char in the original,
    // there are two chars.

    // doubleChar("The") → "TThhee"
    // doubleChar("AAbb") → "AAAAbbbb"
    // doubleChar("Hi-There") → "HHii--TThheerree"

    public String doubleChar(String input) {
        return "";
    }
    //
    // A sandwich is two pieces of bread with something in between. Return the
    // string that is between the first and last appearance of "bread" in the
    // given string, or return the empty string "" if there are not two pieces
    // of bread.

    // getSandwich("breadjambread") → "jam"
    // getSandwich("xxbreadjambreadyy") → "jam"
    // getSandwich("xxbreadyy") → ""

    public String getSandwich(String input) {

        String wordAppear1 = "";
        String wordAppear2 = "";
        String wordInBetween;

        wordAppear1 = input.substring(0, 5);

        char[] letters = input.toCharArray();

        char beginningLetter = input.charAt(0);
        char endingLetter = input.charAt(input.length() - 1);

        String word = "";


        String wordStored;

        for (int i = 0; i < input.length(); i++) {
//            System.out.println(letters[i]);
            if (input.charAt(i) == beginningLetter && input.charAt(i) == endingLetter) {
                continue;
            } else {
                word = word + input.charAt(i);
            }
        }






        wordAppear2 = input.substring(input.length() - 5);

        return word;
//        return "";
    }

    // Given three ints, a b c, one of them is small, one is medium and one is
    // large. Return true if the three values are evenly spaced, so the
    // difference between small and medium is the same as the difference between
    // medium and large.

    // evenlySpaced(2, 4, 6) → true
    // evenlySpaced(4, 6, 2) → true
    // evenlySpaced(4, 6, 3) → false

    public boolean evenlySpaced(int a, int b, int c) {

        int large;
        int small;
        int medium;
        if (a > b && a > c) {
            large = a;
            if (b > c) {
                medium = b;
                small = c;
            } else {
                medium = c;
                small = b;
            }
        } else if (b > a && b > c) {
            large = b;
            if (a > c) {
                medium = a;
                small = c;
            } else {
                medium = c;
                small = a;
            }
        } else {
            large = c;
            if (a > b) {
                medium = a;
                small = b;
            } else {
                medium = b;
                small = a;
            }
        }

        int diffLargeAndMed = large - medium; //large and medium
        int diffMedAndSmall = medium - small; //small and medium


        if (diffLargeAndMed == diffMedAndSmall) {

            return true;

        }
        return false;


    }


    // Given a string and an int n, return a string made of the first and last n
    // chars from the string. The string length will be at least n.

    // nTwice("Hello", 2) → "Helo"
    // nTwice("Chocolate", 3) → "Choate"
    // nTwice("Chocolate", 1) → "Ce"

    public String nTwice(String input, int a) {
        String frontString = "";
        String backString = "";
        String newString;

        frontString = input.substring(0, a);
        backString = input.substring(input.length() - a);

        newString = frontString + backString;

        return newString;
    }

    // Given a string, return true if it ends in "ly".

    // endsLy("oddly") → true
    // endsLy("y") → false
    // endsLy("oddy") → false

    public boolean endsly(String input) {

        return input.endsWith("ly") ? true : false;

    }

    // Given a string, return recursively a "cleaned" string where adjacent
    // chars that are the same have been reduced to a single char. So "yyzzza"
    // yields "yza".

    // stringClean("yyzzza") → "yza"
    // stringClean("abbbcdd") → "abcd"
    // stringClean("Hello") → "Helo"
    public String stringClean(String input) {
        String newString="";
        for (int i = 0; i <input.length(); i++) {
            if(input.charAt(i)==input.charAt(i+1)){
                newString += input.charAt(i+2);
            }
        }
        System.out.println(newString);

        return newString;

    }

    // The fibonacci sequence is a famous bit of mathematics, and it happens to
    // have a recursive definition. The first two values in the sequence are 0
    // and 1 (essentially 2 base cases). Each subsequent value is the sum of the
    // previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
    // 21 and so on. Define a recursive fibonacci(n) method that returns the nth
    // fibonacci number, with n=0 representing the start of the sequence.

    // fibonacci(0) → 0
    // fibonacci(1) → 1
    // fibonacci(2) → 1

    public int fibonacci(int input) {
        if (input == 0) {
            return 0;
        }
        if (input == 1) {
            return 1;
        } else {
            return input + (fibonacci(input - 2));
        }


    }

    // We have a number of bunnies and each bunny has two big floppy ears. We
    // want to compute the total number of ears across all the bunnies
    // recursively (without loops or multiplication).
    //
    // bunnyEars(0) → 0
    // bunnyEars(1) → 2
    // bunnyEars(2) → 4

    public int bunnyEars(int input) {

        if (input == 0) {
            return 0;
        }
        if(input==1){
            return 2;
        }
        else {
            return input * bunnyEars(input);
        }

    }



}
