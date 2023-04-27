package com.example.junit5itacademystarter;

public class StringFormatting {

    public String reverse(String string) {
        return String.valueOf(new StringBuilder(string).reverse());
    }

    public String toUpperString(String str) {
        return str.toUpperCase();
    }

    public Boolean isPalindrome(String str) {
        StringBuilder stringBuilder1 = new StringBuilder(str).reverse();

        return stringBuilder1.toString().equals(str);

    }
}
