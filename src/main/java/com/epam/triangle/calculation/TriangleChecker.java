package com.epam.triangle.calculation;

import com.epam.triangle.figure.Triangle;
import com.epam.triangle.view.Printer;

import java.util.ArrayList;
import java.util.Collections;

public class TriangleChecker {
    private Triangle triangle;

    public TriangleChecker(Triangle triangle) {
        this.triangle = triangle;
    }

    public boolean isTriangle()
    {   boolean x= triangle.getSideA()+triangle.getSideB()>triangle.getSideC();
        boolean y=triangle.getSideB()+triangle.getSideC()>triangle.getSideA();
        boolean z=triangle.getSideA()+triangle.getSideC()>triangle.getSideB();

        if (x&&y&&z)
        {
            System.out.println("This figure is a triangle");
            return true;}
        else {
            System.out.println("this figure is not a triangle");
            return false;}
    }


    public boolean isIsosceles()
    {
        double A=triangle.getSideA();
        double B=triangle.getSideB();
        double C=triangle.getSideC();
        if (A==B && A!=C || A==C && A!=B || B==C && B!=A)
        {
            Printer.print("This triangle is isosceles");
            return true;
        }
        else {Printer.print("This triangle is not isosceles");
            return false;}
    }

    public boolean isEquiangular()
    {
        double A=triangle.getSideA();
        double B=triangle.getSideB();
        double C=triangle.getSideC();
        if (A==B && A==C)
        {
            Printer.print("This triangle is equiangular");
            return true;
        }
        else {Printer.print("This triangle is not equiangular");
            return false;}
    }

    public String isRightAngled()
    {
        Printer.print("The parameters of the triangle are: \n"+triangle.toString());
        double A=Math.pow(triangle.getSideA(),2);
        double B=Math.pow(triangle.getSideB(),2);
        double C=Math.pow(triangle.getSideC(),2);
        double max;

        ArrayList<Double> list=new ArrayList();
        list.add(A);
        list.add(B);
        list.add(C);
        Collections.sort(list);

        if (list.get(2)>list.get(1)+list.get(0))
        {Printer.print("This triangle is abtuse");
            return "abtuse";}
        else if (list.get(2)==list.get(1)+list.get(0))
        {Printer.print("This triangle is right angled");
            return "right";}
        else if (list.get(2)<list.get(1)+list.get(0))
        {Printer.print("This triangle is acute");
            return "acute";}
            else return null;

    }



}
