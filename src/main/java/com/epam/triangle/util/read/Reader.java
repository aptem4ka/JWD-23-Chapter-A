package com.epam.triangle.util.read;

import com.epam.triangle.exception.ReaderException;

import java.util.ArrayList;

public interface Reader {

    ArrayList<String> takeData() throws ReaderException;

}