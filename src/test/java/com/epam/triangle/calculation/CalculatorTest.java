package com.epam.triangle.calculation;

import com.epam.triangle.creator.FigureCreateManager;
import com.epam.triangle.creator.FigureCreator;
import com.epam.triangle.enums.ChooseAction;
import com.epam.triangle.exception.CreatorException;
import com.epam.triangle.exception.ReaderException;
import com.epam.triangle.figure.Figure;
import com.epam.triangle.figure.Triangle;
import com.epam.triangle.view.Printer;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static com.epam.triangle.calculation.Calculator.calculateSquare;
import static org.testng.Assert.*;

public class CalculatorTest {
private Triangle triangle;

    @BeforeClass
    public void initTriangle() throws CreatorException, ReaderException {
        FigureCreateManager figureCreateManager=new FigureCreateManager();
        FigureCreator creator= figureCreateManager.getCreator(ChooseAction.CREATE_TRIANGLE,"InputData.txt");
        triangle=(Triangle)creator.create();

    }

    @Test
    public void testCalculatePerimeter() {

        Printer.print(String.valueOf(Calculator.calculatePerimeter(triangle)));
    }

    @Test
    public void testCalculateSquare() {

        Printer.print(String.valueOf(Calculator.calculateSquare(triangle)));
    }
}