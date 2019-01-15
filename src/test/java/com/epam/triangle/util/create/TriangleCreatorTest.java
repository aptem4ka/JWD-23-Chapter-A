package com.epam.triangle.util.create;

import com.epam.triangle.entity.Triangle;
import com.epam.triangle.entity.action.ChooseAction;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleCreatorTest {

    @Test
    public void testCreate() throws Exception {
        String filepath=this.getClass().getClassLoader().getResource("InputData.txt").getPath();
    FigureCreateManager figureCreateManager=new FigureCreateManager();
    FigureCreator figureCreator=figureCreateManager.getCreator(ChooseAction.CREATE_TRIANGLE,filepath);

        Triangle triangle=(Triangle)figureCreator.create();
        System.out.println(triangle);

    }
}