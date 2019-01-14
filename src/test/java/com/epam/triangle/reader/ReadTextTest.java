package com.epam.triangle.reader;


import com.epam.triangle.exception.ReaderException;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class ReadTextTest {

    @Test
    public void testGetData() throws ReaderException {
        Reader reader= ReaderFactory.getInstance()
                .getReadTriangle("InputData.txt");
        ArrayList<String> strings=reader.takeData();
        for (String x: strings)
            System.out.println(x);
    }
}