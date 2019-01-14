package com.epam.triangle.creator;

import com.epam.triangle.figure.action.ChooseAction;
import com.epam.triangle.exception.CreatorException;
import com.epam.triangle.exception.ReaderException;
import com.epam.triangle.figure.Figure;
import org.testng.annotations.Test;


public class TriangleCreatorTest {

@Test
    public void testTriangleCreator() throws CreatorException, ReaderException {

    FigureCreator creator= new FigureCreateManager().getCreator(ChooseAction.CREATE_TRIANGLE,"InputData.txt");
    Figure triangle=creator.create();


}
}
