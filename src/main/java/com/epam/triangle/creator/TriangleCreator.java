package com.epam.triangle.creator;

import com.epam.triangle.calculation.Calculator;
import com.epam.triangle.calculation.TriangleChecker;
import com.epam.triangle.exception.CreatorException;
import com.epam.triangle.exception.ReaderException;
import com.epam.triangle.figure.Dot;
import com.epam.triangle.figure.Figure;
import com.epam.triangle.figure.Triangle;
import com.epam.triangle.reader.Reader;
import com.epam.triangle.reader.ReaderFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;

public class TriangleCreator extends FigureCreator {
private ArrayList<String> coordinates;
private static final Logger logger= LogManager.getLogger(TriangleCreator.class.getName());

    public TriangleCreator(String dataSource) {
        super(dataSource);
    }

    @Override
    public Figure create() throws CreatorException {
        Reader reader=ReaderFactory.getInstance()
                .getReadTriangle(this.dataSource);
    try {
        coordinates = reader.getData();
        }catch (ReaderException e){
        logger.error("Error due to getting coordinates data");
        throw new CreatorException(e);
    }
        Dot[] dots=dotCreator(coordinates);
        double[] vectors=findVectors(dots);

        Triangle triangle=new Triangle(vectors[0],vectors[1],vectors[2]);
        TriangleChecker triangleChecker=new TriangleChecker(triangle);
        if (triangleChecker.isTriangle())
        return triangle;
        else throw new CreatorException("This figure is not a triangle");

    }

    private Dot[] dotCreator(ArrayList<String> coordinates){
        Dot[] dots=new Dot[3];
        dots[0]=new Dot(Double.parseDouble(coordinates.get(0)),Double.parseDouble(coordinates.get(1)));
        dots[1]=new Dot(Double.parseDouble(coordinates.get(2)),Double.parseDouble(coordinates.get(3)));
        dots[2]=new Dot(Double.parseDouble(coordinates.get(4)),Double.parseDouble(coordinates.get(5)));
    return dots;
    }

    private double[] findVectors(Dot[] dots){
        double[] vectors=new double[3];

        vectors[0]= Calculator.calculateVector(dots[0],dots[1]);
        vectors[1]= Calculator.calculateVector(dots[1],dots[2]);
        vectors[2]= Calculator.calculateVector(dots[0],dots[2]);

        return vectors;
    }

}
