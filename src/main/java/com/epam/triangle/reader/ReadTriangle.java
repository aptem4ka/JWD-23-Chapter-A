package com.epam.triangle.reader;

import com.epam.triangle.enums.ChooseAction;
import com.epam.triangle.exception.ReaderException;
import com.epam.triangle.parser.InputDataParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class ReadTriangle implements Reader {
    String filepath;
    private final String PATTERN;
                                        //"(-?\\d+\\.\\d+)|-?\\d+";

    final static Logger logger= LogManager.getLogger(ReadTriangle.class.getName());


    public ReadTriangle(String filepath, String pattern) {
        this.filepath = filepath;
        this.PATTERN=pattern;
    }

    @Override
    public ArrayList<String> getData() throws ReaderException {
        return readCoordinats();
    }

    private ArrayList<String> readCoordinats() throws ReaderException{
        String delimeter=" ";
        ArrayList<String> rightCoordinats=new ArrayList<>();
        boolean accept=true;
        try {
            BufferedReader br = new BufferedReader(new FileReader(filepath));
            while (br.ready()&&accept) {
                String[] line = br.readLine().split(delimeter);

                if (line.length == ChooseAction.CREATE_TRIANGLE.getAmount()) {
                    for (String x : line) {
                        if (InputDataParser.parse(x, PATTERN))
                            rightCoordinats.add(x);
                        else {
                            rightCoordinats.clear();
                            break;
                        }
                    }
                } if (rightCoordinats.size()==ChooseAction.CREATE_TRIANGLE.getAmount()) accept=false;
            }
        }catch (IOException e) {
            logger.error("Read error, check input data source");
            throw new ReaderException(e);

        }

        if (rightCoordinats.size()==6)
            return rightCoordinats;
        else {logger.error("Not enough data to create a figure");
            throw new ReaderException();
        }
    }
}
