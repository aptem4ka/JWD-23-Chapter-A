package com.epam.triangle.reader;

public class ReaderFactory {
    private static final ReaderFactory instance=new ReaderFactory();

    private ReaderFactory() {
    }

    public static ReaderFactory getInstance(){
        return instance;
    }

    public ReadTriangle getReadTriangle(String filepath, String pattern)
    {
        return new ReadTriangle(filepath,pattern);
    }





}