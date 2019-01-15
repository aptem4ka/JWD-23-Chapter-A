package com.epam.triangle.util.read;

import com.epam.triangle.entity.action.ChooseAction;
import com.epam.triangle.exception.ReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ReadTriangle implements Reader {
    private String filepath;
    private final String PATTERN="(-?\\d+\\.\\d+)|-?\\d+";


    private final static Logger logger= LogManager.getLogger(ReadTriangle.class.getName());


    public ReadTriangle(String filepath) {
        this.filepath = filepath;

    }

    @Override
    public ArrayList<String> takeData() throws ReaderException {
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
                validateInput(line,rightCoordinats);
                if (rightCoordinats.size()==ChooseAction.CREATE_TRIANGLE.getAmount()) {
                    accept=false;
                }
            }
        }catch (IOException e) {
            logger.error("Read error, check input data source");
            throw new ReaderException(e);
        }
        if (rightCoordinats.size()==6)
            return rightCoordinats;
        else {logger.error("Not enough data to create a entity");
            throw new ReaderException();
        }
    }

    private void validateInput(String[] line, List<String> rightCoordinats)
    {
        if (line.length == ChooseAction.CREATE_TRIANGLE.getAmount()) {
            for (String x : line) {
                if (x.matches(PATTERN))
                    rightCoordinats.add(x);
                else {
                    rightCoordinats.clear();
                    break;
                }
            }
        }
    }
}