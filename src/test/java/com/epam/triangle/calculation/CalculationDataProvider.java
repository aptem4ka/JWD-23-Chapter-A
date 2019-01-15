package com.epam.triangle.calculation;

import com.epam.triangle.entity.Triangle;
import org.testng.annotations.DataProvider;

public class CalculationDataProvider {

    @DataProvider (name = "triangleParams")
    public Object[][] calculateTestData(){
        return new Object[][]{
                {new Triangle(3, 6.4, 11),false},
                {new Triangle(5,9,6), true}
        };
    }

    @DataProvider (name = "isoscelesParams")
    public Object[][] isoscelesTestData(){
        return new Object[][]{
                {new Triangle(11, 4, 7),false},
                {new Triangle(5,9,6), false},
                {new Triangle(10,10,8.45), true},
                {new Triangle(25,21.130913,25), true}
        };
    }

    @DataProvider (name = "equiandularParams")
    public Object[][] isEquiangularTestData(){
        return new Object[][]{
                {new Triangle(10, 10, 8.45),false},
                {new Triangle(25,21.130913,25), false},
                {new Triangle(10,10,10), true},
                {new Triangle(25,25,25), true}
        };
    }



}


