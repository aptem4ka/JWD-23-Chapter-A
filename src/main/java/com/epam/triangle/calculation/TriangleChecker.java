package com.epam.triangle.calculation;

import com.epam.triangle.figure.Triangle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TriangleChecker {
    private Triangle triangle;
    private double sideA;
    private double sideB;
    private double sideC;

    public TriangleChecker(Triangle triangle) {
        this.triangle = triangle;
        sideA= triangle.getSideA();
        sideB=triangle.getSideB();
        sideC=triangle.getSideC();
    }

    public boolean isTriangle()
    {   boolean x= triangle.getSideA()+triangle.getSideB()>triangle.getSideC();
        boolean y=triangle.getSideB()+triangle.getSideC()>triangle.getSideA();
        boolean z=triangle.getSideA()+triangle.getSideC()>triangle.getSideB();

        return (x&&y&&z);
    }

    public boolean isIsosceles()
    {
        return (sideA==sideB && sideA!=sideC || sideA==sideC && sideA!=sideB
                || sideB==sideC && sideB!=sideA);
    }

    public boolean isEquiangular()
    {
        return (sideA==sideB && sideA==sideC);
    }

    public boolean isAbtuse(){
        List<Double> squareSides=squaredSides();
        return (squareSides.get(2)>squareSides.get(1)+squareSides.get(0));
    }

    public boolean isRightAngled(){
        List<Double> squareSides=squaredSides();
        return (squareSides.get(2)==squareSides.get(1)+squareSides.get(0));
    }

    public boolean isAcute(){
        List<Double> squareSides=squaredSides();
        return (squareSides.get(2)<squareSides.get(1)+squareSides.get(0));
    }

    private List<Double> squaredSides(){
        double a=Math.pow(sideA,2);
        double b=Math.pow(sideB,2);
        double c=Math.pow(sideC,2);
        double max;

        ArrayList<Double> list=new ArrayList();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list);
        return list;
    }
}
