package com.epam.triangle.util.create;


import com.epam.triangle.entity.action.ChooseAction;


public class FigureCreateManager {

    public FigureCreator getCreator(ChooseAction action, String dataSource){
        FigureCreator creator=null;
        if (action==ChooseAction.CREATE_TRIANGLE)
            creator=new TriangleCreator(dataSource);

        //other entity creators

        return creator;
    }

}

