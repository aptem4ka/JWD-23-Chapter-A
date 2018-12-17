package com.epam.triangle.creator;

import com.epam.triangle.exception.CreatorException;
import com.epam.triangle.exception.ReaderException;
import com.epam.triangle.figure.Figure;

public abstract class FigureCreator {
    protected String dataSource;

    public FigureCreator(String dataSource)  {
        this.dataSource = dataSource;
    }

    public abstract Figure create() throws CreatorException, ReaderException;

}

