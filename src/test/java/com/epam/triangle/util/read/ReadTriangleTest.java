package com.epam.triangle.util.read;

import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

public class ReadTriangleTest {

    @Test
    public void testTakeData() throws Exception {

        String filepath=this.getClass().getClassLoader().getResource("InputData.txt").getPath();
        Reader reader= ReaderFactory.getInstance()
                .getReadTriangle(filepath);
        ArrayList<String> strings=reader.takeData();
        for (String x: strings)
            System.out.println(x);

    }

    }
