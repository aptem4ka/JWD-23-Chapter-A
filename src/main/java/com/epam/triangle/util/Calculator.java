package com.epam.triangle.util;

import com.epam.triangle.entity.Dot;
import com.epam.triangle.entity.Triangle;

public class Calculator {

    public static double calculateVector(Dot dotA, Dot dotB)
    {
        return Math.sqrt((dotB.getX()-dotA.getX())*(dotB.getX()-dotA.getX())
                +(dotB.getY()-dotA.getY())*(dotB.getY()-dotA.getY()));
    }

    public static double calculatePerimeter(Triangle triangle)
    {
        return triangle.getSideA()+triangle.getSideB()+triangle.getSideC();
    }

    public static double calculateSquare(Triangle triangle)
    {
        double per=calculatePerimeter(triangle);

        return Math.sqrt(per*(per-triangle.getSideA())*
                (per-triangle.getSideB())*
                (per-triangle.getSideC()));

    }


}
