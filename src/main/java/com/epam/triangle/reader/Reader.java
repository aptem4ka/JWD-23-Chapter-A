package com.epam.triangle.reader;

import com.epam.triangle.exception.ReaderException;

import java.util.ArrayList;

public interface Reader {

    ArrayList<String> takeData() throws ReaderException;



}
