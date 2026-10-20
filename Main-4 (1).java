/*
Name: Daniel Chung
ID: 1331774
Course: CSCI 125 Programming 1
Section: M01
Lab 8 Problems 1-5
*/

import java.util.Arrays;// This code converts utility methods into strings

public class Main {// This is the main class that would start all of the operations

    // Problem 1: Find a String at a Specific Position in an Array
    public static String FindStringAtPosition(String[] arr, int stringpos) {//This a method that takes an array of strings and return an integer at a specific position
        if (stringpos < 0 || stringpos >= arr.length) {// This line is making sure that the variable is less than zero preventing it from going out of bounds
            return "This String at this specific position is not within the boundaries";// This output would occur if the inputed values are out of bounds
        }// Closing if statement curly bracket
        return arr[stringpos];// The output would be returning the value of the variable as an output
    }// Closing curly bracket for Problem 1

    // Problem 2: Check String Existence in an Array
    public static boolean StringExists(String[] arr, String danielaimed) {//This a method that takes an array of strings and returns a boolean
        for (String world : arr) {// This is a for statement and the loop is used to process each element within an array
            if (world.equals(danielaimed)) {// This is an if statement indicating that if the two strings are equal to each other
                return true;// If the two strings are identical to each other, the string is true
            } //Closing if statement curly bracket
        }// Closing for statement closing bracket
        return false;// Otherwise if neither results occur, the false statement will be activated
    }// Closing curly bracket for Problem 2

    //Problem 3: Compare Two String Arrays
    public static boolean ArraysEqual(String[] danielfirstArray, String[] danielsecondArray) {//This a method that takes an array of strings and return a boolean statement
        if (danielfirstArray.length != danielsecondArray.length) {//// This is an if statement indicating that if the two strings are not equal to each other
            return false;//If the two strings are identical to each other, the string is false
        }// Closing if statetment
        for (int d = 0; d < danielfirstArray.length; d++) {// This loop examines all of the elements in the array, stopping the loops when all increments are tested
            if (!danielfirstArray[d].equals(danielsecondArray[d])) {// This if statement identifies if the index d in both variables are not equal to each other
                return false;// If they are not equal, the outcome is false
            }// Closing if statement curly bracket
        }// Closing for statement curly bracket
        return true;// Otherwise, if the inputs are equal, the outcome is true
    }// Closing curly bracket for comparing two string arrays

    //Problem 4: Palindrome Checker for String Arrays
    public static boolean PalindromeChecker(String[] furtherargument){//This a method that takes an array of strings and return a boolean
        for (int c = 0; c < furtherargument.length / 2; c++){//// This loop examines all of the elements in the array, stopping the loops when all increments are tested
            if (!furtherargument[c].equals(furtherargument[furtherargument.length - 1 - c])){// This line checks if the string at index c is not equal to the strong at a mirrored position
                return false;// If this is the case, the output is false
            }// Closing if statement curly bracket
        }// Closing for statement curly bracket
        return true;// Otherwise if the index c happen to be equal, the outcome is true
    }// Closing curly bracket for Problem 4

    //Problem 5: Reverse String Array
    public static String[] ReverseArray(String[] danielsequences) {//This a method that takes an array of strings and return an integer at a specific position
        String[] changed = new String[danielsequences.length];// This creates a new strong with the same length of the previous array
        int dc = 0;// The variable dc is being set to 0
        for (int nc = danielsequences.length - 1; nc >= 0; nc--) {// This line intializes a loop through a reverse set within an array
            changed[dc] = danielsequences[nc];// This line assigns the value of the index dc at a different array
            dc++;//This line increases the increment of the variable dc by 1
        }// closing curly bracket for the for statement
        return changed;// The output will be the value assigned to the changed variable
    }// The closing curly bracket for Problem 5



    public static void main(String[] args) {// This line of code is utilized to start all arguments
        String[] words = {"hello", "world", "java"};// This introduces a string array with three elements of words
        int position = 2;// The integer variable has a value of 2
        String result = FindStringAtPosition(words, position);//This returns string back into a specific location set to the variable
        System.out.println(result);// The output of the code would be the value of the variable 'results'

        String[] danielvariables = {"apple", "banana", "cherry"};// This introduces a string array with three elements of words
        String identity = "banana";// This takes a string labeled at identity sets is equal to the text in the green
        boolean variabletypes = StringExists(danielvariables, identity);//This takes a method into two parameters, into a string and an array
        System.out.println(variabletypes);//The output of the code would be the value of the variable 'variabletypes'

        String[] firstorderofsystems = {"java", "python"};//This introduces a string array with two elements of words
        String[] secondorderofsystems = {"java", "python"};//This introduces a string array with two elements of words
        boolean function = ArraysEqual(firstorderofsystems, secondorderofsystems);//This takes a method into two parameters, into a string and an array
        System.out.println(function);//The output of the code would be the value of the variable 'function'

        String[] danielPalindrome = {"racecar", "level", "madam"};//This introduces a string array with three elements of words
        System.out.println(PalindromeChecker(danielPalindrome));// The output verifies a collection of strings, taking valued and producing the outcome

        String[] danielsequences = {" hello ", " world ", " java "};// This introduces a string array with three elements of words
        String[] iphonerule = ReverseArray(danielsequences);// This is a method that takes an array as an input
        for (String cpu : iphonerule) {// This is a loop that goes through each element within the array using a for statement
            System.out.println("\"" + cpu + "\"");// This provides the output revolving around the variable of 'cpu' with the double quotes
        }// Closing the for statement with a curly bracket
    }//Closing all of the string argument results with a curly bracket
}// Closing the overall class of this lab problems and solutions with a curly bracket












