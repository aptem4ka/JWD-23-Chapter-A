package com.epam.triangle.creator;

import com.epam.triangle.enums.ChooseAction;

public class FigureCreateManager {

    public FigureCreator getCreator(ChooseAction action, String dataSource){
        FigureCreator creator=null;
        if (action==ChooseAction.CREATE_TRIANGLE)
            creator=new TriangleCreator(dataSource);

    //other figure creators

    return creator;
    }

}
