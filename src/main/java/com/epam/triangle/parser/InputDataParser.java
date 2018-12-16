package com.epam.triangle.parser;

public class InputDataParser {


    public static boolean parse(String input, String pattern) {
    if (input.matches(pattern))
        return true;
    else return false;
    }}
