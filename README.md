# Java String Array Operations

**Author:** Daniel Chung  
**Course:** CSCI 125 – Programming I  
**Section:** M01  
**Institution:** New York Institute of Technology  
**Language:** Java

## Overview

This project explores five fundamental operations on string arrays using reusable Java methods. It demonstrates array indexing, iteration, string comparison, boundary checking, and creating reversed arrays while preserving the original data.

The main method runs predefined examples for each operation. No keyboard input is required.

## Methods

| Method | Purpose |
|--------|---------|
| `FindStringAtPosition(String[] arr, int stringpos)` | Returns the string at a specified index or a message if the index is out of bounds. |
| `StringExists(String[] arr, String danielaimed)` | Searches an array for an exact string match. |
| `ArraysEqual(String[] danielfirstArray, String[] danielsecondArray)` | Checks whether two arrays have equal lengths and matching strings in the same order. |
| `PalindromeChecker(String[] furtherargument)` | Checks whether the sequence of strings reads the same forward and backward. |
| `ReverseArray(String[] danielsequences)` | Creates a new array containing the original strings in reverse order. |

## Features

### 1. Retrieve a String by Index

Uses zero-based indexing to retrieve an array element.

For the array:

```text
["hello", "world", "java"]
```

Index `2` returns `"java"`.

Negative indexes and indexes greater than or equal to the array length return an explanatory message.

### 2. Search for a String

Uses a linear search and `String.equals()` to check each element against a target string.

Example:

```text
Array:  ["apple", "banana", "cherry"]
Target: "banana"
Result: true
```

Matching is case-sensitive.

### 3. Compare Two Arrays

Checks that both arrays have the same length, then compares their strings at corresponding indexes.

Example:

```text
First:  ["java", "python"]
Second: ["java", "python"]
Result: true
```

Arrays containing the same strings in a different order are not considered equal.

### 4. Check for a Palindrome Sequence

Compares strings at mirrored positions, moving inward from the ends of the array.

This checks the order of whole strings, not whether each individual word is a palindrome.

For example:

```text
["java", "python", "java"] → true
["racecar", "level", "madam"] → false
```

The second example returns false because `"racecar"` and `"madam"` do not match, even though each word is individually a palindrome.

### 5. Reverse an Array

Creates a new array and copies the elements into reverse order.

Example:

```text
Original: ["hello", "world", "java"]
Reversed: ["java", "world", "hello"]
```

The original array is unchanged. Characters within each string are not reversed, and existing spaces are preserved.

## Concepts Practiced

- One-dimensional string arrays
- Zero-based indexing
- Array boundary checks
- Static methods
- Parameters and return values
- Standard and enhanced for loops
- Linear searching
- Case-sensitive string comparison
- Boolean logic and early returns
- Mirrored-index comparisons
- Creating and populating new arrays

## How to Run

### Requirements

Install a Java Development Kit (JDK) with `javac` and `java` available in your terminal. No external libraries are required.

### Prepare the File

Rename `Main-4 (1).java` to `Main.java` because the source declares `public class Main`.

Keep it in its own project folder to avoid conflicts with other programs named Main.

### Compile

```sh
javac Main.java
```

### Run

```sh
java Main
```

The program runs all five demonstrations automatically. To try different examples, edit the arrays and target values in the main method and recompile.

## Expected Output

```text
java
true
true
false
" java "
" world "
" hello "
```

The spaces inside the quoted strings are present in the original demonstration data and are preserved during reversal.

## Current Limitations

- The methods do not validate null array references.
- Methods that call `equals()` on array elements can fail if those elements are null.
- String comparisons are case-sensitive and do not ignore surrounding spaces.
- Invalid-index retrieval returns an error message as a string rather than throwing an exception.
- Demonstration inputs are hardcoded.

## Learning Objective

Practice accessing, searching, comparing, and transforming string arrays while organizing each operation into a reusable method.
