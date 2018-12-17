package com.epam.triangle.reader;

import com.epam.triangle.exception.ReaderException;

import java.io.File;

public class ReaderFactory {
    private static final ReaderFactory instance=new ReaderFactory();

    private ReaderFactory() {
    }

    public static ReaderFactory getInstance(){
        return instance;
    }

    public ReadTriangle getReadTriangle(String filepath) throws ReaderException
    {
        File file=new File(filepath);
        if (file.exists())
            return new ReadTriangle(filepath);
        else throw new ReaderException("File "+filepath+" doesn't exist");

    }





}
