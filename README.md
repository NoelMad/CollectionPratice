# Java Collections Practice

## Overview
This program demonstrates usage of Java Collections including ArrayList, Vector, Iterators, and Lists.

---

## Practice Problems

### 1. Create an ArrayList<Integer> and add 5 integers
- Creates an ArrayList
- Adds 5 integer values
- Prints the list

---

### 2. Convert a Vector<String> to an ArrayList<String>
- Creates a Vector containing strings
- Converts it into an ArrayList using constructor

---

### 3. Remove all even numbers using an Iterator
- Uses Iterator to safely remove elements while looping
- Removes all numbers divisible by 2

---

### 4. Why Vector May Be Slower Than ArrayList

Vector is synchronized by default, meaning it is thread-safe.  
Because of this, Vector performs additional locking which reduces performance.  
ArrayList is not synchronized, making it faster for single-threaded environments.

---

## Challenge Problem

### Find Longest String in a List

### Method Implementation

```java
public static String findLongestString(List<String> list) {
    String longest = "";

    for (String word : list) {
        if (word.length() > longest.length()) {
            longest = word;
        }
    }

    return longest;
}
